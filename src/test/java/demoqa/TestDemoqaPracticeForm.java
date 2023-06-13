package demoqa;

import org.demoqa.elementsHelper.DemoqaHelperPracticeForm;
import org.demoqa.page.PracticeFormPage;
import org.demoqa.states.BaseState;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class TestDemoqaPracticeForm extends BaseState {

    PracticeFormPage registrationForm = new PracticeFormPage();
    DemoqaHelperPracticeForm helperPracticeForm = new DemoqaHelperPracticeForm();

    @Test
    @DisplayName("Тест_Demoqa_Practise Form")
    void testPracticeForm() {
        step("1. Открыть окно Practice Form");
        registrationForm.openPage();
        registrationForm.checkFormHeader();

        step("2. Заполнить форму регистрации, нажать кнопку Submit");
        registrationForm
                .setFirstName(helperPracticeForm.getFirstName())
                .setLastName(helperPracticeForm.getLastName())
                .setUserEmail(helperPracticeForm.getUserEmail())
                .setGender(helperPracticeForm.getGender())
                .setUserNumber(helperPracticeForm.getUserNumber())
                .setBirthDate()
                .setSubjects(helperPracticeForm.getSubject())
                .chooseHobbies(helperPracticeForm.getHobbies())
                .uploadPicture(helperPracticeForm.getPicture())
                .setCurrentAddress(helperPracticeForm.getCurrentAddress())
                .setState(helperPracticeForm.getState())
                .setCity(helperPracticeForm.getCity())
                .submitBtnClick();

        step("3. Проверка формы авторизации на корректность заполнения");
        registrationForm
                .verifyResultPracticeForm("Student Name", helperPracticeForm.getFirstName() + " " + helperPracticeForm.getLastName())
                .verifyResultPracticeForm("Student Email", helperPracticeForm.getUserEmail())
                .verifyResultPracticeForm("Gender", helperPracticeForm.getGender())
                .verifyResultPracticeForm("Mobile", helperPracticeForm.getUserNumber())
                .verifyResultPracticeForm("Date of Birth", helperPracticeForm.getDay() + " " + helperPracticeForm.getMonth() + " " + helperPracticeForm.getYear())
                .verifyResultPracticeForm("Subjects", helperPracticeForm.getSubject())
                .verifyResultPracticeForm("Hobbies", helperPracticeForm.getHobbies())
                .verifyResultPracticeForm("Picture", helperPracticeForm.getPicture())
                .verifyResultPracticeForm("Address", helperPracticeForm.getCurrentAddress())
                .verifyResultPracticeForm("State and City", helperPracticeForm.getState() + " " + helperPracticeForm.getCity());

        step("4. Закрыть окно формы авторизации");
        registrationForm.closeLargeModal();
    }
}
