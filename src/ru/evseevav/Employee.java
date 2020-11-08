package ru.evseevav;

public class Employee {
    private long id;
    private Vacancy vacancy;

    String getVacancy() {
        return vacancy.getVacancy();
    }

    long getId() {
        return id;
    }
}
