package ex;

import java.util.*;

public class EmployeeDirectory implements Employee {

    List<Personal> personals = new LinkedList<>();

    public EmployeeDirectory() {
    }

    //  Добавить метод, который ищет сотрудника по стажу (может быть список)
    @Override
    public void searchByExperience(int experience) {

        for (Personal personal : personals) {
            if (personal.getExperience() == experience) {
                System.out.println(personal.getName() + ", стаж - " + personal.getExperience());
            }
        }
    }

    //  Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
    @Override
    public void searchByPhone(String name) {
        for (Personal personal : personals) {
            if (Objects.equals(personal.getName(), name)) {
                System.out.println("Номер телефона " + personal.getName() + " - "
                        + personal.getPhoneNumber());
            }
        }
    }

    //  Добавить метод, который ищет сотрудника по табельному номеру
    @Override
    public void searchByPersonnelNumber(int personnelNumber) {
        for (Personal personal : personals) {
            if (personal.getPersonnelNumber() == personnelNumber) {
                System.out.println("Табельный номер: " + personal.getPersonnelNumber() + " - "
                        + personal.getName());
            }
        }
    }

    //  Добавить метод добавление нового сотрудника в справочник
    @Override
    public void addPersonnal(int personnelNumber, String phoneNumber, String name,
                             int experience) {
        personals.add(new Personal(personnelNumber, phoneNumber, name, experience));
    }

    @Override
    public String toString() {
        return  "" + personals ;
    }
}
