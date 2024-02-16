package day3_Inheritance;

class vehicle
{
    protected boolean hasStearing ,hasGears,hasHandle,HasBreaks,hasSeats;

    void displayVehicle(){
        System.out.println("\nday3_Inheritance.vehicle{" +
                "hasStearing=" + hasStearing +
                ", hasGears=" + hasGears +
                ", hasHandle=" + hasHandle +
                ", HasBreaks=" + HasBreaks +
                ", hasSeats=" + hasSeats +
                '}');
        System.out.println();
    }

}
class bolero extends vehicle{
    protected boolean hasAC;
    bolero()
    {
        super.displayVehicle();
        hasStearing = true;
        hasGears = true;
        hasHandle = false;
        HasBreaks = true;
        hasSeats = true;
        hasAC = true;
        this.displaybolero();
    }

    void displaybolero(){
        System.out.println("Bolero {" +
                "hasStearing=" + hasStearing +
                ", hasGears=" + hasGears +
                ", hasHandle=" + hasHandle +
                ", HasBreaks=" + HasBreaks +
                ", hasSeats=" + hasSeats +
                ", hasAC=" + hasAC +
                '}');
        System.out.println();
    }

}
class boleroPicup extends bolero{

    protected boolean hasTrunk;
    boleroPicup()
    {
        super();
        hasStearing = true;
        hasGears = true;
        hasHandle = false;
        HasBreaks = true;
        hasSeats = true;
        hasAC = false;
        hasTrunk=true;
        this.displayboleroPicup();
    }
    void displayboleroPicup(){
        System.out.println("Bolero-Picup  " +
                "hasStearing=" + hasStearing +
                ", hasGears=" + hasGears +
                ", hasHandle=" + hasHandle +
                ", HasBreaks=" + HasBreaks +
                ", hasSeats=" + hasSeats +
                ", hasAC=" + hasAC +
                ", hasTrunk=" + hasTrunk );
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args)
    {
        boleroPicup bp = new boleroPicup();
    }
}
