/*Create a class “Student” that would contain enrollment No, name, and gender and marks as
instance variables and count as static variable which stores the count of the objects;
constructors and display(). Implement constructors to initialize instance variables. Also
demonstrate constructor chaining. Create objects of class “Student” and displays all values of
objects. Also

Write a program in Java to demonstrate use of this keyword. Check whether this can access
the Static variables of the class or not.*/
public class Student
{
    public  int erno;
    public String name;
    public String gender;

    public static int count=0;

    public Student(int erno, String name, String gender)
    {
        count++;
        this.erno=erno;
        this.name=name;
        this.gender=gender;
    }
    void display()
    {
        System.out.println("Erno: "+erno);
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
    }
    public static void getCount()
    {
        System.out.println("count: "+count);
    }
    public static void main(String[] args)
    {

        Student s1=new Student(101,"abc","female");
        Student s2=new Student(102,"xyz","male");
        Student s3=new Student(103,"xyz","male");

        s1.display();
        s2.display();
        s3.display();
        Student.getCount();
    }
}
