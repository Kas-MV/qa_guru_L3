package demoqa;

import org.demoqa.elementsHelper.DemoqaHelper;
import org.demoqa.states.BaseState;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestDemoqa extends BaseState {
    private static final DemoqaHelper helper = new DemoqaHelper();


    @Test
    void testPracticeForm() {
        open("/automation-practice-form");
        closeBanner();

        $("#firstName").setValue("Dalip");
        $("#lastName").setValue("Singh");
        $("#userEmail").setValue("dalipsingh@wwe.com");
        $("#genterWrapper").find(byText("Male")).click();
        $("#userNumber").setValue("8109111123");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("August");
        $(".react-datepicker__year-select").selectOption("1972");
        $$(".react-datepicker__day").findBy(text("27")).click();
        $("#subjectsInput").setValue("Maths").pressEnter();
        $("#subjectsInput").setValue("Computer Science").pressEnter();
        $("#hobbiesWrapper").find(byText("Sports")).click();
        $("#hobbiesWrapper").find(byText("Music")).click();
        $("#uploadPicture").uploadFromClasspath("wwe.jpg");
        $("#currentAddress").setValue("India Dhiraina Village Sirmur District of Himachal Pradesh");
        $("#react-select-3-input").setValue("NCR").pressEnter();
        $("#react-select-4-input").setValue("Gurgaon").pressEnter();
        $("#submit").click();

        helper.checkResult();

        $("#closeLargeModal").click();
    }
}
