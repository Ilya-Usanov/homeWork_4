package com.demoqa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TestData {
    String
            firstName = "Ivan",
            lastName = "Ivanov",
            email = "Ivanov.Ivan@gmail.com",
            gender = "Male",
            mobile = "8999876543",
            dateOfBirth = "01.09.1988",
            subjects = "Mathematics, History",
            picture = "test.txt",
            currentAddress = "Random street",
            state = "NCR",
            city = "Noida";
    String[] hobbies = {"Sports", "Reading", "Music"};

    String strHobbies = String.join(", ", hobbies);

    LocalDate date = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("MM.dd.yyyy"));
    String updateDateOfBirth = date.format(DateTimeFormatter.ofPattern("dd MMMM,yyyy", new Locale("en")));

    public TestData() {
    }
}
