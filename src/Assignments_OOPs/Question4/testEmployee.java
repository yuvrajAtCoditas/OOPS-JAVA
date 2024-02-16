package Assignments_OOPs.Question4;

class Employee{
    public int id;
    public String name;

    public int calculateSalary(int salary){
        int totalSalary;
        totalSalary = salary - (18/salary)*100;
        return totalSalary;
    }
    public void displayDetails(int salary){
        System.out.println("Employee Details \n" +
                "ID = " + id +
                "\nNAME = " + name +
                "\nTOTAL SALARY = "+ calculateSalary(salary));
    }
}

class FullTimeEmployee extends Employee{
private int salary;
private String Benefits;

    FullTimeEmployee()
    {
        System.out.println("\n\t\t======================================\nPARENT CLASS DETAILS FROM FTE");
        super.displayDetails(111);
        this.id = 5617;
        this.name = "Dube";
        this.Benefits = "Incentives";
        this.salary = 236434;
        System.out.println("\n\t\t======================================\nFTE DETAILS");
        this.displayDetails(salary);
    }
    public void displayDetails(int salary){
        System.out.println("Employee Details \n" +
                        "ID = " + id +
                        "\nNAME = " + name +
                        "\nTOTAL SALARY = "+ super.calculateSalary(salary)+
                        "\nBENEFITS = " + Benefits );
    }

}
class PartTimeEmployee extends Employee{
private int hourlyRate, hourWorked;

    PartTimeEmployee()
    {
        System.out.println("\n\t\t======================================\nPARENT CLASS DETAILS FROM PTE");
        super.displayDetails(111);
        this.id = 5617;
        this.name = "Amit";
        this.hourlyRate = 62;
        this.hourWorked = 40;
        System.out.println("\n\t\t======================================\nPTE DETAILS");
        this.displayDetails(3249);
    }
    public void displayDetails(int salary){
        System.out.println("Employee Details \n" +
                "ID = " + id +
                "\nNAME = " + name +
                "\nTOTAL SALARY = "+ super.calculateSalary(salary)+
                "\nHOURLY RATE = " + hourlyRate +
                "\nHOURS WORKED = " + hourWorked );
    }

}

public class testEmployee {
    public static void main(String[] args) {
        PartTimeEmployee PTE = new PartTimeEmployee();
        FullTimeEmployee FTE = new FullTimeEmployee();
    }
}

