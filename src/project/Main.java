package project;

import project.service.EmployeeBookService;
import project.service.impl.EmployeeBookServiceImpl;

public class Main {

    public static void main(String[] args) {
        EmployeeBookService employeeBookService = new EmployeeBookServiceImpl();


        System.out.println("Список сотрудников: ");
        employeeBookService.getEmployeeInformation();
        System.out.println("Сумма затрат за месяц: ");
        employeeBookService.sumSalaryEmployee();
        System.out.println("Сотрудник с минимальной зароботной платой:");
        employeeBookService.minSalary();
        System.out.println("Сотрудник с максимальной зароботной платой:");
        employeeBookService.maxSalary();
        System.out.println("Среднее значение зарплат:");
        employeeBookService.averageSalary();
        System.out.println("ФИО всех сотрудников: ");
        employeeBookService.getFullName();
        System.out.println("Индексация зароботной платы");
        employeeBookService.indexSalary(0.4);
        System.out.println("Сотрудник с мин зарплатой с конкретного отдела");
        employeeBookService.findTheSalaryEmployeeByDepartmentMin("1");
        System.out.println("Сотрудник с максимальной зарплатой с конкретного отдела");
        employeeBookService.findTheSalaryEmployeeByDepartmentMax("2");
        System.out.println("Среднее значение зарплат в отделе:");
        employeeBookService.averageSalaryByDepartment("2");
        System.out.println("Индексация зароботной платы");
        employeeBookService.indexSalaryByDepartment("2", 0.5);
        System.out.println("Вывод всех сотрудников отдела");
        employeeBookService.getEmployeeByDepartment("1");
        System.out.println("Вывод сотрудников с зарплатой меньше числа в параметре");
        employeeBookService.getEmployeeWithSalaryOfLessThenANumber(10000);
        System.out.println("Вывод сотрудников с зарплатой больше числа в параметре");
        employeeBookService.getEmployeeWithSalaryOfMoreThenANumber(10000);
    }
}
