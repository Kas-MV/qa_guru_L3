package org.demoqa.elementsHelper;

import java.util.Arrays;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class DemoqaHelper {
    public void checkResult() {
        for (String table : Arrays.asList("Thanks for submitting the form", "Dalip Singh", "dalipsingh@wwe.com",
                "Male", "8109111123", "27 August,1972", "Maths, Computer Science", "Sports, Music", "wwe.jpg",
                "India Dhiraina Village Sirmur District of Himachal Pradesh", "NCR Gurgaon")) {
            $(".modal-content").shouldHave(text(table));
        }
    }
}
