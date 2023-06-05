package demoqa;

import org.demoqa.elements.TextBoxElements;
import org.demoqa.elementsHelper.DemoqaHelper;
import org.demoqa.page.TextBoxPage;
import org.demoqa.states.BaseState;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static io.qameta.allure.Allure.step;

public class TestDemoqaTextBox extends BaseState {

    private static final DemoqaHelper helper = new DemoqaHelper();
    TextBoxPage textBoxPage = new TextBoxPage();
    TextBoxElements textBoxElements = new TextBoxElements();

    @Test
    @DisplayName("Тест_Demoqa_Text Box")
    void testTextBox() {
        step("1.Открыть окно Text Box");
        textBoxPage.openPageTextBox();
        textBoxElements.formHeader.shouldHave(visible);

        step("2. Заполнить форму регистрации, нажать кнопку Submit");
        textBoxPage
                .setFullName(helper.getName())
                .setEmail(helper.getEmail())
                .setCurrentAddress(helper.getCurrentAddress())
                .setPermanentAddress(helper.getPermanentAddress())
                .clickButtonSubmit();

        step("3. Проверка формы авторизации");
        textBoxPage
                .checkResult(helper.getName(), helper.getEmail(),
                        helper.getCurrentAddress(), helper.getPermanentAddress());
    }
}
