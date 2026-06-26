/*
Create a class “Rectangle” that would contain length and width as an instance variable and
count as a static variable.
Define constructors [constructor overloading (default, parameterized and copy)] to
initialize variables of objects. Define methods to find area and to display variables’value of
objects which are created.
[Note: define initializer block, static initializer block and the static variable and method. Also
demonstrate the sequence of execution of initializer block and static initialize block]
 */
public class Rectangle {
    public  int width ;
    public  int height;

    public static int count=0;

    //intializer block - run every time when object is created
    {
        System.out.println("Instance Initializer Block");
    }

    //static block - runs only once when the class loads.
    static
    {
        System.out.println("Static Initializer Block");
    }

    //default constructor
    public Rectangle()
    {
        height=0;
        width=0;
        count++;
    }

    //paramterized constructor
    public Rectangle(int width,int height){
        count++;
        this.width=width;
        this.height=height;
    }

    //copy constructor
    public Rectangle(Rectangle r)
    {
        count++;
        this.width=r.width;
        this.height=r.height;
    }
    int area()
    {
        return height*width;
    }
    void display()
    {
            System.out.println("Length : " + height);
            System.out.println("Width  : " + width);
            System.out.println("Area   : " + area());
    }
    public static int getCount()
    {
        return count;
    }
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle();

        Rectangle r2 = new Rectangle(10,20);

        Rectangle r3 = new Rectangle(r2);

        r1.display();
        r2.display();
        r3.display();

        System.out.println(Rectangle.getCount());
    }
}
