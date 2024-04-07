// Plik Company.java
public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Kamil Robak", 50000);
        employees[1] = new Employee("Filip Bobek", 60000);
        employees[2] = new Employee("Antonii Skrobacz", 70000);
        employees[3] = new Employee("Andrzej Wujkowski", 55000);
        employees[4] = new Employee("Anna Gepard ", 65000);

        // Dane pracownika o indeksie  3
        System.out.println("Dane pracownika o indeksie 3:");
        System.out.println(employees[3]);

        // salary dla pracownika o indeksie  3
        employees[3].setSalary(60000);

        // Dane wszystkich pracowników
        System.out.println("\nDane wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
