package employees;

public class Manager extends Employee {
    private int numberOfSubordinates;

    public Manager(String firstName, String lastName, double salary, int numberOfSubordinates) {
        super(firstName, lastName, salary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public String toString() {
        return "Menadżer: " + getFullName() + ", Wyplata: " + getSalary() + ", Subordinates: " + numberOfSubordinates;
    }
}
