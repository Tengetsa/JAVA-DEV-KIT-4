package ex;

public class Personal {
    private final int personnelNumber;
    private final String phoneNumber;
    private final String Name;
    private final int Experience;


    public Personal(int personnelNumber, String phoneNumber, String name, int experience) {
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
        return '{' + "personnelNumber = " + personnelNumber +
                ", phoneNumber = " + phoneNumber +
                ", Name = " + Name +
                ", Experience = " + Experience +
                '}';
    }
}
