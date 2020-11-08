package ru.evseevav;

public class Main {

    public static void main(String[] args) {
	    Employee tester = new Employee(7, "Developer");
	    // Объект tester создается через конструктор класса Employee с аргументами (long, String)
	    // В классе Employee отстутствует необходимый конструктор
        // Нужно написать в классе Employee конструктор с аргументами (long, String)

        System.out.println(tester.getId());
        System.out.println(tester.getVacancy());
    }
}
