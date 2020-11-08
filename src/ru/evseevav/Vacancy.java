package ru.evseevav;

public class Vacancy {
    /* Добавленный код, начало */
    /* добавляем поле vacancy типа String */
    String vacancy;

    /* Добавляем конструктор с параметром */
    Vacancy (String vacancy) {
        this.vacancy = vacancy;
    }
    /* Добавленный код, конец. Переходим в класс Main и проверяем работу программы */

    String getVacancy() {
        return "engineer";
    }
}
