package employeesalary;

public class Main {
    public static void main(String[] args) {
        //PartTimeEmployee
        PartTimeEmployee p1=new PartTimeEmployee("Sajib", 23,"Jessore", "CSE","Student",8,500);
        double salary=p1.salary();
        System.out.println(p1.toString());
        System.out.println(salary);

        //FullTimeEmployee
        FullTimeEmployee p2=new FullTimeEmployee("Sajib", 23,"Jessore", "CSE","Student",15000,25);
        double fullsalary=p2.salary();
        System.out.println(p2.toString());
        System.out.println(fullsalary);
    }
}
