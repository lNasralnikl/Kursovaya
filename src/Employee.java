public class Employee {

    private final int department;
    private int id = 0;
    private static int idCounter = 0;
    private final String fcs;
    private double salary;

    public Employee(String fcs, int department, double salary) {
        this.id = Employee.generateID();
        this.fcs = fcs;
        this.department = department;
        this.salary = salary;
    }

    //Счетчик ID
    static int generateID(){
        return ++idCounter;
    }

    //Геттеры свойств сотрудников
    public String getFcs() {
        return this.fcs;
    }

    public int getIdCounter(){
        return idCounter;
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



