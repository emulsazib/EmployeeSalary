package employeesalary;

public class FullTimeEmployee extends Employee{
    private double basic;
    private double allowance;

    public FullTimeEmployee(){
        this.basic=0;
        this.allowance=0;
    }

    public FullTimeEmployee(double basic, double allowance) {
        this.basic = basic;
        this.allowance = allowance;
    }

    public FullTimeEmployee(String department, String designation, double basic, double allowance) {
        super(department, designation);
        this.basic = basic;
        this.allowance = allowance;
    }

    public FullTimeEmployee(String name, int age, String address, String department, String designation, double basic, double allowance) {
        super(name, age, address, department, designation);
        this.basic = basic;
        this.allowance = allowance;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                " Name= "+getName()+
                " Age= "+getAge()+
                " Address= "+getAddress()+
                " Department= "+getAddress()+
                " Designation= "+getDesignation()+
                "basic=" + basic +
                ", allowance=" + allowance +
                '}';
    }
    public double salary(){
        return this.basic+((this.allowance*this.basic)/100);
    }
}
