package demoqa.elementsHelper;

public class DemoqaHelperTextBox {

    private String name, email, currentAddress, permanentAddress;

    public DemoqaHelperTextBox() {
        name = "Isaac Newton";
        email = "newtonthebest@isaac.com";
        currentAddress = "Woolsthorpe Manor, Lincolnshire, Kingdom of England";
        permanentAddress = "Kensington, United Kingdom";
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }
}
