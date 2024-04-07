package employees;

public class Worker extends Employee {
    private String position;

    public Worker(String firstName, String lastName, double salary, String position) {
        super(firstName, lastName, salary);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Pracownik: " + getFullName() + ", Wypłata: " + getSalary() + ", Stanowisko: " + position;
    }
}
