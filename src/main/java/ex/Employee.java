package ex;

public interface Employee {
        void searchByExperience(int t);
        void searchByPhone(String name);
        Personal searchByPersonnelNumber(int personnelNumber);
        void addPersonnal(int personnelNumber, String phoneNumber, String name, int experience);
        String toStringEmp();
}
