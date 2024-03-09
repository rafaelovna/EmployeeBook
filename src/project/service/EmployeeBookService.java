package project.service;

import project.model.Employee;

public interface EmployeeBookService {

    /**
     * Проверка на null
     *
     * @param employee параметр метода - сотрудник
     */
    void validEmployee(Employee employee);


    /**
     * Получить всех сотрудников
     */
    void getEmployeeInformation();


    /**
     * Метод для нахождения суммы зарплат всех сотрудников
     */
    void sumSalaryEmployee();


    /**
     * Метод для нахождения сотрудника с минимальной заработной платой
     */
    void minSalary();


    /**
     * Метод для нахождения сотрудника с максимальной заработной платой
     */
    void maxSalary();


    /**
     * Метод для нохождения среднего значения зароботных плат
     */
    void averageSalary();


    /**
     * Метод для получения ФИО сотрудников
     */
    void getFullName();


    /**
     * Метод для индексации заработной платы
     *
     * @param index параметр для ввода индекса
     */
    void indexSalary(double index);


    /**
     * Метод поиска сотрудника в конкретном отделе с минимальной зарплатой
     *
     * @param department параметр отдел
     */
    void findTheSalaryEmployeeByDepartmentMin(String department);


    /**
     * Метод поиска сотрудника в конкретном отделе с максимальной зарплатой
     *
     * @param department параметр отдел
     */
    void findTheSalaryEmployeeByDepartmentMax(String department);


    /**
     * Среднее значение зарплат в отделе
     *
     * @param department параметр отдел
     */
    void averageSalaryByDepartment(String department);


    /**
     * Метод для индексации заработной платы
     *
     * @param department параметр отдел
     * @param index      параметр индекса
     */
    void indexSalaryByDepartment(String department, double index);


    /**
     * Метод для вывода всех сотрудников отдела
     *
     * @param department параметр отдел
     */
    void getEmployeeByDepartment(String department);


    /**
     * Метод для вывода сотрудников с зарплатой меньше числа в параметре
     *
     * @param number параметр число
     */
    void getEmployeeWithSalaryOfLessThenANumber(int number);

    /**
     * Метод для вывода сотрудников с зарплатой больше числа в параметре
     *
     * @param number параметр число
     */
    void getEmployeeWithSalaryOfMoreThenANumber(int number);


    /**
     * Метод для добавления нового сотрудника
     */
    void addNewEmployee(String name, String department, int salary);


    /**
     * Метод для удаления сотрудника
     * @param name параметр имени
     */
    void removeEmployee(String name);


    /**
     * Метод для изменения данных по зарплате
     * @param name поиск по параметру name
     * @param salary ввод изменений по зарплате
     */
    void changeSalaryEmployee(String name, int salary);


    /**
     * Метод для изменения данных по депортаменту
     * @param name поиск по параметру name
     * @param department ввод изменений по депортаменту
     */
    void changeDepartmentEmployee(String name, String department);
}
