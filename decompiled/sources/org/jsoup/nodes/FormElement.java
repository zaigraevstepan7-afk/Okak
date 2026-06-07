package org.jsoup.nodes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.Validate;
import org.jsoup.internal.SharedConstants;
import org.jsoup.internal.StringUtil;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.QueryParser;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class FormElement extends Element {
    private final Elements linkedEls;
    private final Evaluator submittable;

    public FormElement(Tag tag, String str, Attributes attributes) {
        super(tag, str, attributes);
        this.linkedEls = new Elements();
        this.submittable = QueryParser.parse(StringUtil.join(SharedConstants.FormSubmitTags, ", "));
    }

    public FormElement addElement(Element element) {
        this.linkedEls.add(element);
        return this;
    }

    @Override // org.jsoup.nodes.Element, org.jsoup.nodes.Node
    /* renamed from: clone */
    public FormElement mo283clone() {
        return (FormElement) super.mo283clone();
    }

    public Elements elements() {
        Elements select = select(this.submittable);
        Iterator<Element> it = this.linkedEls.iterator();
        while (it.hasNext()) {
            Element next = it.next();
            if (next.ownerDocument() != null && !select.contains(next)) {
                select.add(next);
            }
        }
        return select;
    }

    public List<Connection.KeyVal> formData() {
        Element selectFirst;
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<Element> it = elements().iterator();
        while (it.hasNext()) {
            Element next = it.next();
            if (next.tag().isFormSubmittable() && !next.hasAttr("disabled")) {
                String attr = next.attr("name");
                if (attr.length() != 0) {
                    String attr2 = next.attr("type");
                    if (!attr2.equalsIgnoreCase("button") && !attr2.equalsIgnoreCase("image")) {
                        if (next.nameIs("select")) {
                            Iterator<Element> it2 = next.select("option[selected]").iterator();
                            boolean z = false;
                            while (it2.hasNext()) {
                                arrayList.add(HttpConnection.KeyVal.create(attr, it2.next().val()));
                                z = true;
                            }
                            if (!z && (selectFirst = next.selectFirst("option")) != null) {
                                arrayList.add(HttpConnection.KeyVal.create(attr, selectFirst.val()));
                            }
                        } else if (!"checkbox".equalsIgnoreCase(attr2) && !"radio".equalsIgnoreCase(attr2)) {
                            arrayList.add(HttpConnection.KeyVal.create(attr, next.val()));
                        } else if (next.hasAttr("checked")) {
                            if (next.val().length() > 0) {
                                str = next.val();
                            } else {
                                str = "on";
                            }
                            arrayList.add(HttpConnection.KeyVal.create(attr, str));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // org.jsoup.nodes.Node
    public void removeChild(Node node) {
        super.removeChild(node);
        this.linkedEls.remove(node);
    }

    public Connection submit() {
        String baseUri;
        Connection.Method method;
        Connection newSession;
        if (hasAttr("action")) {
            baseUri = absUrl("action");
        } else {
            baseUri = baseUri();
        }
        Validate.notEmpty(baseUri, "Could not determine a form action URL for submit. Ensure you set a base URI when parsing.");
        if (attr("method").equalsIgnoreCase("POST")) {
            method = Connection.Method.POST;
        } else {
            method = Connection.Method.GET;
        }
        Document ownerDocument = ownerDocument();
        if (ownerDocument != null) {
            newSession = ownerDocument.connection().newRequest();
        } else {
            newSession = Jsoup.newSession();
        }
        return newSession.url(baseUri).data(formData()).method(method);
    }
}
