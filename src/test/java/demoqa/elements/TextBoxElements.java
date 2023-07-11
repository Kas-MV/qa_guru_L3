package demoqa.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class TextBoxElements {

    /**
     * Text Box. Header
     */
    public final SelenideElement formHeader = $(".main-header");

    /**
     * Text Box. Full Name
     */
    public final SelenideElement fullName = $("#userName");

    /**
     * Text Box. Email
     */
    public final SelenideElement email = $("#userEmail");

    /**
     * Text Box. Current Address
     */
    public final SelenideElement currentAddress = $("#currentAddress");

    /**
     * Text Box. Permanent Address
     */
    public final SelenideElement permanentAddress = $("#permanentAddress");

    /**
     * Text Box. Button Submit
     */
    public final SelenideElement buttonSubmit = $("button#submit");

    /**
     * Text Box. Output. Name
     */
    public final SelenideElement outputName = $("#output #name");

    /**
     * Text Box. Output. Email
     */
    public final SelenideElement outputEmail = $("#output #email");

    /**
     * Text Box. Output. Current Address
     */
    public final SelenideElement outputCurrentAddress = $("#output #currentAddress");

    /**
     * Text Box. Output. Permananet Address
     */
    public final SelenideElement outputPermanentAddress = $("#output #permanentAddress");
}
