package org.demoqa.page;

import org.demoqa.elements.TextBoxElements;
import org.demoqa.states.BaseState;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxPage extends BaseState {

    private final TextBoxElements textBoxElements;

    public TextBoxPage() {
        textBoxElements = new TextBoxElements();
    }

    /**
     * Открытие окна Text Box
     */
    public TextBoxPage openPageTextBox() {
        open("/text-box");
        closeBanner();
        return this;
    }

    /**
     * Ввод в поле Full Name
     */
    public TextBoxPage setFullName(String value) {
        textBoxElements.fullName.setValue(value);
        return this;
    }

    /**
     * Ввод в поле First Name
     */
    public TextBoxPage setEmail(String value) {
        textBoxElements.email.setValue(value);
        return this;
    }

    /**
     * Ввод в поле First Name
     */
    public TextBoxPage setCurrentAddress(String value) {
        textBoxElements.currentAddress.setValue(value);
        return this;
    }

    /**
     * Ввод в поле First Name
     */
    public TextBoxPage setPermanentAddress(String value) {
        textBoxElements.permanentAddress.setValue(value);
        return this;
    }

    /**
     * Клик по кнопке Submit
     */
    public TextBoxPage clickButtonSubmit() {
        textBoxElements.buttonSubmit.click();
        return this;
    }

    /**
     * Проверка формы
     */
    public void checkResult(String name, String email, String currentAddress, String permanentAddress) {
        textBoxElements.outputName.shouldHave(text(name));
        textBoxElements.outputEmail.shouldHave(text(email));
        textBoxElements.outputCurrentAddress.shouldHave(text(currentAddress));
        textBoxElements.outputPermanentAddress.shouldHave(text(permanentAddress));
    }
}
