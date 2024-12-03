public class Main {

    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();

        //Найм сотрудника
        employeeBook.newEmployee("Иванов Мухаммяд Иванович", 1, 17000);
        employeeBook.newEmployee("Петров Иван Иванович", 2, 25000);
        employeeBook.newEmployee("Сидоров Иван Иванович", 3, 20000);
        employeeBook.newEmployee("Зайнетдинов Иван Иванович", 4, 35000);
        employeeBook.newEmployee("Прокудин Иван Иванович", 5, 15000);
        employeeBook.newEmployee("Ситдиков Иван Иванович", 4, 75000);
        employeeBook.newEmployee("Усманов Иван Иванович", 3, 85000);
        employeeBook.newEmployee("Сакаев Иван Иванович", 2, 60000);
        employeeBook.newEmployee("Катьянов Иван Иванович", 1, 15000);
        employeeBook.newEmployee("Кайгородов Иван Иванович", 5, 20000);
        employeeBook.newEmployee("Смирнов Иван Иванович", 5, 100000);

        // Вывод сотрудников
        employeeBook.printAllEmployees();

        //Equal
        employeeBook.printEq(1, 1);

        //hashCode
        employeeBook.printHash(1);

        //Увольнение сотрудника
        employeeBook.fireEmployee("Кайгородов Иван Иванович");

        // Вывод сотрудников по ID
        employeeBook.empID(3);

        // Индексация ЗП
        employeeBook.index(50);
        //Вывод сотрудников отдела
        employeeBook.printDepartEmployee(5);
        //Минимальная ЗП
        employeeBook.minSalary(5);
        //Максимальная ЗП
        employeeBook.maxSalary(5);
        //Суммарная ЗП
        employeeBook.sumSalary(5);
        //Средняя ЗП
        employeeBook.midSalary(5);
        //Сотрудники с ЗП менее
        employeeBook.lessSalary(50000);
        //Сотрудники с ЗП более
        employeeBook.moreSalary(50000);


    }

}
