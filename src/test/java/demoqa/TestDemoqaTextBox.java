package demoqa;

import org.demoqa.elementsHelper.DemoqaHelperTextBox;
import org.demoqa.page.TextBoxPage;
import org.demoqa.states.BaseState;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class TestDemoqaTextBox extends BaseState {

    private static final DemoqaHelperTextBox helperTextBox = new DemoqaHelperTextBox();
    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    @DisplayName("Тест_Demoqa_Text Box")
    void testTextBox() {
        step("1.Открыть окно Text Box");
        textBoxPage.openPageTextBox();
        textBoxPage.checkFormHeader();

        step("2. Заполнить форму регистрации, нажать кнопку Submit");
        textBoxPage
                .setFullName(helperTextBox.getName())
                .setEmail(helperTextBox.getEmail())
                .setCurrentAddress(helperTextBox.getCurrentAddress())
                .setPermanentAddress(helperTextBox.getPermanentAddress())
                .clickButtonSubmit();

        step("3. Проверка формы авторизации");
        textBoxPage
                .checkResult(helperTextBox.getName(), helperTextBox.getEmail(),
                        helperTextBox.getCurrentAddress(), helperTextBox.getPermanentAddress());
    }
}
