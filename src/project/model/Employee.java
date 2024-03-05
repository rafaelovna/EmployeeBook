package project.model;

import java.util.Objects;

/**
 * СОТРУДНИК
 */
public class Employee {
    private static int idGeneration =1;
    private final int id;
    private final String name;
    private String department;
    private int salary;

    /**
     * @param name ФИО сотрудника
     * @param department Отдел сотрудника
     * @param salary Зарплата сотрудника
     */
    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = idGeneration++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, department, salary);
    }

    @Override
    public String toString() {
        return "Работник - " + id +
                ", имя - " + name +
                ", отдел - " + department +
                ", зарплата - " + salary;
    }
}
