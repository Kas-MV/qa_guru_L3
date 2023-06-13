package org.demoqa.util;

import org.demoqa.elements.PracticeFormElements;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;

public class VerifyResult {

    private final PracticeFormElements elements;

    public VerifyResult() {
        elements = new PracticeFormElements();
    }

    public void checkResultPracticeForm(String key, String value) {
        elements.header.shouldHave(text("Thanks for submitting the form"));
        elements.table.$(byText(key)).sibling(0).shouldHave(text(value));
    }
}
