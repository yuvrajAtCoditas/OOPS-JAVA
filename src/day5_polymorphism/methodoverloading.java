package day5_polymorphism;


class addition{
    int sum=0;
    public void add(int num1,int num2)
    {
        sum =num1+num2;
        System.out.println("sum of two integers "+sum);
    }
    public void add(int num1,int num2,int num3)
    {
        sum =num1+num2+num3;
        System.out.println("sum of three integers "+sum);
    }
    public void add(float num1,int num2)
    {
        sum = (int) (num1+num2);
        System.out.println("sum of one float and one integer  "+sum);
    }
    public void add(int num1,int num2,float num3)
    {
        sum = (int) (num1+num2+num3);
        System.out.println("sum of two integers and one float"+sum);
    }
}
public class methodoverloading {
    public static void main(String[] args) {
        addition obj = new addition();
        obj.add(2,32);
    }
}
