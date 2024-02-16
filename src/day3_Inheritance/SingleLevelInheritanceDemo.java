package day3_Inheritance;

class Parent {
    protected int id = 3245;
    protected String name = "day3_Inheritance.Parent";
    protected int panCardId = 45235;
    public  void show()
    {
        System.out.println("PARENT " + id + " " + name + " " + panCardId);
    }
}
class Child extends Parent {
    protected int AadhaarNumber;

    Child()
    {
        super.show();
        id = 434;
        name = "Sunny";
        panCardId = 324;
        AadhaarNumber = 432243321;
        this.showchild();
    }
    public  void showchild() {

        System.out.println("CHILD " + id + " " + name + " " + panCardId + " " + AadhaarNumber);
    }
}
public class SingleLevelInheritanceDemo {
    public static void main(String[] args) {
        Child c = new Child();
    }
}

