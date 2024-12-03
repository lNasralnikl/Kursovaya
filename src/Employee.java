public class Employee {

    private final int department;
    private final int id;
    private final String fcs;
    private double salary;

    public Employee(int id, String fcs, int department, double salary) {
        this.id = id;
        this.fcs = fcs;
        this.department = department;
        this.salary = salary;
    }

    //Геттеры свойств сотрудников
    public String getFcs() {
        return this.fcs;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getId() {
        return this.id;
    }

    public double getSalary() {
        return this.salary;
    }


    //Сеттеры свойств сотрудников

    public String setFcs(String fcs) {
        return this.fcs;
    }

    public int setDepartment(int department) {
        return this.department;
    }

    public int setId(int id) {
        return this.id;
    }

    public double setSalary(double s) {
        salary = s;
        return salary;
    }


}



