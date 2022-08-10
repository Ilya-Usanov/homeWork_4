package com.demoqa;

import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.Keys;

import java.io.File;

public class FillsAttributes extends ElementsPath {

    public void fillsFirstName(TestData attribute) {
        firstName.setValue(attribute.firstName);
    }

    public void fillsLastName(TestData attribute) {
        lastName.setValue(attribute.lastName);
    }

    public void fillsEmail(TestData attribute) {
        email.setValue(attribute.email);
    }

    public void fillsGender(TestData attribute) {
        gender.find(new ByText(attribute.gender)).click();
    }

    public void fillsMobile(TestData attribute) {
        mobile.setValue(attribute.mobile);
    }

    public void fillsDateOfBirth(TestData attribute) {
        dateOfBirth.sendKeys(Keys.CONTROL + "A");
        dateOfBirth.sendKeys(attribute.dateOfBirth + Keys.ENTER);
    }

    public void fillsSubjects(TestData attribute) {
        subjects.setValue(attribute.subjects);
    }

    public void fillsHobbies(TestData attribute) {
        for (String h : attribute.hobbies) {
            hobbies.find(new ByText(h)).click();
        }
    }

    public void fillsPicture(TestData attribute) {
        picture.uploadFile(new File("src/test/resources/" + attribute.picture));
    }

    public void fillsCurrentAddress(TestData attribute) {
        currentAddress.setValue(attribute.currentAddress);
    }

    public void fillsState(TestData attribute) {
        state.setValue(attribute.state).pressEnter();
    }

    public void fillsCity(TestData attribute) {
        city.setValue(attribute.city).pressEnter();
    }

    public void fillsElements(TestData attribute) {
        fillsFirstName(attribute);
        fillsLastName(attribute);
        fillsEmail(attribute);
        fillsGender(attribute);
        fillsMobile(attribute);
        fillsDateOfBirth(attribute);
        fillsSubjects(attribute);
        fillsHobbies(attribute);
        fillsPicture(attribute);
        fillsCurrentAddress(attribute);
        fillsState(attribute);
        fillsCity(attribute);
        submit.click();
    }
}
