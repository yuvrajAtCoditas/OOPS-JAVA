package day5_polymorphism;
interface  Shape{
    void area();
}
class Rectangle implements Shape{
    int length,width;
    @Override
    public void area()
    {
        int result =length*width;
        System.out.println("Result is: "+result);
    }
}
public class methodoverriding {
    public static void main(String[] args) {
        Rectangle re =new Rectangle();
        re.length=43;
        re.width = 65;
        re.area();
    }
}
