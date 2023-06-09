package org.demoqa.page;

import org.demoqa.elements.PracticeFormElements;
import org.demoqa.states.BaseState;
import org.demoqa.util.Calendar;
import org.demoqa.util.VerifyResult;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.open;

public class PracticeFormPage extends BaseState {

    private final PracticeFormElements elements;
    private final Calendar calendar;
    private final VerifyResult verifyResult;

    public PracticeFormPage() {
        elements = new PracticeFormElements();
        calendar = new Calendar();
        verifyResult = new VerifyResult();
    }

    /**
     * Открытие окна Practice Form
     */
    public PracticeFormPage openPage() {
        open("/automation-practice-form");
        closeBanner();
        return this;
    }

    /**
     * Ввод в поле First Name
     */
    public PracticeFormPage setFirstName(String value) {
        elements.firstName.setValue(value);
        return this;
    }

    /**
     * Ввод в поле Last Name
     */
    public PracticeFormPage setLastName(String value) {
        elements.lastName.setValue(value);
        return this;
    }

    /**
     * Ввод в поле User Email
     */
    public PracticeFormPage setUserEmail(String value) {
        elements.userEmail.setValue(value);
        return this;
    }

    /**
     * Ввод в поле Gender
     */
    public PracticeFormPage setGender(String value) {
        elements.gender.$(byText(value)).click();
        return this;
    }

    /**
     * Ввод в поле User Number
     */
    public PracticeFormPage setUserNumber(String value) {
        elements.userNumber.setValue(value);
        return this;
    }

    /**
     * Ввод в поле Birth Date
     */
    public PracticeFormPage setBirthDate(String day, String month, String year) {
        elements.birthDay.click();
        calendar.setDateOfBirth(day, month, year);
        return this;
    }

    /**
     * Ввод в поле Subjects
     */
    public PracticeFormPage setSubjects(String value) {
        elements.subjects.setValue(value).pressEnter();
        return this;
    }

    /**
     * Выбор в поле Hobbies
     */
    public PracticeFormPage chooseHobbies(String value) {
        elements.hobbies.$(byText(value)).click();
        return this;
    }

    /**
     * Загрузить файл Picture
     */
    public PracticeFormPage uploadPicture(String value) {
        elements.picture.uploadFromClasspath(value);
        return this;
    }

    /**
     * Ввод в поле Current Address
     */
    public PracticeFormPage setCurrentAddress(String value) {
        elements.currentAddress.setValue(value);
        return this;
    }

    /**
     * Выбор в списке State
     */
    public PracticeFormPage setState(String value) {
        elements.state.click();
        elements.state.$(byText(value)).click();
        return this;
    }

    /**
     * Выбор в списке City
     */
    public PracticeFormPage setCity(String value) {
        elements.city.click();
        elements.city.$(byText(value)).click();
        return this;
    }

    /**
     * Нажать на кнопку Submit
     */
    public void submitBtnClick() {
        elements.submitBtn.click();
    }

    /**
     * Закрыть окно формы авторизации
     */
    public void closeLargeModal() {
        elements.closeLargeModal.click();
    }

    /**
     * Проверка формы авторизации на корректность заполнения
     */
    public PracticeFormPage verifyResultPracticeForm(String key, String value) {
        verifyResult.checkResultPracticeForm(key, value);
        return this;
    }

    public void checkFormHeader() {
        elements.formHeader.shouldBe(visible);
    }
}
