package ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

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

        List<EmployeeDirectory> list1 = addPersonnal();
        searchByExperience(list1, 3);
        searchByPhone(list1, "Юлия");
        searchByPersonnelNumber(list1, 1);
    }

    //  Добавить метод, который ищет сотрудника по стажу (может быть список)
    public static void searchByExperience(List<EmployeeDirectory> empDir, int Experience) {

        for (EmployeeDirectory employeeDirectory : empDir) {
            if (employeeDirectory.getExperience() == Experience) {
                System.out.println(employeeDirectory.getName() + ", стаж - " + employeeDirectory.getExperience());
            }
        }
    }

    //  Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
    public static void searchByPhone(List<EmployeeDirectory> empDir, String name) {
        for (EmployeeDirectory employeeDirectory : empDir) {
            if (Objects.equals(employeeDirectory.getName(), name)) {
                System.out.println("Номер телефона " + employeeDirectory.getName() + " - "
                        + employeeDirectory.getPhoneNumber());
            }
        }
    }

    //  Добавить метод, который ищет сотрудника по табельному номеру
    public static void searchByPersonnelNumber(List<EmployeeDirectory> empDir, int personnelNumber) {
        for (EmployeeDirectory employeeDirectory : empDir) {
            if (employeeDirectory.getPersonnelNumber() == personnelNumber) {
                System.out.println("Табельный номер: " + employeeDirectory.getPersonnelNumber() + " - "
                        + employeeDirectory.getName());
            }
        }
    }

    //  Добавить метод добавление нового сотрудника в справочник
    public static List<EmployeeDirectory> addPersonnal() {
        List<EmployeeDirectory> list = new ArrayList<>();
        list.add(new EmployeeDirectory(1, "+7985633452", "Константин", 6));
        list.add(new EmployeeDirectory(3, "+7915633452", "Мария", 2));
        list.add(new EmployeeDirectory(4, "+7935633452", "Вячеслав", 12));
        list.add(new EmployeeDirectory(5, "+7125633452", "Кирелл", 3));
        list.add(new EmployeeDirectory(6, "+7885633452", "Юлия", 1));
        return list;
    }
}
