package ex;

public interface Employee {
        void searchByExperience(int s);
        void searchByPhone(String name);
        void searchByPersonnelNumber(int personnelNumber);
        void addPersonnal(int personnelNumber, String phoneNumber, String name, int experience);
}
