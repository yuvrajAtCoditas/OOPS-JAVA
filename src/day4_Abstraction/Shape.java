package day4_Abstraction;

 interface ShapeDemo{
     int sum =0;
      void area();
}
class rectancle implements ShapeDemo{
     int length,breadth;
     double Area;



    public void display(){
        this.Area();
         System.out.println("This is rectangle and the area of this rectanle is "+Area);
     }

    private void Area() {
        Area = length*breadth;
    }

    @Override
    public void area() {

    }
}

public class Shape{
    public static void main(String[] args) {
        rectancle rec =new rectancle();
        rec.length =443;
        rec.breadth= 34;

        rec.display();

    }
}
