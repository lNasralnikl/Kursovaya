import java.util.Arrays;
import java.util.Objects;
import java.util.SortedMap;

public class EmployeeBook {

    private int maxEmployeeCount = 0;
    private final Employee[] employees;
    private int employeeCount = 0;

    public EmployeeBook(int maxEmployeeCount) {
        this.employees = new Employee[maxEmployeeCount];
        this.maxEmployeeCount = maxEmployeeCount + 1;
    }

    //МЕТОДЫ
    //Контракт equals и hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeBook that = (EmployeeBook) o;
        return Objects.deepEquals(employees, that.employees);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(employees);
    }

    //Добавление нового сотрудника
    public void addNewEmployee(String fcs, int department, double salary) {
        if (employeeCount >= employees.length) {
            System.out.println("Отдел укомплектован");
        } else {
            Employee newEmployee = new Employee(fcs, department, salary);
            employees[employeeCount++] = newEmployee;
        }
    }

    //Увольнение сотрудника
    public void fireEmployee(String fcs) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFcs().equals(fcs)) {
                System.out.println(employees[i].getFcs() + " уволен");
                System.arraycopy(employees, i + 1, employees, i, employeeCount - i - 1);
                employees[employeeCount - 1] = null;
                employeeCount--;
                return;
            }
        }
        System.out.println();
    }

    //Вывод всех сотрудников
    public void printAllEmployees() {
        for (int i = 0; i < employeeCount; i++) {
            System.out.println("ID " + i + " |  Ф.И.О. " + employees[i].getFcs() + " | Отдел " + employees[i].getDepartment() + " | ЗП " + employees[i].getSalary());
        }
        System.out.println();
    }

    //Вывод сотрудника по ID
    public void empID(int id) {
        System.out.println();
        if (id < employeeCount) {
            System.out.println("Сотрудник с ID " + id + ": " + employees[id].getFcs() + "\n");
        } else {
            System.out.println("Пользователя с таким ID не существует\n");
        }
    }

    //Вывод сотрудников отдела
    public void printDepartEmployee(int department) {
        System.out.println("Сотрудники из отдела " + department + ":");
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getDepartment() == department) {
                System.out.println("ID " + i + " |  Ф.И.О. " + employees[i].getFcs() + " | ЗП " + employees[i].getSalary());
            }
        }
    }

    //Индексация ЗП
    public void indexation(double percent) {
        double ind = 1 + percent / 100;
        double salary;
        for (int i = 0; i < employeeCount; i++) {
            salary = employees[i].getSalary();
            salary = salary * ind;
            employees[i].setSalary(salary);
        }
    }

    //Минимальная ЗП
    public void findMinSalaryDepartment(int department) {
        int k = 0;
        double minSalary = employees[0].getSalary();
        for (int i = 0; i < employeeCount; i++) {
            if (department == employees[i].getDepartment() && minSalary > employees[i].getSalary()) {
                minSalary = employees[i].getSalary();
                k = i;
            }
        }
        System.out.println("\nМинимальная ЗП в отделе " + department + ":\n" + employees[k].getSalary() + " у сотрудника " + employees[k].getFcs());
    }

    //Максимальная ЗП
    public void findMaxSalaryDepartment(int department) {
        int k = 0;
        double maxSalary = 0;
        for (int i = 0; i < employeeCount; i++) {
            if (maxSalary < employees[i].getSalary() && department == employees[i].getDepartment()) {
                maxSalary = employees[i].getSalary();
                k = i;
            }
        }
        System.out.println("\nМаксимальная ЗП в отделе " + department + ":\n" + employees[k].getSalary() + " у сотрудника " + employees[k].getFcs());
    }

    //Сумма ЗП
    public double sumDepartmentSalary(int department) {
        double sum = 0;
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getDepartment() == department) {
                sum = sum + employees[i].getSalary();
            }
        }
        return sum;
    }

    //Средняя ЗП
    public void midDepartmentSalary(int department) {
        double mid = 0;
        double sum = sumDepartmentSalary(department);
        int departEmp = 0;
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getDepartment() == department) {
                departEmp++;
            }
        }
        mid = sum / departEmp;
        System.out.println("\nФинансовые затраты по отделу " + department + ": \n" + sum + "\n\n" + "Средняя ЗП в отделе " + department + ": \n" + mid);

    }

    //Сотрудники с ЗП менее
    public void lessSalary(int salary) {
        System.out.println("\nСотрудники с зарплатой менее " + salary + ":");
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getSalary() < salary) {
                System.out.println("ID " + i + " |  Ф.И.О. " + employees[i].getFcs() + " | ЗП " + employees[i].getSalary());
            }
        }
    }

    //Сотрудники с ЗП более
    public void moreSalary(int salary) {
        System.out.println("\nСотрудники с зарплатой более " + salary + ":");
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getSalary() > salary) {
                System.out.println("ID " + i + " |  Ф.И.О. " + employees[i].getFcs() + " | ЗП " + employees[i].getSalary());
            }
        }
    }

    //Геттеры и сеттеры
    public int getEmployeeCount() {
        return this.employeeCount;
    }

}
