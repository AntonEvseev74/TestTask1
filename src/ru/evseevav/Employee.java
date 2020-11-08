package ru.evseevav;

public class Employee {
    private long id;
    private Vacancy vacancy;

    /* Добавленный код, начало */
    /* Конструктор класса */
    public Employee(long id, String vacancy) {
        this.id = id;
        this.vacancy = new Vacancy(vacancy);
        // при создании объекта класса Vacancy передается параметр
        // в самом классе Vacancy отсутствует необходимый конструктор, нужно создать
        // а так же отсутствует поле принимаемое значение передаваемого парметра
        // Переходим в класс Vacancy:
        // добавляем поле:=> String vacancy;
        // добавляем конструктор:=> Vacancy (String vacancy) {this.vacancy = vacancy;}
    }
    /* При необходимости создания пустого объекта можно добавить пустой конструктор класса */
    public Employee(){}
    /* Добавленный код, конец */

    String getVacancy() {
        return vacancy.getVacancy();
    }

    long getId() {
        return id;
    }
}
