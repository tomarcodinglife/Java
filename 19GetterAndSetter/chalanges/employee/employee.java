package employee;

public class employee {
    private String employeeName;
    private double employeeAge;
    private int employeeSalary;


    public employee(String name, double age, int salary){
        this.employeeName = name;
        this.employeeAge = age;
        this.employeeSalary = salary;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("Employee Name : ").append(employeeName).append("\n");
        str.append("Employee Age : ").append(employeeAge).append("\n");
        str.append("Employee Salary : ").append(employeeSalary).append("\n");
        return str.toString();
    }

    public String displayEmployee(){
        StringBuilder str = new StringBuilder();
        str.append("Name : ").append(employeeName).append("\n");
        str.append("Age : ").append(employeeAge).append("\n");
        str.append("Salary : ").append(employeeSalary).append("\n");
        return str.toString();
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeAge(double employeeAge) {
        this.employeeAge = employeeAge;
    }

    public double getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }



}
