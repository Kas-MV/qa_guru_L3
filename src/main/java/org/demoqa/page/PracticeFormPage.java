package org.demoqa.page;

import com.github.javafaker.Faker;
import org.demoqa.elements.PracticeFormElements;
import org.demoqa.elementsHelper.DemoqaHelperPracticeForm;
import org.demoqa.states.BaseState;
import org.demoqa.states.RemoteBaseState;
import org.demoqa.util.Calendar;
import org.demoqa.util.VerifyResult;

import java.text.SimpleDateFormat;
import java.util.Locale;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.open;

public class PracticeFormPage extends RemoteBaseState {

    private final PracticeFormElements elements;
    private final Calendar calendar;
    private final VerifyResult verifyResult;
    private static DemoqaHelperPracticeForm helperPracticeForm = new DemoqaHelperPracticeForm();
    Faker faker = new Faker();

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
    public PracticeFormPage setBirthDate() {
        randomDateBirth();
        elements.birthDay.click();
        calendar.setDateOfBirth(helperPracticeForm.getDay(), helperPracticeForm.getMonth(), helperPracticeForm.getYear());
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

    public void randomDateBirth() {
        SimpleDateFormat dayFormat = new SimpleDateFormat("dd");
        SimpleDateFormat monthsFormat = new SimpleDateFormat("MMMM", Locale.ENGLISH);
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy", Locale.ENGLISH);
        String day = dayFormat.format(faker.date().birthday());
        String month = monthsFormat.format(faker.date().birthday());
        String year = yearFormat.format(faker.date().birthday());
        helperPracticeForm.setDay(day);
        helperPracticeForm.setMonth(month);
        helperPracticeForm.setYear(year);
    }
}
