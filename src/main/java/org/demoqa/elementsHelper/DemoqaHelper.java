package org.demoqa.elementsHelper;

public class DemoqaHelper {

    private String name, email, currentAddress, permanentAddress;

    public DemoqaHelper() {
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
