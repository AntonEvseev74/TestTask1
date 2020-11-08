# TestTask1
Тестовое задание. Задача 1.

/* Условие:
    Есть часть кода. Автор кода хотел получить вывод в консоль:
    7
    Developer
*/

/* Дано (код):
    public static void main(String[] args) {
	    Employee tester = new Employee(7, "Developer");
        System.out.println(tester.getId());
        System.out.println(tester.getVacancy());
    }

    class Employee {
        private long id;
        private Vacancy vacancy;

        String getVacancy() {
            return vacancy.getVacancy();
        }

        long getId() {
            return id;
        }

    class Vacancy {
        String getVacancy() {
            return "engineer";
        }
    }
*/

/* Вопрос:
    Почему данная реализация не обеспечивает желаемый результат?
    Доработайте код.
 */
