package project;

public class Main {

    public static void main(String[] args) {
        System.out.println("Список сотрудников: ");
        EmployeeBook.getEmployeeInformation();
        System.out.println("Сумма затрат за месяц: ");
        EmployeeBook.sumSalaryEmployee();
        System.out.println("Сотрудник с минимальной зароботной платой:");
        EmployeeBook.minSalary();
        System.out.println("Сотрудник с максимальной зароботной платой:");
        EmployeeBook.maxSalary();
        System.out.println("Среднее значение зарплат:");
        EmployeeBook.averageSalary();
        System.out.println("ФИО всех сотрудников: ");
        EmployeeBook.getFullName();
    }
}
