package ru.evseevav;

public class Employee {
    private long id;
    private Vacancy vacancy;

    /* Добавленный код */
    /* Конструктор класса */
    public Employee(long id, String vacancy) {
        this.id = id;
        this.vacancy = new Vacancy(vacancy);
        // при создании объекта класса Vacancy передается параметр
        // в самом классе Vacancy отсутствует необходимый конструктор, нужно создать
    }
    /* При необходимости создания пустого объекта можно добавить пустой конструктор класса */
    public Employee(){}

    String getVacancy() {
        return vacancy.getVacancy();
    }

    long getId() {
        return id;
    }
}
