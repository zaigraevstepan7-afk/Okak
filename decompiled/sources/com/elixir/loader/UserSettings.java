package com.elixir.loader;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.ae2;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class UserSettings extends GeneratedMessageLite<UserSettings, Builder> implements MessageLiteOrBuilder {
    public static final int AUTOLOGIN_FIELD_NUMBER = 1;
    public static final int AUTO_UPDATE_DISABLED_FIELD_NUMBER = 15;
    private static final UserSettings DEFAULT_INSTANCE;
    public static final int EXPIRES_AT_FIELD_NUMBER = 5;
    public static final int FIX_TOUCH_FIELD_NUMBER = 13;
    public static final int FLOATING_MENU_FIELD_NUMBER = 9;
    public static final int HIDE_ON_RECORD_FIELD_NUMBER = 12;
    public static final int IS_LANGUAGE_INITIALIZED_FIELD_NUMBER = 14;
    public static final int IS_LIFETIME_FIELD_NUMBER = 6;
    public static final int LANGUAGE_FIELD_NUMBER = 8;
    public static final int LOGGED_IN_FIELD_NUMBER = 4;
    public static final int OVERLAY_FIELD_NUMBER = 7;
    private static volatile Parser<UserSettings> PARSER = null;
    public static final int RECORD_BITRATE_FIELD_NUMBER = 10;
    public static final int SAVED_KEY_FIELD_NUMBER = 2;
    public static final int SELECTED_RELEASE_FIELD_NUMBER = 11;
    public static final int SUB_TYPE_FIELD_NUMBER = 3;
    private boolean autoUpdateDisabled_;
    private boolean autologin_;
    private long expiresAt_;
    private boolean fixTouch_;
    private boolean floatingMenu_;
    private boolean hideOnRecord_;
    private boolean isLanguageInitialized_;
    private boolean isLifetime_;
    private int language_;
    private boolean loggedIn_;
    private boolean overlay_;
    private long recordBitrate_;
    private String savedKey_ = "";
    private String subType_ = "";
    private String selectedRelease_ = "";

    static {
        UserSettings userSettings = new UserSettings();
        DEFAULT_INSTANCE = userSettings;
        GeneratedMessageLite.registerDefaultInstance(UserSettings.class, userSettings);
    }

    private UserSettings() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAutoUpdateDisabled() {
        this.autoUpdateDisabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAutologin() {
        this.autologin_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExpiresAt() {
        this.expiresAt_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFixTouch() {
        this.fixTouch_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFloatingMenu() {
        this.floatingMenu_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHideOnRecord() {
        this.hideOnRecord_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsLanguageInitialized() {
        this.isLanguageInitialized_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsLifetime() {
        this.isLifetime_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguage() {
        this.language_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLoggedIn() {
        this.loggedIn_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOverlay() {
        this.overlay_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecordBitrate() {
        this.recordBitrate_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSavedKey() {
        this.savedKey_ = getDefaultInstance().getSavedKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelectedRelease() {
        this.selectedRelease_ = getDefaultInstance().getSelectedRelease();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubType() {
        this.subType_ = getDefaultInstance().getSubType();
    }

    public static UserSettings getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static UserSettings parseDelimitedFrom(InputStream inputStream) {
        return (UserSettings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserSettings parseFrom(ByteBuffer byteBuffer) {
        return (UserSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UserSettings> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoUpdateDisabled(boolean z) {
        this.autoUpdateDisabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutologin(boolean z) {
        this.autologin_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpiresAt(long j) {
        this.expiresAt_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFixTouch(boolean z) {
        this.fixTouch_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFloatingMenu(boolean z) {
        this.floatingMenu_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHideOnRecord(boolean z) {
        this.hideOnRecord_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsLanguageInitialized(boolean z) {
        this.isLanguageInitialized_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsLifetime(boolean z) {
        this.isLifetime_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguage(int i) {
        this.language_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoggedIn(boolean z) {
        this.loggedIn_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOverlay(boolean z) {
        this.overlay_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecordBitrate(long j) {
        this.recordBitrate_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSavedKey(String str) {
        str.getClass();
        this.savedKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSavedKeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.savedKey_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectedRelease(String str) {
        str.getClass();
        this.selectedRelease_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectedReleaseBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.selectedRelease_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubType(String str) {
        str.getClass();
        this.subType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.subType_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (ae2.a[methodToInvoke.ordinal()]) {
            case 1:
                return new UserSettings();
            case 2:
                return new Builder(0);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0000\u0001\u000f\u000f\u0000\u0000\u0000\u0001\u0007\u0002Ȉ\u0003Ȉ\u0004\u0007\u0005\u0002\u0006\u0007\u0007\u0007\b\u0004\t\u0007\n\u0002\u000bȈ\f\u0007\r\u0007\u000e\u0007\u000f\u0007", new Object[]{"autologin_", "savedKey_", "subType_", "loggedIn_", "expiresAt_", "isLifetime_", "overlay_", "language_", "floatingMenu_", "recordBitrate_", "selectedRelease_", "hideOnRecord_", "fixTouch_", "isLanguageInitialized_", "autoUpdateDisabled_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UserSettings> parser2 = PARSER;
                if (parser2 == null) {
                    synchronized (UserSettings.class) {
                        try {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return parser;
                }
                return parser2;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }

    public boolean getAutoUpdateDisabled() {
        return this.autoUpdateDisabled_;
    }

    public boolean getAutologin() {
        return this.autologin_;
    }

    public long getExpiresAt() {
        return this.expiresAt_;
    }

    public boolean getFixTouch() {
        return this.fixTouch_;
    }

    public boolean getFloatingMenu() {
        return this.floatingMenu_;
    }

    public boolean getHideOnRecord() {
        return this.hideOnRecord_;
    }

    public boolean getIsLanguageInitialized() {
        return this.isLanguageInitialized_;
    }

    public boolean getIsLifetime() {
        return this.isLifetime_;
    }

    public int getLanguage() {
        return this.language_;
    }

    public boolean getLoggedIn() {
        return this.loggedIn_;
    }

    public boolean getOverlay() {
        return this.overlay_;
    }

    public long getRecordBitrate() {
        return this.recordBitrate_;
    }

    public String getSavedKey() {
        return this.savedKey_;
    }

    public ByteString getSavedKeyBytes() {
        return ByteString.copyFromUtf8(this.savedKey_);
    }

    public String getSelectedRelease() {
        return this.selectedRelease_;
    }

    public ByteString getSelectedReleaseBytes() {
        return ByteString.copyFromUtf8(this.selectedRelease_);
    }

    public String getSubType() {
        return this.subType_;
    }

    public ByteString getSubTypeBytes() {
        return ByteString.copyFromUtf8(this.subType_);
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<UserSettings, Builder> implements MessageLiteOrBuilder {
        private Builder() {
            super(UserSettings.DEFAULT_INSTANCE);
        }

        public Builder clearAutoUpdateDisabled() {
            copyOnWrite();
            ((UserSettings) this.instance).clearAutoUpdateDisabled();
            return this;
        }

        public Builder clearAutologin() {
            copyOnWrite();
            ((UserSettings) this.instance).clearAutologin();
            return this;
        }

        public Builder clearExpiresAt() {
            copyOnWrite();
            ((UserSettings) this.instance).clearExpiresAt();
            return this;
        }

        public Builder clearFixTouch() {
            copyOnWrite();
            ((UserSettings) this.instance).clearFixTouch();
            return this;
        }

        public Builder clearFloatingMenu() {
            copyOnWrite();
            ((UserSettings) this.instance).clearFloatingMenu();
            return this;
        }

        public Builder clearHideOnRecord() {
            copyOnWrite();
            ((UserSettings) this.instance).clearHideOnRecord();
            return this;
        }

        public Builder clearIsLanguageInitialized() {
            copyOnWrite();
            ((UserSettings) this.instance).clearIsLanguageInitialized();
            return this;
        }

        public Builder clearIsLifetime() {
            copyOnWrite();
            ((UserSettings) this.instance).clearIsLifetime();
            return this;
        }

        public Builder clearLanguage() {
            copyOnWrite();
            ((UserSettings) this.instance).clearLanguage();
            return this;
        }

        public Builder clearLoggedIn() {
            copyOnWrite();
            ((UserSettings) this.instance).clearLoggedIn();
            return this;
        }

        public Builder clearOverlay() {
            copyOnWrite();
            ((UserSettings) this.instance).clearOverlay();
            return this;
        }

        public Builder clearRecordBitrate() {
            copyOnWrite();
            ((UserSettings) this.instance).clearRecordBitrate();
            return this;
        }

        public Builder clearSavedKey() {
            copyOnWrite();
            ((UserSettings) this.instance).clearSavedKey();
            return this;
        }

        public Builder clearSelectedRelease() {
            copyOnWrite();
            ((UserSettings) this.instance).clearSelectedRelease();
            return this;
        }

        public Builder clearSubType() {
            copyOnWrite();
            ((UserSettings) this.instance).clearSubType();
            return this;
        }

        public boolean getAutoUpdateDisabled() {
            return ((UserSettings) this.instance).getAutoUpdateDisabled();
        }

        public boolean getAutologin() {
            return ((UserSettings) this.instance).getAutologin();
        }

        public long getExpiresAt() {
            return ((UserSettings) this.instance).getExpiresAt();
        }

        public boolean getFixTouch() {
            return ((UserSettings) this.instance).getFixTouch();
        }

        public boolean getFloatingMenu() {
            return ((UserSettings) this.instance).getFloatingMenu();
        }

        public boolean getHideOnRecord() {
            return ((UserSettings) this.instance).getHideOnRecord();
        }

        public boolean getIsLanguageInitialized() {
            return ((UserSettings) this.instance).getIsLanguageInitialized();
        }

        public boolean getIsLifetime() {
            return ((UserSettings) this.instance).getIsLifetime();
        }

        public int getLanguage() {
            return ((UserSettings) this.instance).getLanguage();
        }

        public boolean getLoggedIn() {
            return ((UserSettings) this.instance).getLoggedIn();
        }

        public boolean getOverlay() {
            return ((UserSettings) this.instance).getOverlay();
        }

        public long getRecordBitrate() {
            return ((UserSettings) this.instance).getRecordBitrate();
        }

        public String getSavedKey() {
            return ((UserSettings) this.instance).getSavedKey();
        }

        public ByteString getSavedKeyBytes() {
            return ((UserSettings) this.instance).getSavedKeyBytes();
        }

        public String getSelectedRelease() {
            return ((UserSettings) this.instance).getSelectedRelease();
        }

        public ByteString getSelectedReleaseBytes() {
            return ((UserSettings) this.instance).getSelectedReleaseBytes();
        }

        public String getSubType() {
            return ((UserSettings) this.instance).getSubType();
        }

        public ByteString getSubTypeBytes() {
            return ((UserSettings) this.instance).getSubTypeBytes();
        }

        public Builder setAutoUpdateDisabled(boolean z) {
            copyOnWrite();
            ((UserSettings) this.instance).setAutoUpdateDisabled(z);
            return this;
        }

        public Builder setAutologin(boolean z) {
            copyOnWrite();
            ((UserSettings) this.instance).setAutologin(z);
            return this;
        }

        public Builder setExpiresAt(long j) {
            copyOnWrite();
            ((UserSettings) this.instance).setExpiresAt(j);
            return this;
        }

        public Builder setFixTouch(boolean z) {
            copyOnWrite();
            ((UserSettings) this.instance).setFixTouch(z);
            return this;
        }

        public Builder setFloatingMenu(boolean z) {
            copyOnWrite();
            ((UserSettings) this.instance).setFloatingMenu(z);
            return this;
        }

        public Builder setHideOnRecord(boolean z) {
            copyOnWrite();
            ((UserSettings) this.instance).setHideOnRecord(z);
            return this;
        }

        public Builder setIsLanguageInitialized(boolean z) {
            copyOnWrite();
            ((UserSettings) this.instance).setIsLanguageInitialized(z);
            return this;
        }

        public Builder setIsLifetime(boolean z) {
            copyOnWrite();
            ((UserSettings) this.instance).setIsLifetime(z);
            return this;
        }

        public Builder setLanguage(int i) {
            copyOnWrite();
            ((UserSettings) this.instance).setLanguage(i);
            return this;
        }

        public Builder setLoggedIn(boolean z) {
            copyOnWrite();
            ((UserSettings) this.instance).setLoggedIn(z);
            return this;
        }

        public Builder setOverlay(boolean z) {
            copyOnWrite();
            ((UserSettings) this.instance).setOverlay(z);
            return this;
        }

        public Builder setRecordBitrate(long j) {
            copyOnWrite();
            ((UserSettings) this.instance).setRecordBitrate(j);
            return this;
        }

        public Builder setSavedKey(String str) {
            copyOnWrite();
            ((UserSettings) this.instance).setSavedKey(str);
            return this;
        }

        public Builder setSavedKeyBytes(ByteString byteString) {
            copyOnWrite();
            ((UserSettings) this.instance).setSavedKeyBytes(byteString);
            return this;
        }

        public Builder setSelectedRelease(String str) {
            copyOnWrite();
            ((UserSettings) this.instance).setSelectedRelease(str);
            return this;
        }

        public Builder setSelectedReleaseBytes(ByteString byteString) {
            copyOnWrite();
            ((UserSettings) this.instance).setSelectedReleaseBytes(byteString);
            return this;
        }

        public Builder setSubType(String str) {
            copyOnWrite();
            ((UserSettings) this.instance).setSubType(str);
            return this;
        }

        public Builder setSubTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((UserSettings) this.instance).setSubTypeBytes(byteString);
            return this;
        }

        public /* synthetic */ Builder(int i) {
            this();
        }
    }

    public static Builder newBuilder(UserSettings userSettings) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(userSettings);
    }

    public static UserSettings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (UserSettings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserSettings parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (UserSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UserSettings parseFrom(ByteString byteString) {
        return (UserSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UserSettings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (UserSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UserSettings parseFrom(byte[] bArr) {
        return (UserSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UserSettings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (UserSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UserSettings parseFrom(InputStream inputStream) {
        return (UserSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserSettings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (UserSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserSettings parseFrom(CodedInputStream codedInputStream) {
        return (UserSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UserSettings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (UserSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
