package demoqa;

import org.demoqa.elements.PracticeFormElements;
import org.demoqa.elementsHelper.DemoqaHelper;
import org.demoqa.page.PracticeFormPage;
import org.demoqa.states.BaseState;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static io.qameta.allure.Allure.step;

public class TestDemoqaPracticeForm extends BaseState {

    PracticeFormPage registrationForm = new PracticeFormPage();
    PracticeFormElements elements = new PracticeFormElements();

    @Test
    @DisplayName("Тест_Demoqa_Practise Form")
    void testPracticeForm() {
        step("1. Открыть окно Practice Form");
        registrationForm.openPage();
        elements.formHeader.shouldBe(visible);

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
        registrationForm.checkResultPracticeForm();

        step("4. Закрыть окно формы авторизации");
        registrationForm.closeLargeModal();
    }
}
