public class Main {
    private static Employee1[] employees = new Employee1[10];

    public static void main(String[] args) {
        employees[0] = new Employee1("Иванов", "Иван", "Иванович", 1, 40000);
        employees[1] = new Employee1("Васильева", "Елена", "Петровна", 2, 35000);
        employees[2] = new Employee1("Козлов", "Георгий", "Никитич", 3, 60000);
        employees[3] = new Employee1("Ерёмина", "Елена", "Владимировна", 4, 44000);
        employees[4] = new Employee1("Петров", "Алексей", "Иванович", 5, 55000);
        employees[5] = new Employee1("Кульгускина", "Лариса", "Игоревна", 1, 50000);
        employees[6] = new Employee1("Степаненко", "Евгений", "Фёдорович", 3, 47000);
        employees[7] = new Employee1("Звонцова", "Алла", "Павловна", 5, 40000);
        employees[8] = new Employee1("Артанов", "Михаил", "Сергеевич", 2, 65000);
        employees[9] = new Employee1("Гришанова", "Ирина", "Марковна", 5, 49000);

    }

    //Получить в качестве параметра номер отдела (1–5) и найти (всего 6 методов):

    //1. Сотрудника с максимальной зарплатой:
    private static void getEmployeeWithMaxSalary(int department) {
        Employee1 maxSalaryEmployee = null;
        double maxSalary = Double.MIN_VALUE;
        for (Employee1 employee : employees) {
            if (employee.getDepartment() == department && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                maxSalaryEmployee = employee;
            }
        }
        if (maxSalaryEmployee != null) {
            System.out.println("Сотрудник с максимальной зарплатой в отделе " + department + ": ");
            System.out.println(maxSalaryEmployee);
        } else {
            System.out.println("В отделе " + department + " нет сотрудников.");
        }
    }


    //2. Сотрудника с минимальной зарплатой:
    private static void getEmployeeWithMinSalary(int department) {
    Employee1 minSalaryEmployee = null;
    double minSalary = Double.MAX_VALUE;
    for (Employee1 employee : employees) {
        if (employee.getDepartment() == department && employee.getSalary() < minSalary) {
            minSalary = employee.getSalary();
            minSalaryEmployee = employee;
        }
    }
    if (minSalaryEmployee != null) {
        System.out.println("Сотрудник с минимальной зарплатой в отделе " + department + ": ");
        System.out.println(minSalaryEmployee);
    } else {
        System.out.println("В отделе " + department + " нет сотрудников.");
    }
}

   //3. Сумму затрат на зарплату по отделу:
    public static double getSumSalary(int department) {
        double sum = 0;
        for (Employee1 employee : employees) {
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    // 4. Средняя зарплата по отделу:
    public static double getAverageSalary(int department) {
        double sum = 0;
        int count = 0;
        for (Employee1 employee : employees) {
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }
        return sum / count;
    }
    //5. Напечатать всех сотрудников отдела (все данные, кроме отдела):
    private static void getFullName(int department) {
        for (Employee1 employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println(employee.getFullNameDepartment());
            }
        }
    }




    //Вывести всех сотрудников с зарплатой меньше числа
    public static void salaryIsLessThanCertainNumber(double number) {
        for (Employee1 employee : employees) {
            if (employee != null && employee.getSalary() < number) {
                System.out.println(employee.getFullNameDepartment());
            }
        }
    }
    //b. Вывести всех сотрудников с зарплатой с зарплатой больше (или равно) числа
    public static void salaryIsGreaterOrEqualCertainNumber(double number) {
        for (Employee1 employee : employees) {
            if (employee != null && employee.getSalary() >= number) {
                System.out.println(employee.getFullNameDepartment());
            }
        }
    }
}