package project.service.impl;

import project.model.Employee;
import project.service.EmployeeBookService;

/**
 * Класс для работы с методами книги сотрудников
 */
public class EmployeeBookServiceImpl implements EmployeeBookService {

    public EmployeeBookServiceImpl() {
    }

    private final Employee[] employees = {
            new Employee("Иван", "2", 55000),
            new Employee("Вася", "2", 5500),
            new Employee("Петр", "1", 13000),
            new Employee("Люся", "1", 60000)
    };

    @Override
    public void validEmployee(Employee employee) {
        if (employee == null) {
            throw new NullPointerException("Значение пустое!");
        }
    }

    @Override
    public void getEmployeeInformation() {
        for (Employee employee : employees) {
            validEmployee(employee);
            System.out.println(employee);
        }
    }

    @Override
    public void sumSalaryEmployee() {
        int sum = 0;
        for (Employee a : employees) {
            validEmployee(a);
            int salary = a.getSalary();
            sum = sum + salary;
        }
        System.out.println(sum);
    }

    @Override
    public void minSalary() {
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

    @Override
    public void maxSalary() {
        int max = Integer.MIN_VALUE;
        String name = "";
        for (Employee employee : employees) {
            if (employee.getSalary() > max) {
                validEmployee(employee);
                max = employee.getSalary();
                name = employee.getName();
            }
        }
        System.out.println(name + ": " + max);
    }

    @Override
    public void averageSalary() {
        int count = 0;
        int sum = 0;
        for (Employee employee : employees) {
            validEmployee(employee);
            sum = sum + employee.getSalary();
            count++;
        }
        int average = sum / count;
        System.out.println(average);
    }

    @Override
    public void getFullName() {
        for (Employee employee : employees) {
            validEmployee(employee);
            String name = employee.getName();
            System.out.println(name);
        }
    }

    @Override
    public void indexSalary(double index) {
        for (Employee employee : employees) {
            validEmployee(employee);
            double salary = employee.getSalary() + ((double) employee.getSalary() / 100 * index);
            System.out.println(employee + ": " + salary);
        }
    }

    @Override
    public void findTheSalaryEmployeeByDepartmentMin(String department) {
        int min = Integer.MAX_VALUE;
        String name = "";
        for (Employee employee : employees) {
            if (employee.getDepartment().equals(department) && employee.getSalary() < min) {
                validEmployee(employee);
                min = employee.getSalary();
                name = employee.getName();
            }
        }
        System.out.println(name + ": " + min);
    }

    @Override
    public void findTheSalaryEmployeeByDepartmentMax(String department) {
        int max = Integer.MIN_VALUE;
        String name = "";
        for (Employee employee : employees) {
            if (employee.getDepartment().equals(department) && employee.getSalary() > max) {
                validEmployee(employee);
                max = employee.getSalary();
                name = employee.getName();
            }
        }
        System.out.println(name + ": " + max);
    }

    @Override
    public void averageSalaryByDepartment(String department) {
        int count = 0;
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment().equals(department)) {
                validEmployee(employee);
                sum = sum + employee.getSalary();
                count++;
            }
        }
        int average = sum / count;
        System.out.println(average);
    }

    @Override
    public void indexSalaryByDepartment(String department, double index) {
        double salary;
        for (Employee employee : employees) {
            if (employee.getDepartment().equals(department)) {
                validEmployee(employee);
                salary = employee.getSalary() + ((double) employee.getSalary() / 100 * index);
                System.out.println(employee + ": " + salary);
            }
        }
    }

    @Override
    public void getEmployeeByDepartment(String department) {
        for (Employee employee : employees) {
            if (employee.getDepartment().equals(department)) {
                validEmployee(employee);
                System.out.println(employee.getId() + ": " + employee.getName() + ", " + employee.getSalary());
            }
        }
    }

    @Override
    public void getEmployeeWithSalaryOfLessThenANumber(int number) {
        for (Employee employee : employees) {
            if (employee.getSalary() < number) {
                validEmployee(employee);
                System.out.println(employee.getId() + ": " + employee.getName() + ", " + employee.getSalary());
            }
        }
    }

    @Override
    public void getEmployeeWithSalaryOfMoreThenANumber(int number) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= number) {
                validEmployee(employee);
                System.out.println(employee.getId() + ": " + employee.getName() + ", " + employee.getSalary());
            }
        }
    }
}
