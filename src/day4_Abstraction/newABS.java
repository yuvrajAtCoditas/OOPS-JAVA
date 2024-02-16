package day4_Abstraction;

//if you declare any method abstract in a class the class becomes abstract;
//if yiy declare an abstract method without a
//can not create object of abstract class
//if you extends an abstract class then it is the responsibility of child class to implement the abstract methods of parent class.
//if you do not implement the methods of base class you need to make that class abstract.
abstract class shape{
    public abstract void area();
    public void display(){
        System.out.println("This is shape");

    }

}
class Circle extends shape
{
    int radius;

    @Override
    public void area() {
       double res =  Math.PI*(radius*radius);
    }

    public void diaplay()
    {
        System.out.println("This is circle");
    }
}
public class newABS {
    public static void main(String[] args) {
        shape shape =new shape() {
            @Override
            public void area() {

            }
        };
        System.out.println();
    }
}
