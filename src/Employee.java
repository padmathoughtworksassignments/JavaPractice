public class Employee
{
    private int eid;
    private String name;
    private int salary;


    Employee (int eidIn, String nameIn, int salaryIn)
    {
        eid = eidIn;
        name = nameIn;
        salary = salaryIn;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        //if validation
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    void display()
    {
        System.out.println("Employee ID : " + eid);
        System.out.println("Employee Name " + name);
        System.out.println("Employee Salary " + salary);
    }

}
