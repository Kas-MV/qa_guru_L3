package demoqa;

import org.demoqa.page.PracticeFormPage;
import org.demoqa.states.BaseState;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class TestDemoqaPracticeForm extends BaseState {

    PracticeFormPage registrationForm = new PracticeFormPage();

    @Test
    @DisplayName("Тест_Demoqa_Practise Form")
    void testPracticeForm() {
        step("1. Открыть окно Practice Form");
        registrationForm.openPage();
        registrationForm.checkFormHeader();

        step("2. Заполнить форму регистрации, нажать кнопку Submit");
        registrationForm
                .setFirstName("Dalip")
                .setLastName("Singh")
                .setUserEmail("dalipsingh@wwe.com")
                .setGender("Male")
                .setUserNumber("8109111123")
                .setBirthDate("27", "August", "1972")
                .setSubjects("Maths")
                .chooseHobbies("Sports")
                .uploadPicture("wwe.jpg")
                .setCurrentAddress("India Dhiraina Village Sirmur District of Himachal Pradesh")
                .setState("NCR")
                .setCity("Gurgaon")
                .submitBtnClick();

        step("3. Проверка формы авторизации на корректность заполнения");
        registrationForm
                .verifyResultPracticeForm("Student Name", "Dalip Singh")
                .verifyResultPracticeForm("Student Email", "dalipsingh@wwe.com")
                .verifyResultPracticeForm("Gender", "Male")
                .verifyResultPracticeForm("Mobile", "8109111123")
                .verifyResultPracticeForm("Date of Birth", "27 August,1972")
                .verifyResultPracticeForm("Subjects", "Maths")
                .verifyResultPracticeForm("Hobbies", "Sports")
                .verifyResultPracticeForm("Picture", "wwe.jpg")
                .verifyResultPracticeForm("Address", "India Dhiraina Village Sirmur District of Himachal Pradesh")
                .verifyResultPracticeForm("State and City", "NCR Gurgaon");

        step("4. Закрыть окно формы авторизации");
        registrationForm.closeLargeModal();
    }
}
