package project.service.impl;

import project.model.Employee;
import project.service.EmployeeBookService;

import java.util.Arrays;

/**
 * Класс для работы с методами книги сотрудников
 */
public class EmployeeBookServiceImpl implements EmployeeBookService {

    public EmployeeBookServiceImpl() {
    }

    private static final Integer EMPLOYEE_SIZE = 4;
    private final Employee[] employees = new Employee[EMPLOYEE_SIZE];

    @Override
    public void validEmployee(Employee employee) {
        if (employee == null) {
            System.out.println("Значение пустое");
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

    @Override
    public void addNewEmployee(String name, String department, int salary) {
        int index = findFreeIndex();
        if (index == -1) {
            throw new IndexOutOfBoundsException("Хранилище заполнено. Нельзя создать нового сотрудника");
        }
        employees[index] = new Employee(name, department, salary);
    }

    private int findFreeIndex() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void removeEmployee(String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equals(name)) {
                employees[i] = null;

            }
        }
    }

    @Override
    public void changeSalaryEmployee(String name, int salary) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                employee.setSalary(salary);
            }
        }
    }

    @Override
    public void changeDepartmentEmployee(String name, String department) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                employee.setDepartment(department);
            }
        }
    }

    @Override
    public void departmentEmployee() {
        String department;
        for (Employee employee : employees) {
            department = employee.getDepartment();
            System.out.println("Департамент " + department + ": " + employee);
        }
    }
}
