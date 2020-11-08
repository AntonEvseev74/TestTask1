package ru.evseevav;

public class Vacancy {
    /* Добавленный код, начало */
    /* добавляем поле vacancy типа String */
    String vacancy;

    /* Добавляем конструктор с параметром */
    Vacancy (String vacancy) {
        this.vacancy = vacancy;
    }
    /* Добавленный код, конец. */

    /* Исправляем код, начало */
    String getVacancy() {
        return vacancy;
        // вместо того чтобы вернуть строку "engineer"
        // нам необходимо вернуть строку полученную при создании объекта - tester, класса - Employee
        // поэтому возвращаем - vacancy
    }
    /* Исправляем код, конец */
}

/* Переходим в класс Main содержащий главный метод входа в программу main.
        Проверяем работу программы.
 */
