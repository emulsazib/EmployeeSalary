package employeesalary;

public class PartTimeEmployee extends Employee{
    private double hours;
    private double rate;

    public PartTimeEmployee(){
        this.hours=0;
        this.rate=0;
    }

    public PartTimeEmployee(double hours, double rate) {
        this.hours = hours;
        this.rate = rate;
    }

    public PartTimeEmployee(String department, String designation, double hours, double rate) {
        super(department, designation);
        this.hours = hours;
        this.rate = rate;
    }

    public PartTimeEmployee(String name, int age, String address, String department, String designation, double hours, double rate) {
        super(name, age, address, department, designation);
        this.hours = hours;
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                " Name= "+getName()+
                " Age= "+getAge()+
                " Address= "+getAddress()+
                " Department= "+getAddress()+
                " Designation= "+getDesignation()+
                "hours=" + hours +
                ", rate=" + rate +
                '}';
    }
    public double salary(){
        return this.hours*this.rate;
    }
}
