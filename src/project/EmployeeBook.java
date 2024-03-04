package project;

public class EmployeeBook {

    private static final Employee[] employees = {
            new Employee("Иван", "1", 5000),
            new Employee("Вася", "1", 5500),
            new Employee("Петр", "1", 13000),
            new Employee("Люся", "1", 60000)
    };

    /**
     * Проверка на null
     *
     * @param employee параметр метода - сотрудник
     */
    public static void validEmployee(Employee employee) {
        if (employee == null) {
            throw new NullPointerException("Значение пустое!");
        }
    }

    /**
     * Получить всех сотрудников
     */
    public static void getEmployeeInformation() {
        for (Employee employee : employees) {
            validEmployee(employee);
            System.out.println(employee);
        }
    }

    /**
     * Метод для нахождения суммы зарплат всех сотрудников
     */
    public static void sumSalaryEmployee() {
        int sum = 0;
        for (Employee a : employees) {
            validEmployee(a);
            int salary = a.getSalary();
            sum = sum + salary;
        }
        System.out.println(sum);
    }

    /**
     * Метод для нахождения сотрудника с минимальной заработной платой
     */
    public static void minSalary() {
        int min = Integer.MAX_VALUE;
        String name = "";
        for (Employee employee : employees) {
            if (employee.getSalary() < min) {
                validEmployee(employee);
                min = employee.getSalary();
                name = employee.getName();
            }
        }
        System.out.println(name + ": " + min);
    }

    /**
     * Метод для нахождения сотрудника с максимальной заработной платой
     */
    public static void maxSalary() {
        int max = Integer.MIN_VALUE;
        String name = "";
        for (Employee employee : employees) {
            validEmployee(employee);
            if (employee.getSalary() > max) {
                max = employee.getSalary();
                name = employee.getName();
            }
        }
        System.out.println(name + ": " + max);
    }

    /**
     * Метод для нохождения среднего значения зароботных плат
     */
    public static void averageSalary() {
        int average = 0;
        int sum = 0;
        for (Employee employee : employees) {
            validEmployee(employee);
            int salary = employee.getSalary();
            sum = sum + salary;
            average = sum / employees.length;
        }
        System.out.println(average);
    }

    /**
     * Метод для получения ФИО сотрудников
     */
    public static void getFullName() {
        for (Employee employee : employees) {
            validEmployee(employee);
            String name = employee.getName();
            System.out.println(name);
        }
    }


    public static void indexSalary(int index) {
        for (Employee employee : employees) {
            validEmployee(employee);
            int salary = employee.getSalary() + (employee.getSalary() / 100 * index);
            System.out.println(salary);
        }
    }

    public static void findTheSalaryEmployeeByDepartmentMin(String department) {
        int min = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            validEmployee(employee);
            if (department.equals(employee.getDepartment())) {
                min = Math.min(min, employee.getSalary());

            }
        }
        System.out.println(min);
    }

    public static void findTheSalaryEmployeeByDepartmentMax(String department) {
        int max = Integer.MIN_VALUE;
        String name = null;
        for (Employee employee : employees) {
            validEmployee(employee);
            if (department.equals(employee.getDepartment())) {
                max = Math.max(max, employee.getSalary());
                name = employee.getName();
            }
        }
        System.out.println(name);
    }
}
