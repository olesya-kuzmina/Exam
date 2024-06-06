package Basic;

public class Main {

    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Иванов", "Иван", "Иванович", 1, 40000);
        employees[1] = new Employee("Васильева", "Елена", "Петровна", 2, 35000);
        employees[2] = new Employee("Козлов", "Георгий", "Никитич", 3, 60000);
        employees[3] = new Employee("Ерёмина", "Елена", "Владимировна", 4, 44000);
        employees[4] = new Employee("Петров", "Алексей", "Иванович", 5, 55000);
        employees[5] = new Employee("Кульгускина", "Лариса", "Игоревна", 1, 50000);
        employees[6] = new Employee("Степаненко", "Евгений", "Фёдорович", 3, 47000);
        employees[7] = new Employee("Звонцова", "Алла", "Павловна", 5, 40000);
        employees[8] = new Employee("Артанов", "Михаил", "Сергеевич", 2, 65000);
        employees[9] = new Employee("Гришанова", "Ирина", "Марковна", 5, 49000);

        //Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)):
        getAllEmployees();
        System.out.println();
        System.out.println("Общая сумма затрат на зарплаты: " + getSumSalary());
        System.out.println();
        System.out.println("Cотрудник с минимальной зарплатой: " + getMinSalary());
        System.out.println();
        System.out.println("Cотрудник с максимальной зарплатой: " + getMaxSalary());
        System.out.println();
        System.out.println("Среднее значение зарплат: " + getAverageSalary());
        getFullName();
        }

        public static void getAllEmployees() {
            if (employees != null) {
                for (Employee employee : employees) {
                    System.out.println(employee);
                }
            }
        }


        //Посчитать сумму затрат на зарплаты в месяц:
    public static double getSumSalary() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee == null) continue;
            sum += employee.getSalary();
        }
        return sum;
    }

    //Найти сотрудника с минимальной зарплатой:
    public static Employee getMinSalary() {
        double min = 0;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                min = employees[i].getSalary();
                index = i;
                break;
            }
        }
        Employee minSalary = employees[index];
        for (int i = index; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                minSalary = employees[i];
            }
        }
        return minSalary;
    }

    //Найти сотрудника с максимальной зарплатой:
    public static Employee getMaxSalary() {
        double max = 0;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                max = employees[i].getSalary();
                index = i;
                break;
            }
        }
        Employee maxSalary = employees[index];
        for (int i = index; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                maxSalary = employees[i];
            }
        }
        return maxSalary;
    }

    //Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b):
        public static double getAverageSalary() {
            double sum = getSumSalary();
            int count = countEmployees();
            return sum / count;
        }
    public static int countEmployees() {
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                count++;
            }
        }
        return count;
    }
    public static void getFullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    }



