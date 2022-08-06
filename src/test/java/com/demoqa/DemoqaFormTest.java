package com.demoqa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.conditions.Text;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class DemoqaFormTest {

    Attributes attributes = new Attributes();
    FillsAttributes fillsAttributes = new FillsAttributes();

    @BeforeAll
    static void configure() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void formTest() {
        open("/automation-practice-form");
        fillsAttributes.fillsElements(attributes);
        ElementsPath.getStudentName.shouldHave(new Text(attributes.firstName + " " + attributes.lastName));
        ElementsPath.getEmail.shouldHave(new Text(attributes.email));
        ElementsPath.getGender.shouldHave(new Text(attributes.gender));
        ElementsPath.getMobile.shouldHave(new Text(attributes.mobile));
        ElementsPath.getDateOfBirth.shouldHave(new Text(attributes.updateDateOfBirth));
        ElementsPath.getSubjects.shouldHave(new Text(attributes.subjects));
        ElementsPath.getHobbies.shouldHave(new Text(attributes.strHobbies));
        ElementsPath.getPicture.shouldHave(new Text(attributes.picture));
        ElementsPath.getCurrentAddress.shouldHave(new Text(attributes.currentAddress));
        ElementsPath.getStateAndCity.shouldHave(new Text(attributes.state + " " + attributes.city));
    }
}
