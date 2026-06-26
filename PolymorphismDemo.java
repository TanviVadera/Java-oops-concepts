/*
Create a class “Vehicle” with instance variable vehicle_type. Inherit the class in a class called
“Car” with instance model_type, company name etc. display the information of the vehicle
by defining the display() in both super and sub class [Method Overriding]
 */
class Vehicle
{
    public String vehicle_type;

    public Vehicle(String vehicle_type)
    {
        this.vehicle_type = vehicle_type;
    }

    void display()
    {
        System.out.println("Vehicle type:"+this.vehicle_type);
    }

}
class Car extends Vehicle
{
    public String model_type;
    public String Company_name;

    public Car(String vehicle_type,String model_type,String Company_name)
    {
        super(vehicle_type);
        this.model_type=model_type;
        this.Company_name=Company_name;
    }
    @Override
    void display()
    {
        super.display();
        System.out.println("Company      : " + Company_name);
        System.out.println("Model        : " + model_type);
    }
}
public class PolymorphismDemo
{
    public static void main(String[] args)
    {
        Vehicle v = new Vehicle("Four Wheeler");

        Car c = new Car("Four Wheeler", "Toyota", "Fortuner");

        System.out.println("Vehicle Details");
        v.display();

        System.out.println();

        System.out.println("Car Details");
        c.display();
    }
}
