import java.util.Scanner;
public class main{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Company Name : ");
        String c = sc.nextLine();

        System.out.print("Enter the Model Name : ");
        String m = sc.nextLine();

        System.out.print("Enter the number of Seats : ");
        int s = sc.nextInt();

        Vehicle vehicle = new Vehicle(c," " + m);

        vehicle.start();
        vehicle.stop();

        Car car = new Car(c," " + m,s);
        car.start();  // Calling method from Vehicle
        car.refuel();   // Calling method from Car
        car.displayCarDetails();
        car.stop();   // Calling method from Vehicle
    }
}