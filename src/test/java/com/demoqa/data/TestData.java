package com.demoqa.data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TestData {
    public String
            firstName = "Ivan";
    public String lastName = "Ivanov";
    public String email = "Ivanov.Ivan@gmail.com";
    public String gender = "Male";
    public String mobile = "8999876543";
    public String dateOfBirth = "01.09.1988";
    public String subjects = "Mathematics, History";
    public String picture = "test.txt";
    public String currentAddress = "Random street";
    public String state = "NCR";

    public String city = "Noida";
    public String[] hobbies = {"Sports", "Reading", "Music"};

    public String strHobbies = String.join(", ", hobbies);

    LocalDate date = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("MM.dd.yyyy"));
    public String updateDateOfBirth = date.format(DateTimeFormatter.ofPattern("dd MMMM,yyyy", new Locale("en")));

    public TestData() {
    }
}
