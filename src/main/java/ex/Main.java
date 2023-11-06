package ex;

public class Main {
    /*
    Создать справочник сотрудников
    Необходимо:
    Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников -
        каждый сотрудник должен иметь следующие атрибуты:
    Табельный номер
    Номер телефона
    Имя
    Стаж
     */

    public static void main(String[] args) {

        EmployeeDirectory employeeDirectory = new EmployeeDirectory();
        employeeDirectory.addPersonnal(1, "+7985633452", "Константин", 6);
        employeeDirectory.addPersonnal(2, "+7915633452", "Мария", 2);
        employeeDirectory.addPersonnal(3, "+7935633452", "Вячеслав", 12);
        employeeDirectory.addPersonnal(4, "+7125633452", "Кирелл", 3);
        employeeDirectory.addPersonnal(5, "+7885633452", "Юлия", 1);

        String s = employeeDirectory.toStringEmp();
        System.out.println(s);
        employeeDirectory.searchByExperience(3);
        employeeDirectory.searchByPhone("Юлия");
        Object o = employeeDirectory.searchByPersonnelNumber(1);
        System.out.println(o);

    }
}
