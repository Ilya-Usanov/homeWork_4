package com.demoqa;

import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.Keys;

import java.io.File;

public class FillsAttributes {

    public void fillsFirstName(Attributes attribute) {
        ElementsPath.firstName.setValue(attribute.firstName);
    }

    public void fillsLastName(Attributes attribute) {
        ElementsPath.lastName.setValue(attribute.lastName);
    }

    public void fillsEmail(Attributes attribute) {
        ElementsPath.email.setValue(attribute.email);
    }

    public void fillsGender(Attributes attribute) {
        ElementsPath.gender.find(new ByText(attribute.gender)).click();
    }

    public void fillsMobile(Attributes attribute) {
        ElementsPath.mobile.setValue(attribute.mobile);
    }

    public void fillsDateOfBirth(Attributes attribute) {
        ElementsPath.dateOfBirth.sendKeys(Keys.CONTROL + "A");
        ElementsPath.dateOfBirth.sendKeys(attribute.dateOfBirth + Keys.ENTER);
    }

    public void fillsSubjects(Attributes attribute) {
        ElementsPath.subjects.setValue(attribute.subjects);
    }

    public void fillsHobbies(Attributes attribute) {
        for (String h : attribute.hobbies) {
            ElementsPath.hobbies.find(new ByText(h)).click();
        }
    }

    public void fillsPicture(Attributes attribute) {
        ElementsPath.picture.uploadFile(new File("src/test/resources/" + attribute.picture));
    }

    public void fillsCurrentAddress(Attributes attribute) {
        ElementsPath.currentAddress.setValue(attribute.currentAddress);
    }

    public void fillsState(Attributes attribute) {
        ElementsPath.state.setValue(attribute.state).pressEnter();
    }

    public void fillsCity(Attributes attribute) {
        ElementsPath.city.setValue(attribute.city).pressEnter();
    }

    public void fillsElements(Attributes attribute) {
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
        ElementsPath.submit.click();
    }
}
