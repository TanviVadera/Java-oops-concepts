/*Write a program in Java to develop user defined exception for 'Invalidage' error.*/


//custom class
class InvaildAgeException extends Exception
{
    InvaildAgeException(String message)
    {
        super(message);
    }
}
public class UserDefineException
{
    static void Age(int age)  throws InvaildAgeException
    {
        if(age<18)
        {
            throw new InvaildAgeException("Age must be 18");
        }
        System.out.println("Eligible");
    }
    public static void main(String[] args)
    {
        try
        {
            Age(14);
        }
        catch (InvaildAgeException e) {
            System.out.println(e.getMessage());
        }
    }

}

