/**
 * @author Abhishek Jain
 */

/**
 * @author Abhishek Jain
 *
 * How we can restrict object creation of any class?
 *
 * Whenever we want to restrict any class object creation from its sub class etc, then we can declare it using abstract keyword.
 * Because as per java rules, class with abstract keyword, cannot be instantiated.
 *
 * Now the next question is, why we need this type of restrictions, rite?
 * First will share the example and then we will discuss answer for this question.
 *
 * Example-
 * Suppose we are working on a ‘Vehicle’ project, in which, we want to calculate travel
 * Time, engine implementation,& Gear Implementtion etc.
 *
 * In above project, we know partial details and some details we need from client.
 * Here assume client is sub class, rite.
 *
 * Travel time formula is same for any type of vehicle, so we will write this calculation in parent class,
 * and engine and gear implementation is depends client to client, but details are mandatory to provide.
 * So we will create abstract class with abstract method for engine and gear implementation.
 *
 * Hence for such kind of scenarios we generally declare the class as abstract and
 * later concrete classes extend these classes and override the methods accordingly and can have their own methods as well.
 *
 * Check this code for more clarity.
 */

//abstract class object creation is not possible.
abstract class ModeOfTravel{
    double travelDistance;
    double vehicleSpeed;
    double timeDuration = 0.0;

    //travelDistance, vehicleSpeed value is storing for each object.
    public ModeOfTravel(double travelDistance, double vehicleSpeed) {
        this.vehicleSpeed = vehicleSpeed;
        this.travelDistance = travelDistance;
    }

    //common logic/calculation for all sub classes, input values we are taking in constructor.
    public double getTravelTime()
    {
        try {
            timeDuration = travelDistance/vehicleSpeed;
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally
        {
            return timeDuration;
        }
    }

    //abstract methods, subclass forcefully needs to provide implementation for this.
    public abstract void engineImplementation();
    public abstract void gearImplementation();
}

//Subclass Train extends parent class ModeOfTravel
class Train extends ModeOfTravel{
    //in the time of object creation collection values and passing same to parent class.
    Train(double travelDistance, double vehicleSpeed) {
        super(travelDistance, vehicleSpeed);
    }

    @Override
    public void engineImplementation() {
        System.out.println("\nProvide Train engineImplementation");
        //To do
    }

    @Override
    public void gearImplementation() {
        System.out.println("Provide Train gearImplementation");
        //To do
    }
}

//Subclass Bus extends parent class ModeOfTravel
class Bus extends ModeOfTravel{
    //in the time of object creation collection values and passing same to parent class.
    Bus(double travelDistance, double vehicleSpeed) {
        super(travelDistance, vehicleSpeed);
    }

    @Override
    public void engineImplementation() {
        System.out.println("\nProvide Bus engineImplementation");
        //To do
    }

    @Override
    public void gearImplementation() {
        System.out.println("Provide Bus gearImplementation");
        //To do
    }
}

//Subclass Taxi extends parent class ModeOfTravel
class Taxi extends ModeOfTravel{
    //in the time of object creation collection values and passing same to parent class.
    Taxi(double travelDistance, double vehicleSpeed) {
        super(travelDistance, vehicleSpeed);
    }

    @Override
    public void engineImplementation() {
        System.out.println("\nProvide Taxi engineImplementation");
        //To do
    }

    @Override
    public void gearImplementation() {
        System.out.println("Provide Taxi gearImplementation");
        //To do
    }
}
public class JavaAbstractionEx {
    public static void main(String[] args) {
        int totalDistance = 600;

        Train train = new Train(totalDistance, 110);
        train.engineImplementation();
        train.gearImplementation();
        System.out.println("Total Travel time by Train is " + train.getTravelTime());

        Bus bus = new Bus(totalDistance, 60);
        bus.engineImplementation();
        bus.gearImplementation();
        System.out.println("Total Travel time by Bus is " + bus.getTravelTime());

        Taxi taxi = new Taxi(totalDistance, 80);
        taxi.engineImplementation();
        taxi.gearImplementation();
        System.out.println("Total Travel time by Taxi is " + taxi.getTravelTime());
    }
}

