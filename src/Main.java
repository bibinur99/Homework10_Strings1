import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Task One");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " +firstName+ " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println();

    }
    public static void task2() {
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "
                + fullName.toUpperCase());
        System.out.println();
    }
    public static void task3() {
        String name = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника — " +
                name.replace('ё','е'));
        System.out.println();

    }


}