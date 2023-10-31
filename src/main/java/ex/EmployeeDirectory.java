package ex;

import java.util.List;

public class EmployeeDirectory {
    private final int personnelNumber;
    private final String phoneNumber;
    private final String Name;
    private final int Experience;


    public EmployeeDirectory(int personnelNumber, String phoneNumber, String name, int experience) {
            this.personnelNumber = personnelNumber;
            this.phoneNumber = phoneNumber;
            this.Name = name;
            this.Experience = experience;
    }

    public int getPersonnelNumber() {
        return personnelNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return Name;
    }

    public int getExperience() {
        return Experience;
    }


    @Override
    public String toString() {
        return "EmployeeDirectory{" +
                "personnelNumber = " + personnelNumber +
                ", phoneNumber = " + phoneNumber +
                ", Name = " + Name +
                ", Experience = " + Experience +
                '}';
    }
}
