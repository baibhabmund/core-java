public class Vehicle {
    private String company;
    private String model;

    public Vehicle(){
        this.company = "...";
        this.model = "...";
    }
    public Vehicle(String company, String model){
        this.company = company;
        this.model = model;
    }
    public void start(){
        System.out.println("Your " + company + model + " is Starting");
    }
    public void stop(){
        System.out.println("Your " + company + model + " is Stoping");
    }
}
class Car extends Vehicle{
    private int Seats;

    public Car(String company, String model, int Seats){
        super(company, model);
        this.Seats = Seats;
    }
    public void refuel(){
        System.out.println("Your is Refueling");
    }
    public void displayCarDetails() {
        System.out.println("This car has " + Seats + " Seats.");
    }
}

/*public class Main{
    public static void main(String args[]) {

        Vehicle vehicle = new Vehicle("Defult Company", "Default Model");

        vehicle.start();
        vehicle.stop();

        Car car = new Car("Mercedes", "S-class", 4);
        car.start();  // Calling method from Vehicle
        car.refuel();   // Calling method from Car
        car.displayCarDetails();
        car.stop();   // Calling method from Vehicle
    }
}
*/