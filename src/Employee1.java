public class Employee1 {

    private final int id;

    private String surName;

    private String firstName;

    private String middleName;

    private int department;

    private double salary;

    private static int counter;

    public Employee1( String surName, String firstName, String middleName, int department, double salary) {
        if (department < 0 || department > 5) {
            throw new IllegalArgumentException("Введено неверное значение. Такого отдела не существует!");
        }
        this.id = getCounter();
        this.firstName = firstName;
        this.surName = surName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        counter++;
    }
    public int getId() {
        return id;
    }
    public String getSurName() {
        return surName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public int getDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }
    public static int getCounter() {
        return counter;
    }
    public void setDepartment(int department) {
        if (department < 0 || department > 5) {
            throw new IllegalArgumentException("Введено неверное значение. Такого отдела не существует!");
        }
        this.department = department;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Basic.Employee{" +
                "id = " + id +
                ", Фамилия = '" + surName + '\'' +
                ", Имя = '" + firstName + '\'' +
                ", Отчество = '" + middleName + '\'' +
                ", Отдел = " + department +
                ", Зарплата = " + salary +
                '}';
    }
    public String getFullName() {
        return "Basic.Employee{" +
                "Фамилия = '" + surName + '\'' +
                ", Имя = '" + firstName + '\'' +
                ", Отчество = '" + middleName + '\'' +
                '}';
    }

    public String getFullNameDepartment() {
        return "Employee{" +
                "id = " + id +
                ", Фамилия = '" + surName + '\'' +
                ", Имя = '" + firstName + '\'' +
                ", Отчество = '" + middleName + '\'' +
                ", Зарплата = " + salary +
                '}';
    }
}