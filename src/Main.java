public class Main {

    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook(20);

        //Найм сотрудника
        employeeBook.addNewEmployee("Иванов Мухаммяд Иванович", 1, 17000);
        employeeBook.addNewEmployee("Петров Иван Иванович", 2, 25000);
        employeeBook.addNewEmployee("Сидоров Иван Иванович", 3, 20000);
        employeeBook.addNewEmployee("Зайнетдинов Иван Иванович", 4, 35000);
        employeeBook.addNewEmployee("Прокудин Иван Иванович", 5, 15000);
        employeeBook.addNewEmployee("Ситдиков Иван Иванович", 4, 75000);
        employeeBook.addNewEmployee("Усманов Иван Иванович", 3, 85000);
        employeeBook.addNewEmployee("Сакаев Иван Иванович", 2, 60000);
        employeeBook.addNewEmployee("Катьянов Иван Иванович", 1, 15000);
        employeeBook.addNewEmployee("Кайгородов Иван Иванович", 5, 20000);
        employeeBook.addNewEmployee("Смирнов Иван Иванович", 5, 100000);

        // Вывод сотрудников
        employeeBook.printAllEmployees();

        //Увольнение сотрудника
        employeeBook.fireEmployee("Кайгородов Иван Иванович");

        // Вывод сотрудников по ID
        employeeBook.empID(10);

        // Индексация ЗП
        employeeBook.indexation(50);
        //Вывод сотрудников отдела
        employeeBook.printDepartEmployee(5);
        //Минимальная ЗП
        employeeBook.findMinSalaryDepartment(1);
        //Максимальная ЗП
        employeeBook.findMaxSalaryDepartment(5);
        //Суммарная ЗП
        employeeBook.sumDepartmentSalary(5);
        //Средняя ЗП
        employeeBook.midDepartmentSalary(5);
        //Сотрудники с ЗП менее
        employeeBook.lessSalary(50000);
        //Сотрудники с ЗП более
        employeeBook.moreSalary(50000);


    }

}
