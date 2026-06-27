/*
Write a java program to implement an interface called Exam with a method Pass (int mark) that
returns a boolean. Write another interface called Classify with a method Division (int average)
which returns a String. Write a class called Result which implements both Exam and Classify.
The Pass method should return true if the mark is greater than or equal to 50 else false. The
Division method must return “First” when the parameter average is 60 or more, “Second” when

average is 50 or more but below 60, “No division” when average is less than 50.
 */

interface Exam
{
    boolean pass(int marks);
}
interface Classify
{
    String Division(int avg);
}
class Result implements Exam, Classify
{
    public  boolean pass(int marks)
    {
        if(marks>=50)
        {
            return true;
        }
        else {
            return false;
        }
    }
    public String Division(int avg)
    {
        if(avg>=60)
        {
            return "first";
        }
        else if(avg>=50 && avg<60)
        {
            return "second";
        }
        else
        {
            return "No division";
        }
    }
}
class Interface_demo
{
    public static void main(String[] args)
    {
        Result r=new Result();
        System.out.println(r.pass(80));
        System.out.println(r.Division(60));
    }
}