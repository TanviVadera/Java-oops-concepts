/*
Describe abstract class called Shape which has three subclasses say Triangle, Rectangle, and
Circle. Define one method area () in the abstract class and override this area () in these three
subclasses to calculate for specific object i.e. area () of Triangle subclass should calculate area
of triangle etc. Same for Rectangle and Circle.
 */
abstract class Shape
{
    abstract void area(int a,int b);
}
class Tringle extends Shape
{
    void area(int a,int b)
    {
        System.out.println("area of triangle:="+(0.5*a*b));
    }
}
class Rectangleimpl extends Shape
{
    void area(int a,int b)
    {
        System.out.println("area of rectangle:="+(a*b));
    }
}
class Circleimpl extends Shape
{
    void area(int a)
    {
        System.out.println("area of circle:="+(3.14*a*a));
    }

    @Override
    void area(int a, int b) {
        System.out.println("area of circle:="+(3.14*a*a));
    }
}
public class Abstract_demo
{
    public static void main(String[] args)
    {
        Circleimpl c=new  Circleimpl();
        c.area(5,0);

        Rectangleimpl r=new   Rectangleimpl();
        r.area(1,2);
    }
}
