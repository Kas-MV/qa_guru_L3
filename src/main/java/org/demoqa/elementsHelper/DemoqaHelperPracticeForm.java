package org.demoqa.elementsHelper;

import com.github.javafaker.Faker;
import org.demoqa.util.RandomDataUtils;

public class DemoqaHelperPracticeForm {

    Faker faker = new Faker();

    private String firstName, lastName, userEmail, gender, userNumber, birthDate, subject, hobbies, picture, currentAddress, state, city, day, month, year;

    public DemoqaHelperPracticeForm() {

        firstName = faker.name().firstName();
        lastName = faker.name().lastName();
        userEmail = faker.internet().emailAddress();
        gender = faker.options().option("Male", "Female", "Other");
        userNumber = faker.phoneNumber().subscriberNumber(10);
        birthDate = "";
        subject = RandomDataUtils.randomString("ABCEP", 1);
        hobbies = faker.options().option("Sports", "Reading", "Music");
        picture = "wwe.jpg";
        currentAddress = faker.address().fullAddress();
        state = faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
        city = RandomDataUtils.randomCity(getState());
        day = "";
        month = "";
        year = "";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
