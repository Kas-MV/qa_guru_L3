package demoqa.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class PracticeFormElements {

    /**
     * Practice Form. Student Registration Form
     */
    public final SelenideElement formHeader = $(".practice-form-wrapper");

    /**
     * Practice Form. Name. First Name
     */
    public final SelenideElement firstName = $("#firstName");

    /**
     * Practice Form. Name. Last Name
     */
    public final SelenideElement lastName = $("#lastName");

    /**
     * Practice Form. Email
     */
    public final SelenideElement userEmail = $("#userEmail");

    /**
     * Practice Form. Gender
     */
    public final SelenideElement gender = $("#genterWrapper");

    /**
     * Practice Form. Mobile
     */
    public final SelenideElement userNumber = $("#userNumber");

    /**
     * Practice Form. Date of Birth
     */
    public final SelenideElement birthDay = $("#dateOfBirthInput");

    /**
     * Practice Form. Subjects
     */
    public final SelenideElement subjects = $("#subjectsInput");

    /**
     * Practice Form. Hobbies
     */
    public final SelenideElement hobbies = $("#hobbiesWrapper");

    /**
     * Practice Form. Picture
     */
    public final SelenideElement picture = $("#uploadPicture");

    /**
     * Practice Form. Current Address
     */
    public final SelenideElement currentAddress = $("#currentAddress");

    /**
     * Practice Form. State and City. Stata
     */
    public final SelenideElement state = $("#state");

    /**
     * Practice Form. State and City. City
     */
    public final SelenideElement city = $("#city");

    /**
     * Practice Form. Submit button
     */
    public final SelenideElement submitBtn = $("button#submit");

    /**
     * Practice Form. close Large Modal
     */
    public final SelenideElement closeLargeModal = $("button#closeLargeModal");

    /**
     * Practice Form. close Large Modal
     */
    public final SelenideElement table = $(".table-responsive");

    /**
     * Practice Form. close Large Modal
     */
    public final SelenideElement header = $("#example-modal-sizes-title-lg");

}


