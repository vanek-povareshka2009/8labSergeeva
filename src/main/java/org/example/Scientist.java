package org.example;

public class Scientist {
    private String surname;
    private int year_of_birth;
    private String gender;
    private String field_of_science;

    public String getSurname() { return surname; }

    public int getYear_of_birth() { return year_of_birth; }

    public String getGender() {
        return gender;
    }

    public String getField_of_science() {
        return field_of_science;
    }


    public Scientist(String surname, int year_of_birth, String gender ,String field_of_science) {
        this.surname = surname;
        this.year_of_birth = year_of_birth;
        this.gender = gender;
        this.field_of_science = field_of_science;
    }
}