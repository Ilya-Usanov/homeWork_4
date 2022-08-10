package com.demoqa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.conditions.Text;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class DemoqaFormTest extends ElementsPath {
    TestData attributes = new TestData();
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
        getStudentName.shouldHave(new Text(attributes.firstName + " " + attributes.lastName));
        getEmail.shouldHave(new Text(attributes.email));
        getGender.shouldHave(new Text(attributes.gender));
        getMobile.shouldHave(new Text(attributes.mobile));
        getDateOfBirth.shouldHave(new Text(attributes.updateDateOfBirth));
        getSubjects.shouldHave(new Text(attributes.subjects));
        getHobbies.shouldHave(new Text(attributes.strHobbies));
        getPicture.shouldHave(new Text(attributes.picture));
        getCurrentAddress.shouldHave(new Text(attributes.currentAddress));
        getStateAndCity.shouldHave(new Text(attributes.state + " " + attributes.city));
    }
}
