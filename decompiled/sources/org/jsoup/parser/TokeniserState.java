package org.jsoup.parser;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jsoup.nodes.DocumentType;
import org.jsoup.parser.Token;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public enum TokeniserState {
    Data { // from class: org.jsoup.parser.TokeniserState.1
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char current = characterReader.current();
            if (current != 0) {
                if (current != '&') {
                    if (current != '<') {
                        if (current != 65535) {
                            tokeniser.emit(characterReader.consumeData());
                            return;
                        } else {
                            tokeniser.emit(new Token.EOF());
                            return;
                        }
                    }
                    tokeniser.advanceTransition(TokeniserState.TagOpen);
                    return;
                }
                tokeniser.advanceTransition(TokeniserState.CharacterReferenceInData);
                return;
            }
            tokeniser.error(this);
            tokeniser.emit(characterReader.consume());
        }
    },
    CharacterReferenceInData { // from class: org.jsoup.parser.TokeniserState.2
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.readCharRef(tokeniser, TokeniserState.Data);
        }
    },
    Rcdata { // from class: org.jsoup.parser.TokeniserState.3
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char current = characterReader.current();
            if (current != 0) {
                if (current != '&') {
                    if (current != '<') {
                        if (current != 65535) {
                            tokeniser.emit(characterReader.consumeData());
                            return;
                        } else {
                            tokeniser.emit(new Token.EOF());
                            return;
                        }
                    }
                    tokeniser.advanceTransition(TokeniserState.RcdataLessthanSign);
                    return;
                }
                tokeniser.advanceTransition(TokeniserState.CharacterReferenceInRcdata);
                return;
            }
            tokeniser.error(this);
            characterReader.advance();
            tokeniser.emit(TokeniserState.replacementChar);
        }
    },
    CharacterReferenceInRcdata { // from class: org.jsoup.parser.TokeniserState.4
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.readCharRef(tokeniser, TokeniserState.Rcdata);
        }
    },
    Rawtext { // from class: org.jsoup.parser.TokeniserState.5
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.readRawData(tokeniser, characterReader, this, TokeniserState.RawtextLessthanSign);
        }
    },
    ScriptData { // from class: org.jsoup.parser.TokeniserState.6
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.readRawData(tokeniser, characterReader, this, TokeniserState.ScriptDataLessthanSign);
        }
    },
    PLAINTEXT { // from class: org.jsoup.parser.TokeniserState.7
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char current = characterReader.current();
            if (current != 0) {
                if (current != 65535) {
                    tokeniser.emit(characterReader.consumeTo((char) 0));
                    return;
                } else {
                    tokeniser.emit(new Token.EOF());
                    return;
                }
            }
            tokeniser.error(this);
            characterReader.advance();
            tokeniser.emit(TokeniserState.replacementChar);
        }
    },
    TagOpen { // from class: org.jsoup.parser.TokeniserState.8
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char current = characterReader.current();
            if (current != '!') {
                if (current != '/') {
                    if (current != '?') {
                        if (characterReader.matchesAsciiAlpha()) {
                            tokeniser.createTagPending(true);
                            tokeniser.transition(TokeniserState.TagName);
                            return;
                        } else {
                            tokeniser.error(this);
                            tokeniser.emit('<');
                            tokeniser.transition(TokeniserState.Data);
                            return;
                        }
                    }
                    tokeniser.createBogusCommentPending();
                    tokeniser.transition(TokeniserState.BogusComment);
                    return;
                }
                tokeniser.advanceTransition(TokeniserState.EndTagOpen);
                return;
            }
            tokeniser.advanceTransition(TokeniserState.MarkupDeclarationOpen);
        }
    },
    EndTagOpen { // from class: org.jsoup.parser.TokeniserState.9
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.isEmpty()) {
                tokeniser.eofError(this);
                tokeniser.emit("</");
                tokeniser.transition(TokeniserState.Data);
            } else if (characterReader.matchesAsciiAlpha()) {
                tokeniser.createTagPending(false);
                tokeniser.transition(TokeniserState.TagName);
            } else if (characterReader.matches('>')) {
                tokeniser.error(this);
                tokeniser.advanceTransition(TokeniserState.Data);
            } else {
                tokeniser.error(this);
                tokeniser.createBogusCommentPending();
                tokeniser.commentPending.append('/');
                tokeniser.transition(TokeniserState.BogusComment);
            }
        }
    },
    TagName { // from class: org.jsoup.parser.TokeniserState.10
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            tokeniser.tagPending.appendTagName(characterReader.consumeTagName());
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != ' ') {
                    if (consume != '/') {
                        if (consume != '>') {
                            if (consume != 65535) {
                                if (consume != '\t' && consume != '\n' && consume != '\f' && consume != '\r') {
                                    tokeniser.tagPending.appendTagName(consume);
                                    return;
                                }
                            } else {
                                tokeniser.eofError(this);
                                tokeniser.transition(TokeniserState.Data);
                                return;
                            }
                        } else {
                            tokeniser.emitTagPending();
                            tokeniser.transition(TokeniserState.Data);
                            return;
                        }
                    } else {
                        tokeniser.transition(TokeniserState.SelfClosingStartTag);
                        return;
                    }
                }
                tokeniser.transition(TokeniserState.BeforeAttributeName);
                return;
            }
            tokeniser.tagPending.appendTagName(TokeniserState.replacementStr);
        }
    },
    RcdataLessthanSign { // from class: org.jsoup.parser.TokeniserState.11
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matches('/')) {
                tokeniser.createTempBuffer();
                tokeniser.advanceTransition(TokeniserState.RCDATAEndTagOpen);
            } else if (characterReader.readFully() && characterReader.matchesAsciiAlpha() && tokeniser.appropriateEndTagName() != null && !characterReader.containsIgnoreCase(tokeniser.appropriateEndTagSeq())) {
                tokeniser.tagPending = tokeniser.createTagPending(false).name(tokeniser.appropriateEndTagName());
                tokeniser.emitTagPending();
                tokeniser.transition(TokeniserState.TagOpen);
            } else {
                tokeniser.emit("<");
                tokeniser.transition(TokeniserState.Rcdata);
            }
        }
    },
    RCDATAEndTagOpen { // from class: org.jsoup.parser.TokeniserState.12
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matchesAsciiAlpha()) {
                tokeniser.createTagPending(false);
                tokeniser.tagPending.appendTagName(characterReader.current());
                tokeniser.dataBuffer.append(characterReader.current());
                tokeniser.advanceTransition(TokeniserState.RCDATAEndTagName);
                return;
            }
            tokeniser.emit("</");
            tokeniser.transition(TokeniserState.Rcdata);
        }
    },
    RCDATAEndTagName { // from class: org.jsoup.parser.TokeniserState.13
        private void anythingElse(Tokeniser tokeniser, CharacterReader characterReader) {
            tokeniser.emit("</");
            tokeniser.emit(tokeniser.dataBuffer);
            characterReader.unconsume();
            tokeniser.transition(TokeniserState.Rcdata);
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matchesAsciiAlpha()) {
                String consumeLetterSequence = characterReader.consumeLetterSequence();
                tokeniser.tagPending.appendTagName(consumeLetterSequence);
                tokeniser.dataBuffer.append(consumeLetterSequence);
                return;
            }
            char consume = characterReader.consume();
            if (consume != '\t' && consume != '\n' && consume != '\f' && consume != '\r' && consume != ' ') {
                if (consume != '/') {
                    if (consume != '>') {
                        anythingElse(tokeniser, characterReader);
                        return;
                    } else if (tokeniser.isAppropriateEndTagToken()) {
                        tokeniser.emitTagPending();
                        tokeniser.transition(TokeniserState.Data);
                        return;
                    } else {
                        anythingElse(tokeniser, characterReader);
                        return;
                    }
                }
                if (tokeniser.isAppropriateEndTagToken()) {
                    tokeniser.transition(TokeniserState.SelfClosingStartTag);
                    return;
                } else {
                    anythingElse(tokeniser, characterReader);
                    return;
                }
            }
            if (tokeniser.isAppropriateEndTagToken()) {
                tokeniser.transition(TokeniserState.BeforeAttributeName);
            } else {
                anythingElse(tokeniser, characterReader);
            }
        }
    },
    RawtextLessthanSign { // from class: org.jsoup.parser.TokeniserState.14
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matches('/')) {
                tokeniser.createTempBuffer();
                tokeniser.advanceTransition(TokeniserState.RawtextEndTagOpen);
            } else {
                tokeniser.emit('<');
                tokeniser.transition(TokeniserState.Rawtext);
            }
        }
    },
    RawtextEndTagOpen { // from class: org.jsoup.parser.TokeniserState.15
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.readEndTag(tokeniser, characterReader, TokeniserState.RawtextEndTagName, TokeniserState.Rawtext);
        }
    },
    RawtextEndTagName { // from class: org.jsoup.parser.TokeniserState.16
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.handleDataEndTag(tokeniser, characterReader, TokeniserState.Rawtext);
        }
    },
    ScriptDataLessthanSign { // from class: org.jsoup.parser.TokeniserState.17
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume != '!') {
                if (consume != '/') {
                    if (consume != 65535) {
                        tokeniser.emit("<");
                        characterReader.unconsume();
                        tokeniser.transition(TokeniserState.ScriptData);
                        return;
                    } else {
                        tokeniser.emit("<");
                        tokeniser.eofError(this);
                        tokeniser.transition(TokeniserState.Data);
                        return;
                    }
                }
                tokeniser.createTempBuffer();
                tokeniser.transition(TokeniserState.ScriptDataEndTagOpen);
                return;
            }
            tokeniser.emit("<!");
            tokeniser.transition(TokeniserState.ScriptDataEscapeStart);
        }
    },
    ScriptDataEndTagOpen { // from class: org.jsoup.parser.TokeniserState.18
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.readEndTag(tokeniser, characterReader, TokeniserState.ScriptDataEndTagName, TokeniserState.ScriptData);
        }
    },
    ScriptDataEndTagName { // from class: org.jsoup.parser.TokeniserState.19
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.handleDataEndTag(tokeniser, characterReader, TokeniserState.ScriptData);
        }
    },
    ScriptDataEscapeStart { // from class: org.jsoup.parser.TokeniserState.20
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matches('-')) {
                tokeniser.emit('-');
                tokeniser.advanceTransition(TokeniserState.ScriptDataEscapeStartDash);
            } else {
                tokeniser.transition(TokeniserState.ScriptData);
            }
        }
    },
    ScriptDataEscapeStartDash { // from class: org.jsoup.parser.TokeniserState.21
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matches('-')) {
                tokeniser.emit('-');
                tokeniser.advanceTransition(TokeniserState.ScriptDataEscapedDashDash);
            } else {
                tokeniser.transition(TokeniserState.ScriptData);
            }
        }
    },
    ScriptDataEscaped { // from class: org.jsoup.parser.TokeniserState.22
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.isEmpty()) {
                tokeniser.eofError(this);
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            char current = characterReader.current();
            if (current != 0) {
                if (current != '-') {
                    if (current != '<') {
                        tokeniser.emit(characterReader.consumeToAny('-', '<', 0));
                        return;
                    } else {
                        tokeniser.advanceTransition(TokeniserState.ScriptDataEscapedLessthanSign);
                        return;
                    }
                }
                tokeniser.emit('-');
                tokeniser.advanceTransition(TokeniserState.ScriptDataEscapedDash);
                return;
            }
            tokeniser.error(this);
            characterReader.advance();
            tokeniser.emit(TokeniserState.replacementChar);
        }
    },
    ScriptDataEscapedDash { // from class: org.jsoup.parser.TokeniserState.23
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.isEmpty()) {
                tokeniser.eofError(this);
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != '-') {
                    if (consume != '<') {
                        tokeniser.emit(consume);
                        tokeniser.transition(TokeniserState.ScriptDataEscaped);
                        return;
                    } else {
                        tokeniser.transition(TokeniserState.ScriptDataEscapedLessthanSign);
                        return;
                    }
                }
                tokeniser.emit(consume);
                tokeniser.transition(TokeniserState.ScriptDataEscapedDashDash);
                return;
            }
            tokeniser.error(this);
            tokeniser.emit(TokeniserState.replacementChar);
            tokeniser.transition(TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataEscapedDashDash { // from class: org.jsoup.parser.TokeniserState.24
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.isEmpty()) {
                tokeniser.eofError(this);
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != '-') {
                    if (consume != '<') {
                        if (consume != '>') {
                            tokeniser.emit(consume);
                            tokeniser.transition(TokeniserState.ScriptDataEscaped);
                            return;
                        } else {
                            tokeniser.emit(consume);
                            tokeniser.transition(TokeniserState.ScriptData);
                            return;
                        }
                    }
                    tokeniser.transition(TokeniserState.ScriptDataEscapedLessthanSign);
                    return;
                }
                tokeniser.emit(consume);
                return;
            }
            tokeniser.error(this);
            tokeniser.emit(TokeniserState.replacementChar);
            tokeniser.transition(TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataEscapedLessthanSign { // from class: org.jsoup.parser.TokeniserState.25
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matchesAsciiAlpha()) {
                tokeniser.createTempBuffer();
                tokeniser.dataBuffer.append(characterReader.current());
                tokeniser.emit("<");
                tokeniser.emit(characterReader.current());
                tokeniser.advanceTransition(TokeniserState.ScriptDataDoubleEscapeStart);
                return;
            }
            if (characterReader.matches('/')) {
                tokeniser.createTempBuffer();
                tokeniser.advanceTransition(TokeniserState.ScriptDataEscapedEndTagOpen);
            } else {
                tokeniser.emit('<');
                tokeniser.transition(TokeniserState.ScriptDataEscaped);
            }
        }
    },
    ScriptDataEscapedEndTagOpen { // from class: org.jsoup.parser.TokeniserState.26
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matchesAsciiAlpha()) {
                tokeniser.createTagPending(false);
                tokeniser.tagPending.appendTagName(characterReader.current());
                tokeniser.dataBuffer.append(characterReader.current());
                tokeniser.advanceTransition(TokeniserState.ScriptDataEscapedEndTagName);
                return;
            }
            tokeniser.emit("</");
            tokeniser.transition(TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataEscapedEndTagName { // from class: org.jsoup.parser.TokeniserState.27
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.handleDataEndTag(tokeniser, characterReader, TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscapeStart { // from class: org.jsoup.parser.TokeniserState.28
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.handleDataDoubleEscapeTag(tokeniser, characterReader, TokeniserState.ScriptDataDoubleEscaped, TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscaped { // from class: org.jsoup.parser.TokeniserState.29
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char current = characterReader.current();
            if (current != 0) {
                if (current != '-') {
                    if (current != '<') {
                        if (current != 65535) {
                            tokeniser.emit(characterReader.consumeToAny('-', '<', 0));
                            return;
                        } else {
                            tokeniser.eofError(this);
                            tokeniser.transition(TokeniserState.Data);
                            return;
                        }
                    }
                    tokeniser.emit(current);
                    tokeniser.advanceTransition(TokeniserState.ScriptDataDoubleEscapedLessthanSign);
                    return;
                }
                tokeniser.emit(current);
                tokeniser.advanceTransition(TokeniserState.ScriptDataDoubleEscapedDash);
                return;
            }
            tokeniser.error(this);
            characterReader.advance();
            tokeniser.emit(TokeniserState.replacementChar);
        }
    },
    ScriptDataDoubleEscapedDash { // from class: org.jsoup.parser.TokeniserState.30
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != '-') {
                    if (consume != '<') {
                        if (consume != 65535) {
                            tokeniser.emit(consume);
                            tokeniser.transition(TokeniserState.ScriptDataDoubleEscaped);
                            return;
                        } else {
                            tokeniser.eofError(this);
                            tokeniser.transition(TokeniserState.Data);
                            return;
                        }
                    }
                    tokeniser.emit(consume);
                    tokeniser.transition(TokeniserState.ScriptDataDoubleEscapedLessthanSign);
                    return;
                }
                tokeniser.emit(consume);
                tokeniser.transition(TokeniserState.ScriptDataDoubleEscapedDashDash);
                return;
            }
            tokeniser.error(this);
            tokeniser.emit(TokeniserState.replacementChar);
            tokeniser.transition(TokeniserState.ScriptDataDoubleEscaped);
        }
    },
    ScriptDataDoubleEscapedDashDash { // from class: org.jsoup.parser.TokeniserState.31
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != '-') {
                    if (consume != '<') {
                        if (consume != '>') {
                            if (consume != 65535) {
                                tokeniser.emit(consume);
                                tokeniser.transition(TokeniserState.ScriptDataDoubleEscaped);
                                return;
                            } else {
                                tokeniser.eofError(this);
                                tokeniser.transition(TokeniserState.Data);
                                return;
                            }
                        }
                        tokeniser.emit(consume);
                        tokeniser.transition(TokeniserState.ScriptData);
                        return;
                    }
                    tokeniser.emit(consume);
                    tokeniser.transition(TokeniserState.ScriptDataDoubleEscapedLessthanSign);
                    return;
                }
                tokeniser.emit(consume);
                return;
            }
            tokeniser.error(this);
            tokeniser.emit(TokeniserState.replacementChar);
            tokeniser.transition(TokeniserState.ScriptDataDoubleEscaped);
        }
    },
    ScriptDataDoubleEscapedLessthanSign { // from class: org.jsoup.parser.TokeniserState.32
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matches('/')) {
                tokeniser.emit('/');
                tokeniser.createTempBuffer();
                tokeniser.advanceTransition(TokeniserState.ScriptDataDoubleEscapeEnd);
                return;
            }
            tokeniser.transition(TokeniserState.ScriptDataDoubleEscaped);
        }
    },
    ScriptDataDoubleEscapeEnd { // from class: org.jsoup.parser.TokeniserState.33
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.handleDataDoubleEscapeTag(tokeniser, characterReader, TokeniserState.ScriptDataEscaped, TokeniserState.ScriptDataDoubleEscaped);
        }
    },
    BeforeAttributeName { // from class: org.jsoup.parser.TokeniserState.34
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != ' ') {
                    if (consume != '\"' && consume != '\'') {
                        if (consume != '/') {
                            if (consume != 65535) {
                                if (consume != '\t' && consume != '\n' && consume != '\f' && consume != '\r') {
                                    if (consume != '=') {
                                        if (consume != '>') {
                                            tokeniser.tagPending.newAttribute();
                                            characterReader.unconsume();
                                            tokeniser.transition(TokeniserState.AttributeName);
                                            return;
                                        } else {
                                            tokeniser.emitTagPending();
                                            tokeniser.transition(TokeniserState.Data);
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                tokeniser.eofError(this);
                                tokeniser.transition(TokeniserState.Data);
                                return;
                            }
                        } else {
                            tokeniser.transition(TokeniserState.SelfClosingStartTag);
                            return;
                        }
                    }
                    tokeniser.error(this);
                    tokeniser.tagPending.newAttribute();
                    tokeniser.tagPending.appendAttributeName(consume, characterReader.pos() - 1, characterReader.pos());
                    tokeniser.transition(TokeniserState.AttributeName);
                    return;
                }
                return;
            }
            characterReader.unconsume();
            tokeniser.error(this);
            tokeniser.tagPending.newAttribute();
            tokeniser.transition(TokeniserState.AttributeName);
        }
    },
    AttributeName { // from class: org.jsoup.parser.TokeniserState.35
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            int pos = characterReader.pos();
            tokeniser.tagPending.appendAttributeName(characterReader.consumeToAnySorted(TokeniserState.attributeNameCharsSorted), pos, characterReader.pos());
            int pos2 = characterReader.pos();
            char consume = characterReader.consume();
            if (consume != '\t' && consume != '\n' && consume != '\f' && consume != '\r' && consume != ' ') {
                if (consume != '\"' && consume != '\'') {
                    if (consume != '/') {
                        if (consume != 65535) {
                            switch (consume) {
                                case '<':
                                    break;
                                case '=':
                                    tokeniser.transition(TokeniserState.BeforeAttributeValue);
                                    return;
                                case '>':
                                    tokeniser.emitTagPending();
                                    tokeniser.transition(TokeniserState.Data);
                                    return;
                                default:
                                    tokeniser.tagPending.appendAttributeName(consume, pos2, characterReader.pos());
                                    return;
                            }
                        } else {
                            tokeniser.eofError(this);
                            tokeniser.transition(TokeniserState.Data);
                            return;
                        }
                    } else {
                        tokeniser.transition(TokeniserState.SelfClosingStartTag);
                        return;
                    }
                }
                tokeniser.error(this);
                tokeniser.tagPending.appendAttributeName(consume, pos2, characterReader.pos());
                return;
            }
            tokeniser.transition(TokeniserState.AfterAttributeName);
        }
    },
    AfterAttributeName { // from class: org.jsoup.parser.TokeniserState.36
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != ' ') {
                    if (consume != '\"' && consume != '\'') {
                        if (consume != '/') {
                            if (consume != 65535) {
                                if (consume != '\t' && consume != '\n' && consume != '\f' && consume != '\r') {
                                    switch (consume) {
                                        case '<':
                                            break;
                                        case '=':
                                            tokeniser.transition(TokeniserState.BeforeAttributeValue);
                                            return;
                                        case '>':
                                            tokeniser.emitTagPending();
                                            tokeniser.transition(TokeniserState.Data);
                                            return;
                                        default:
                                            tokeniser.tagPending.newAttribute();
                                            characterReader.unconsume();
                                            tokeniser.transition(TokeniserState.AttributeName);
                                            return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                tokeniser.eofError(this);
                                tokeniser.transition(TokeniserState.Data);
                                return;
                            }
                        } else {
                            tokeniser.transition(TokeniserState.SelfClosingStartTag);
                            return;
                        }
                    }
                    tokeniser.error(this);
                    tokeniser.tagPending.newAttribute();
                    tokeniser.tagPending.appendAttributeName(consume, characterReader.pos() - 1, characterReader.pos());
                    tokeniser.transition(TokeniserState.AttributeName);
                    return;
                }
                return;
            }
            tokeniser.error(this);
            tokeniser.tagPending.appendAttributeName(TokeniserState.replacementChar, characterReader.pos() - 1, characterReader.pos());
            tokeniser.transition(TokeniserState.AttributeName);
        }
    },
    BeforeAttributeValue { // from class: org.jsoup.parser.TokeniserState.37
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != ' ') {
                    if (consume != '\"') {
                        if (consume != '`') {
                            if (consume != 65535) {
                                if (consume != '\t' && consume != '\n' && consume != '\f' && consume != '\r') {
                                    if (consume != '&') {
                                        if (consume != '\'') {
                                            switch (consume) {
                                                case '<':
                                                case '=':
                                                    break;
                                                case '>':
                                                    tokeniser.error(this);
                                                    tokeniser.emitTagPending();
                                                    tokeniser.transition(TokeniserState.Data);
                                                    return;
                                                default:
                                                    characterReader.unconsume();
                                                    tokeniser.transition(TokeniserState.AttributeValue_unquoted);
                                                    return;
                                            }
                                        } else {
                                            tokeniser.transition(TokeniserState.AttributeValue_singleQuoted);
                                            return;
                                        }
                                    } else {
                                        characterReader.unconsume();
                                        tokeniser.transition(TokeniserState.AttributeValue_unquoted);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                tokeniser.eofError(this);
                                tokeniser.emitTagPending();
                                tokeniser.transition(TokeniserState.Data);
                                return;
                            }
                        }
                        tokeniser.error(this);
                        tokeniser.tagPending.appendAttributeValue(consume, characterReader.pos() - 1, characterReader.pos());
                        tokeniser.transition(TokeniserState.AttributeValue_unquoted);
                        return;
                    }
                    tokeniser.transition(TokeniserState.AttributeValue_doubleQuoted);
                    return;
                }
                return;
            }
            tokeniser.error(this);
            tokeniser.tagPending.appendAttributeValue(TokeniserState.replacementChar, characterReader.pos() - 1, characterReader.pos());
            tokeniser.transition(TokeniserState.AttributeValue_unquoted);
        }
    },
    AttributeValue_doubleQuoted { // from class: org.jsoup.parser.TokeniserState.38
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            int pos = characterReader.pos();
            String consumeAttributeQuoted = characterReader.consumeAttributeQuoted(false);
            if (consumeAttributeQuoted.length() > 0) {
                tokeniser.tagPending.appendAttributeValue(consumeAttributeQuoted, pos, characterReader.pos());
            } else {
                tokeniser.tagPending.setEmptyAttributeValue();
            }
            int pos2 = characterReader.pos();
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != '\"') {
                    if (consume != '&') {
                        if (consume != 65535) {
                            tokeniser.tagPending.appendAttributeValue(consume, pos2, characterReader.pos());
                            return;
                        } else {
                            tokeniser.eofError(this);
                            tokeniser.transition(TokeniserState.Data);
                            return;
                        }
                    }
                    int[] consumeCharacterReference = tokeniser.consumeCharacterReference(Character.valueOf(AbstractJsonLexerKt.STRING), true);
                    Token.Tag tag = tokeniser.tagPending;
                    if (consumeCharacterReference != null) {
                        tag.appendAttributeValue(consumeCharacterReference, pos2, characterReader.pos());
                        return;
                    } else {
                        tag.appendAttributeValue('&', pos2, characterReader.pos());
                        return;
                    }
                }
                tokeniser.transition(TokeniserState.AfterAttributeValue_quoted);
                return;
            }
            tokeniser.error(this);
            tokeniser.tagPending.appendAttributeValue(TokeniserState.replacementChar, pos2, characterReader.pos());
        }
    },
    AttributeValue_singleQuoted { // from class: org.jsoup.parser.TokeniserState.39
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            int pos = characterReader.pos();
            String consumeAttributeQuoted = characterReader.consumeAttributeQuoted(true);
            if (consumeAttributeQuoted.length() > 0) {
                tokeniser.tagPending.appendAttributeValue(consumeAttributeQuoted, pos, characterReader.pos());
            } else {
                tokeniser.tagPending.setEmptyAttributeValue();
            }
            int pos2 = characterReader.pos();
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != 65535) {
                    if (consume != '&') {
                        if (consume != '\'') {
                            tokeniser.tagPending.appendAttributeValue(consume, pos2, characterReader.pos());
                            return;
                        } else {
                            tokeniser.transition(TokeniserState.AfterAttributeValue_quoted);
                            return;
                        }
                    }
                    int[] consumeCharacterReference = tokeniser.consumeCharacterReference('\'', true);
                    Token.Tag tag = tokeniser.tagPending;
                    if (consumeCharacterReference != null) {
                        tag.appendAttributeValue(consumeCharacterReference, pos2, characterReader.pos());
                        return;
                    } else {
                        tag.appendAttributeValue('&', pos2, characterReader.pos());
                        return;
                    }
                }
                tokeniser.eofError(this);
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            tokeniser.error(this);
            tokeniser.tagPending.appendAttributeValue(TokeniserState.replacementChar, pos2, characterReader.pos());
        }
    },
    AttributeValue_unquoted { // from class: org.jsoup.parser.TokeniserState.40
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            int pos = characterReader.pos();
            String consumeToAnySorted = characterReader.consumeToAnySorted(TokeniserState.attributeValueUnquoted);
            if (consumeToAnySorted.length() > 0) {
                tokeniser.tagPending.appendAttributeValue(consumeToAnySorted, pos, characterReader.pos());
            }
            int pos2 = characterReader.pos();
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != ' ') {
                    if (consume != '\"' && consume != '`') {
                        if (consume != 65535) {
                            if (consume != '\t' && consume != '\n' && consume != '\f' && consume != '\r') {
                                if (consume != '&') {
                                    if (consume != '\'') {
                                        switch (consume) {
                                            case '<':
                                            case '=':
                                                break;
                                            case '>':
                                                tokeniser.emitTagPending();
                                                tokeniser.transition(TokeniserState.Data);
                                                return;
                                            default:
                                                tokeniser.tagPending.appendAttributeValue(consume, pos2, characterReader.pos());
                                                return;
                                        }
                                    }
                                } else {
                                    int[] consumeCharacterReference = tokeniser.consumeCharacterReference('>', true);
                                    Token.Tag tag = tokeniser.tagPending;
                                    if (consumeCharacterReference != null) {
                                        tag.appendAttributeValue(consumeCharacterReference, pos2, characterReader.pos());
                                        return;
                                    } else {
                                        tag.appendAttributeValue('&', pos2, characterReader.pos());
                                        return;
                                    }
                                }
                            }
                        } else {
                            tokeniser.eofError(this);
                            tokeniser.transition(TokeniserState.Data);
                            return;
                        }
                    }
                    tokeniser.error(this);
                    tokeniser.tagPending.appendAttributeValue(consume, pos2, characterReader.pos());
                    return;
                }
                tokeniser.transition(TokeniserState.BeforeAttributeName);
                return;
            }
            tokeniser.error(this);
            tokeniser.tagPending.appendAttributeValue(TokeniserState.replacementChar, pos2, characterReader.pos());
        }
    },
    AfterAttributeValue_quoted { // from class: org.jsoup.parser.TokeniserState.41
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume != '\t' && consume != '\n' && consume != '\f' && consume != '\r' && consume != ' ') {
                if (consume != '/') {
                    if (consume != '>') {
                        if (consume != 65535) {
                            characterReader.unconsume();
                            tokeniser.error(this);
                            tokeniser.transition(TokeniserState.BeforeAttributeName);
                            return;
                        } else {
                            tokeniser.eofError(this);
                            tokeniser.transition(TokeniserState.Data);
                            return;
                        }
                    }
                    tokeniser.emitTagPending();
                    tokeniser.transition(TokeniserState.Data);
                    return;
                }
                tokeniser.transition(TokeniserState.SelfClosingStartTag);
                return;
            }
            tokeniser.transition(TokeniserState.BeforeAttributeName);
        }
    },
    SelfClosingStartTag { // from class: org.jsoup.parser.TokeniserState.42
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume != '>') {
                if (consume != 65535) {
                    characterReader.unconsume();
                    tokeniser.error(this);
                    tokeniser.transition(TokeniserState.BeforeAttributeName);
                    return;
                } else {
                    tokeniser.eofError(this);
                    tokeniser.transition(TokeniserState.Data);
                    return;
                }
            }
            tokeniser.tagPending.selfClosing = true;
            tokeniser.emitTagPending();
            tokeniser.transition(TokeniserState.Data);
        }
    },
    BogusComment { // from class: org.jsoup.parser.TokeniserState.43
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            tokeniser.commentPending.append(characterReader.consumeTo('>'));
            char current = characterReader.current();
            if (current != '>' && current != 65535) {
                return;
            }
            characterReader.consume();
            tokeniser.emitCommentPending();
            tokeniser.transition(TokeniserState.Data);
        }
    },
    MarkupDeclarationOpen { // from class: org.jsoup.parser.TokeniserState.44
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matchConsume("--")) {
                tokeniser.createCommentPending();
                tokeniser.transition(TokeniserState.CommentStart);
            } else {
                if (characterReader.matchConsumeIgnoreCase("DOCTYPE")) {
                    tokeniser.transition(TokeniserState.Doctype);
                    return;
                }
                if (characterReader.matchConsume("[CDATA[")) {
                    tokeniser.createTempBuffer();
                    tokeniser.transition(TokeniserState.CdataSection);
                } else {
                    tokeniser.error(this);
                    tokeniser.createBogusCommentPending();
                    tokeniser.transition(TokeniserState.BogusComment);
                }
            }
        }
    },
    CommentStart { // from class: org.jsoup.parser.TokeniserState.45
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != '-') {
                    if (consume != '>') {
                        if (consume != 65535) {
                            characterReader.unconsume();
                            tokeniser.transition(TokeniserState.Comment);
                            return;
                        } else {
                            tokeniser.eofError(this);
                            tokeniser.emitCommentPending();
                            tokeniser.transition(TokeniserState.Data);
                            return;
                        }
                    }
                    tokeniser.error(this);
                    tokeniser.emitCommentPending();
                    tokeniser.transition(TokeniserState.Data);
                    return;
                }
                tokeniser.transition(TokeniserState.CommentStartDash);
                return;
            }
            tokeniser.error(this);
            tokeniser.commentPending.append(TokeniserState.replacementChar);
            tokeniser.transition(TokeniserState.Comment);
        }
    },
    CommentStartDash { // from class: org.jsoup.parser.TokeniserState.46
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != '-') {
                    if (consume != '>') {
                        if (consume != 65535) {
                            tokeniser.commentPending.append(consume);
                            tokeniser.transition(TokeniserState.Comment);
                            return;
                        } else {
                            tokeniser.eofError(this);
                            tokeniser.emitCommentPending();
                            tokeniser.transition(TokeniserState.Data);
                            return;
                        }
                    }
                    tokeniser.error(this);
                    tokeniser.emitCommentPending();
                    tokeniser.transition(TokeniserState.Data);
                    return;
                }
                tokeniser.transition(TokeniserState.CommentEnd);
                return;
            }
            tokeniser.error(this);
            tokeniser.commentPending.append(TokeniserState.replacementChar);
            tokeniser.transition(TokeniserState.Comment);
        }
    },
    Comment { // from class: org.jsoup.parser.TokeniserState.47
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char current = characterReader.current();
            if (current != 0) {
                if (current != '-') {
                    if (current != 65535) {
                        tokeniser.commentPending.append(characterReader.consumeToAny('-', 0));
                        return;
                    }
                    tokeniser.eofError(this);
                    tokeniser.emitCommentPending();
                    tokeniser.transition(TokeniserState.Data);
                    return;
                }
                tokeniser.advanceTransition(TokeniserState.CommentEndDash);
                return;
            }
            tokeniser.error(this);
            characterReader.advance();
            tokeniser.commentPending.append(TokeniserState.replacementChar);
        }
    },
    CommentEndDash { // from class: org.jsoup.parser.TokeniserState.48
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != '-') {
                    if (consume != 65535) {
                        tokeniser.commentPending.append('-').append(consume);
                        tokeniser.transition(TokeniserState.Comment);
                        return;
                    } else {
                        tokeniser.eofError(this);
                        tokeniser.emitCommentPending();
                        tokeniser.transition(TokeniserState.Data);
                        return;
                    }
                }
                tokeniser.transition(TokeniserState.CommentEnd);
                return;
            }
            tokeniser.error(this);
            tokeniser.commentPending.append('-').append(TokeniserState.replacementChar);
            tokeniser.transition(TokeniserState.Comment);
        }
    },
    CommentEnd { // from class: org.jsoup.parser.TokeniserState.49
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != '!') {
                    if (consume != '-') {
                        if (consume != '>') {
                            if (consume != 65535) {
                                tokeniser.commentPending.append("--").append(consume);
                                tokeniser.transition(TokeniserState.Comment);
                                return;
                            } else {
                                tokeniser.eofError(this);
                                tokeniser.emitCommentPending();
                                tokeniser.transition(TokeniserState.Data);
                                return;
                            }
                        }
                        tokeniser.emitCommentPending();
                        tokeniser.transition(TokeniserState.Data);
                        return;
                    }
                    tokeniser.commentPending.append('-');
                    return;
                }
                tokeniser.transition(TokeniserState.CommentEndBang);
                return;
            }
            tokeniser.error(this);
            tokeniser.commentPending.append("--").append(TokeniserState.replacementChar);
            tokeniser.transition(TokeniserState.Comment);
        }
    },
    CommentEndBang { // from class: org.jsoup.parser.TokeniserState.50
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != '-') {
                    if (consume != '>') {
                        if (consume != 65535) {
                            tokeniser.commentPending.append("--!").append(consume);
                            tokeniser.transition(TokeniserState.Comment);
                            return;
                        } else {
                            tokeniser.eofError(this);
                            tokeniser.emitCommentPending();
                            tokeniser.transition(TokeniserState.Data);
                            return;
                        }
                    }
                    tokeniser.emitCommentPending();
                    tokeniser.transition(TokeniserState.Data);
                    return;
                }
                tokeniser.commentPending.append("--!");
                tokeniser.transition(TokeniserState.CommentEndDash);
                return;
            }
            tokeniser.error(this);
            tokeniser.commentPending.append("--!").append(TokeniserState.replacementChar);
            tokeniser.transition(TokeniserState.Comment);
        }
    },
    Doctype { // from class: org.jsoup.parser.TokeniserState.51
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume != '\t' && consume != '\n' && consume != '\f' && consume != '\r' && consume != ' ') {
                if (consume != '>') {
                    if (consume != 65535) {
                        tokeniser.error(this);
                        tokeniser.transition(TokeniserState.BeforeDoctypeName);
                        return;
                    }
                    tokeniser.eofError(this);
                }
                tokeniser.error(this);
                tokeniser.createDoctypePending();
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            tokeniser.transition(TokeniserState.BeforeDoctypeName);
        }
    },
    BeforeDoctypeName { // from class: org.jsoup.parser.TokeniserState.52
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matchesAsciiAlpha()) {
                tokeniser.createDoctypePending();
                tokeniser.transition(TokeniserState.DoctypeName);
                return;
            }
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != ' ') {
                    if (consume != 65535) {
                        if (consume != '\t' && consume != '\n' && consume != '\f' && consume != '\r') {
                            tokeniser.createDoctypePending();
                            tokeniser.doctypePending.name.append(consume);
                            tokeniser.transition(TokeniserState.DoctypeName);
                            return;
                        }
                        return;
                    }
                    tokeniser.eofError(this);
                    tokeniser.createDoctypePending();
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniser.emitDoctypePending();
                    tokeniser.transition(TokeniserState.Data);
                    return;
                }
                return;
            }
            tokeniser.error(this);
            tokeniser.createDoctypePending();
            tokeniser.doctypePending.name.append(TokeniserState.replacementChar);
            tokeniser.transition(TokeniserState.DoctypeName);
        }
    },
    DoctypeName { // from class: org.jsoup.parser.TokeniserState.53
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matchesLetter()) {
                tokeniser.doctypePending.name.append(characterReader.consumeLetterSequence());
                return;
            }
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != ' ') {
                    if (consume != '>') {
                        if (consume != 65535) {
                            if (consume != '\t' && consume != '\n' && consume != '\f' && consume != '\r') {
                                tokeniser.doctypePending.name.append(consume);
                                return;
                            }
                        } else {
                            tokeniser.eofError(this);
                            tokeniser.doctypePending.forceQuirks = true;
                            tokeniser.emitDoctypePending();
                            tokeniser.transition(TokeniserState.Data);
                            return;
                        }
                    } else {
                        tokeniser.emitDoctypePending();
                        tokeniser.transition(TokeniserState.Data);
                        return;
                    }
                }
                tokeniser.transition(TokeniserState.AfterDoctypeName);
                return;
            }
            tokeniser.error(this);
            tokeniser.doctypePending.name.append(TokeniserState.replacementChar);
        }
    },
    AfterDoctypeName { // from class: org.jsoup.parser.TokeniserState.54
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.isEmpty()) {
                tokeniser.eofError(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            if (characterReader.matchesAny('\t', '\n', '\r', '\f', ' ')) {
                characterReader.advance();
                return;
            }
            if (characterReader.matches('>')) {
                tokeniser.emitDoctypePending();
                tokeniser.advanceTransition(TokeniserState.Data);
                return;
            }
            if (characterReader.matchConsumeIgnoreCase(DocumentType.PUBLIC_KEY)) {
                tokeniser.doctypePending.pubSysKey = DocumentType.PUBLIC_KEY;
                tokeniser.transition(TokeniserState.AfterDoctypePublicKeyword);
            } else if (characterReader.matchConsumeIgnoreCase(DocumentType.SYSTEM_KEY)) {
                tokeniser.doctypePending.pubSysKey = DocumentType.SYSTEM_KEY;
                tokeniser.transition(TokeniserState.AfterDoctypeSystemKeyword);
            } else {
                tokeniser.error(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.advanceTransition(TokeniserState.BogusDoctype);
            }
        }
    },
    AfterDoctypePublicKeyword { // from class: org.jsoup.parser.TokeniserState.55
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume != '\t' && consume != '\n' && consume != '\f' && consume != '\r' && consume != ' ') {
                if (consume != '\"') {
                    if (consume != '\'') {
                        if (consume != '>') {
                            if (consume != 65535) {
                                tokeniser.error(this);
                                tokeniser.doctypePending.forceQuirks = true;
                                tokeniser.transition(TokeniserState.BogusDoctype);
                                return;
                            } else {
                                tokeniser.eofError(this);
                                tokeniser.doctypePending.forceQuirks = true;
                                tokeniser.emitDoctypePending();
                                tokeniser.transition(TokeniserState.Data);
                                return;
                            }
                        }
                        tokeniser.error(this);
                        tokeniser.doctypePending.forceQuirks = true;
                        tokeniser.emitDoctypePending();
                        tokeniser.transition(TokeniserState.Data);
                        return;
                    }
                    tokeniser.error(this);
                    tokeniser.transition(TokeniserState.DoctypePublicIdentifier_singleQuoted);
                    return;
                }
                tokeniser.error(this);
                tokeniser.transition(TokeniserState.DoctypePublicIdentifier_doubleQuoted);
                return;
            }
            tokeniser.transition(TokeniserState.BeforeDoctypePublicIdentifier);
        }
    },
    BeforeDoctypePublicIdentifier { // from class: org.jsoup.parser.TokeniserState.56
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume != '\t' && consume != '\n' && consume != '\f' && consume != '\r' && consume != ' ') {
                if (consume != '\"') {
                    if (consume != '\'') {
                        if (consume != '>') {
                            if (consume != 65535) {
                                tokeniser.error(this);
                                tokeniser.doctypePending.forceQuirks = true;
                                tokeniser.transition(TokeniserState.BogusDoctype);
                                return;
                            } else {
                                tokeniser.eofError(this);
                                tokeniser.doctypePending.forceQuirks = true;
                                tokeniser.emitDoctypePending();
                                tokeniser.transition(TokeniserState.Data);
                                return;
                            }
                        }
                        tokeniser.error(this);
                        tokeniser.doctypePending.forceQuirks = true;
                        tokeniser.emitDoctypePending();
                        tokeniser.transition(TokeniserState.Data);
                        return;
                    }
                    tokeniser.transition(TokeniserState.DoctypePublicIdentifier_singleQuoted);
                    return;
                }
                tokeniser.transition(TokeniserState.DoctypePublicIdentifier_doubleQuoted);
            }
        }
    },
    DoctypePublicIdentifier_doubleQuoted { // from class: org.jsoup.parser.TokeniserState.57
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != '\"') {
                    if (consume != '>') {
                        if (consume != 65535) {
                            tokeniser.doctypePending.publicIdentifier.append(consume);
                            return;
                        }
                        tokeniser.eofError(this);
                        tokeniser.doctypePending.forceQuirks = true;
                        tokeniser.emitDoctypePending();
                        tokeniser.transition(TokeniserState.Data);
                        return;
                    }
                    tokeniser.error(this);
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniser.emitDoctypePending();
                    tokeniser.transition(TokeniserState.Data);
                    return;
                }
                tokeniser.transition(TokeniserState.AfterDoctypePublicIdentifier);
                return;
            }
            tokeniser.error(this);
            tokeniser.doctypePending.publicIdentifier.append(TokeniserState.replacementChar);
        }
    },
    DoctypePublicIdentifier_singleQuoted { // from class: org.jsoup.parser.TokeniserState.58
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != '\'') {
                    if (consume != '>') {
                        if (consume != 65535) {
                            tokeniser.doctypePending.publicIdentifier.append(consume);
                            return;
                        }
                        tokeniser.eofError(this);
                        tokeniser.doctypePending.forceQuirks = true;
                        tokeniser.emitDoctypePending();
                        tokeniser.transition(TokeniserState.Data);
                        return;
                    }
                    tokeniser.error(this);
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniser.emitDoctypePending();
                    tokeniser.transition(TokeniserState.Data);
                    return;
                }
                tokeniser.transition(TokeniserState.AfterDoctypePublicIdentifier);
                return;
            }
            tokeniser.error(this);
            tokeniser.doctypePending.publicIdentifier.append(TokeniserState.replacementChar);
        }
    },
    AfterDoctypePublicIdentifier { // from class: org.jsoup.parser.TokeniserState.59
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume != '\t' && consume != '\n' && consume != '\f' && consume != '\r' && consume != ' ') {
                if (consume != '\"') {
                    if (consume != '\'') {
                        if (consume != '>') {
                            if (consume != 65535) {
                                tokeniser.error(this);
                                tokeniser.doctypePending.forceQuirks = true;
                                tokeniser.transition(TokeniserState.BogusDoctype);
                                return;
                            } else {
                                tokeniser.eofError(this);
                                tokeniser.doctypePending.forceQuirks = true;
                                tokeniser.emitDoctypePending();
                                tokeniser.transition(TokeniserState.Data);
                                return;
                            }
                        }
                        tokeniser.emitDoctypePending();
                        tokeniser.transition(TokeniserState.Data);
                        return;
                    }
                    tokeniser.error(this);
                    tokeniser.transition(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                    return;
                }
                tokeniser.error(this);
                tokeniser.transition(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                return;
            }
            tokeniser.transition(TokeniserState.BetweenDoctypePublicAndSystemIdentifiers);
        }
    },
    BetweenDoctypePublicAndSystemIdentifiers { // from class: org.jsoup.parser.TokeniserState.60
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume != '\t' && consume != '\n' && consume != '\f' && consume != '\r' && consume != ' ') {
                if (consume != '\"') {
                    if (consume != '\'') {
                        if (consume != '>') {
                            if (consume != 65535) {
                                tokeniser.error(this);
                                tokeniser.doctypePending.forceQuirks = true;
                                tokeniser.transition(TokeniserState.BogusDoctype);
                                return;
                            } else {
                                tokeniser.eofError(this);
                                tokeniser.doctypePending.forceQuirks = true;
                                tokeniser.emitDoctypePending();
                                tokeniser.transition(TokeniserState.Data);
                                return;
                            }
                        }
                        tokeniser.emitDoctypePending();
                        tokeniser.transition(TokeniserState.Data);
                        return;
                    }
                    tokeniser.error(this);
                    tokeniser.transition(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                    return;
                }
                tokeniser.error(this);
                tokeniser.transition(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
            }
        }
    },
    AfterDoctypeSystemKeyword { // from class: org.jsoup.parser.TokeniserState.61
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume != '\t' && consume != '\n' && consume != '\f' && consume != '\r' && consume != ' ') {
                if (consume != '\"') {
                    if (consume != '\'') {
                        if (consume != '>') {
                            if (consume != 65535) {
                                tokeniser.error(this);
                                tokeniser.doctypePending.forceQuirks = true;
                                tokeniser.emitDoctypePending();
                                return;
                            } else {
                                tokeniser.eofError(this);
                                tokeniser.doctypePending.forceQuirks = true;
                                tokeniser.emitDoctypePending();
                                tokeniser.transition(TokeniserState.Data);
                                return;
                            }
                        }
                        tokeniser.error(this);
                        tokeniser.doctypePending.forceQuirks = true;
                        tokeniser.emitDoctypePending();
                        tokeniser.transition(TokeniserState.Data);
                        return;
                    }
                    tokeniser.error(this);
                    tokeniser.transition(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                    return;
                }
                tokeniser.error(this);
                tokeniser.transition(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                return;
            }
            tokeniser.transition(TokeniserState.BeforeDoctypeSystemIdentifier);
        }
    },
    BeforeDoctypeSystemIdentifier { // from class: org.jsoup.parser.TokeniserState.62
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume != '\t' && consume != '\n' && consume != '\f' && consume != '\r' && consume != ' ') {
                if (consume != '\"') {
                    if (consume != '\'') {
                        if (consume != '>') {
                            if (consume != 65535) {
                                tokeniser.error(this);
                                tokeniser.doctypePending.forceQuirks = true;
                                tokeniser.transition(TokeniserState.BogusDoctype);
                                return;
                            } else {
                                tokeniser.eofError(this);
                                tokeniser.doctypePending.forceQuirks = true;
                                tokeniser.emitDoctypePending();
                                tokeniser.transition(TokeniserState.Data);
                                return;
                            }
                        }
                        tokeniser.error(this);
                        tokeniser.doctypePending.forceQuirks = true;
                        tokeniser.emitDoctypePending();
                        tokeniser.transition(TokeniserState.Data);
                        return;
                    }
                    tokeniser.transition(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                    return;
                }
                tokeniser.transition(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
            }
        }
    },
    DoctypeSystemIdentifier_doubleQuoted { // from class: org.jsoup.parser.TokeniserState.63
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != '\"') {
                    if (consume != '>') {
                        if (consume != 65535) {
                            tokeniser.doctypePending.systemIdentifier.append(consume);
                            return;
                        }
                        tokeniser.eofError(this);
                        tokeniser.doctypePending.forceQuirks = true;
                        tokeniser.emitDoctypePending();
                        tokeniser.transition(TokeniserState.Data);
                        return;
                    }
                    tokeniser.error(this);
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniser.emitDoctypePending();
                    tokeniser.transition(TokeniserState.Data);
                    return;
                }
                tokeniser.transition(TokeniserState.AfterDoctypeSystemIdentifier);
                return;
            }
            tokeniser.error(this);
            tokeniser.doctypePending.systemIdentifier.append(TokeniserState.replacementChar);
        }
    },
    DoctypeSystemIdentifier_singleQuoted { // from class: org.jsoup.parser.TokeniserState.64
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != '\'') {
                    if (consume != '>') {
                        if (consume != 65535) {
                            tokeniser.doctypePending.systemIdentifier.append(consume);
                            return;
                        }
                        tokeniser.eofError(this);
                        tokeniser.doctypePending.forceQuirks = true;
                        tokeniser.emitDoctypePending();
                        tokeniser.transition(TokeniserState.Data);
                        return;
                    }
                    tokeniser.error(this);
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniser.emitDoctypePending();
                    tokeniser.transition(TokeniserState.Data);
                    return;
                }
                tokeniser.transition(TokeniserState.AfterDoctypeSystemIdentifier);
                return;
            }
            tokeniser.error(this);
            tokeniser.doctypePending.systemIdentifier.append(TokeniserState.replacementChar);
        }
    },
    AfterDoctypeSystemIdentifier { // from class: org.jsoup.parser.TokeniserState.65
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume != '\t' && consume != '\n' && consume != '\f' && consume != '\r' && consume != ' ') {
                if (consume != '>') {
                    if (consume != 65535) {
                        tokeniser.error(this);
                        tokeniser.transition(TokeniserState.BogusDoctype);
                        return;
                    } else {
                        tokeniser.eofError(this);
                        tokeniser.doctypePending.forceQuirks = true;
                        tokeniser.emitDoctypePending();
                        tokeniser.transition(TokeniserState.Data);
                        return;
                    }
                }
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
            }
        }
    },
    BogusDoctype { // from class: org.jsoup.parser.TokeniserState.66
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume != '>') {
                if (consume != 65535) {
                    return;
                }
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            tokeniser.emitDoctypePending();
            tokeniser.transition(TokeniserState.Data);
        }
    },
    CdataSection { // from class: org.jsoup.parser.TokeniserState.67
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            tokeniser.dataBuffer.append(characterReader.consumeTo("]]>"));
            if (!characterReader.matchConsume("]]>") && !characterReader.isEmpty()) {
                return;
            }
            tokeniser.emit(new Token.CData(tokeniser.dataBuffer.toString()));
            tokeniser.transition(TokeniserState.Data);
        }
    };

    private static final char eof = 65535;
    static final char nullChar = 0;
    static final char[] attributeNameCharsSorted = {'\t', '\n', '\f', '\r', ' ', AbstractJsonLexerKt.STRING, '\'', '/', '<', '=', '>'};
    static final char[] attributeValueUnquoted = {0, '\t', '\n', '\f', '\r', ' ', AbstractJsonLexerKt.STRING, '&', '\'', '<', '=', '>', '`'};
    private static final char replacementChar = 65533;
    private static final String replacementStr = String.valueOf(replacementChar);

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleDataDoubleEscapeTag(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        if (characterReader.matchesLetter()) {
            String consumeLetterSequence = characterReader.consumeLetterSequence();
            tokeniser.dataBuffer.append(consumeLetterSequence);
            tokeniser.emit(consumeLetterSequence);
            return;
        }
        char consume = characterReader.consume();
        if (consume != '\t' && consume != '\n' && consume != '\f' && consume != '\r' && consume != ' ' && consume != '/' && consume != '>') {
            characterReader.unconsume();
            tokeniser.transition(tokeniserState2);
        } else {
            if (tokeniser.dataBuffer.toString().equals("script")) {
                tokeniser.transition(tokeniserState);
            } else {
                tokeniser.transition(tokeniserState2);
            }
            tokeniser.emit(consume);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleDataEndTag(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState) {
        if (characterReader.matchesLetter()) {
            String consumeLetterSequence = characterReader.consumeLetterSequence();
            tokeniser.tagPending.appendTagName(consumeLetterSequence);
            tokeniser.dataBuffer.append(consumeLetterSequence);
            return;
        }
        if (tokeniser.isAppropriateEndTagToken() && !characterReader.isEmpty()) {
            char consume = characterReader.consume();
            if (consume != '\t' && consume != '\n' && consume != '\f' && consume != '\r' && consume != ' ') {
                if (consume != '/') {
                    if (consume != '>') {
                        tokeniser.dataBuffer.append(consume);
                    } else {
                        tokeniser.emitTagPending();
                        tokeniser.transition(Data);
                        return;
                    }
                } else {
                    tokeniser.transition(SelfClosingStartTag);
                    return;
                }
            } else {
                tokeniser.transition(BeforeAttributeName);
                return;
            }
        }
        tokeniser.emit("</");
        tokeniser.emit(tokeniser.dataBuffer);
        tokeniser.transition(tokeniserState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void readCharRef(Tokeniser tokeniser, TokeniserState tokeniserState) {
        int[] consumeCharacterReference = tokeniser.consumeCharacterReference(null, false);
        if (consumeCharacterReference == null) {
            tokeniser.emit('&');
        } else {
            tokeniser.emit(consumeCharacterReference);
        }
        tokeniser.transition(tokeniserState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void readEndTag(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        if (characterReader.matchesAsciiAlpha()) {
            tokeniser.createTagPending(false);
            tokeniser.transition(tokeniserState);
        } else {
            tokeniser.emit("</");
            tokeniser.transition(tokeniserState2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void readRawData(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        char current = characterReader.current();
        if (current != 0) {
            if (current != '<') {
                if (current != 65535) {
                    tokeniser.emit(characterReader.consumeRawData());
                    return;
                } else {
                    tokeniser.emit(new Token.EOF());
                    return;
                }
            }
            tokeniser.advanceTransition(tokeniserState2);
            return;
        }
        tokeniser.error(tokeniserState);
        characterReader.advance();
        tokeniser.emit(replacementChar);
    }

    public abstract void read(Tokeniser tokeniser, CharacterReader characterReader);
}
