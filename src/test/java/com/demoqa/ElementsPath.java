package com.demoqa;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;

import static com.codeborne.selenide.Selenide.$;

public class ElementsPath {
    static SelenideElement
            firstName = $("#firstName"),
            lastName = $("#lastName"),
            email = $("#userEmail"),
            gender = $("#genterWrapper"),
            mobile = $("#userNumber"),
            dateOfBirth = $("#dateOfBirthInput"),
            subjects = $("#subjectsInput"),
            hobbies = $("#hobbiesWrapper"),
            picture = $("#uploadPicture"),
            currentAddress = $("#currentAddress"),
            state = $("#react-select-3-input"),
            city = $("#react-select-4-input"),
            submit = $("#submit"),
            getStudentName = $(".modal-body").find(new ByText("Student Name")).parent().lastChild(),
            getEmail = $(".modal-body").find(new ByText("Student Email")).parent().lastChild(),
            getGender = $(".modal-body").find(new ByText("Gender")).parent().lastChild(),
            getMobile = $(".modal-body").find(new ByText("Mobile")).parent().lastChild(),
            getDateOfBirth = $(".modal-body").find(new ByText("Date of Birth")).parent().lastChild(),
            getSubjects = $(".modal-body").find(new ByText("Subjects")).parent().lastChild(),
            getHobbies = $(".modal-body").find(new ByText("Hobbies")).parent().lastChild(),
            getPicture = $(".modal-body").find(new ByText("Picture")).parent().lastChild(),
            getCurrentAddress = $(".modal-body").find(new ByText("Address")).parent().lastChild(),
            getStateAndCity = $(".modal-body").find(new ByText("State and City")).parent().lastChild();
}
