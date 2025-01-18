public class testcars {
    public static void main(String[] args) {
        // Using the no-arg constructor
        cars cars1 = new cars();
        System.out.println("Car1 Details: ");
        cars1.startEngine();

        // Using the parameterized constructor
        cars car2 = new cars("Toyota", "Camry", 2023);
        System.out.println("\nCar2 Details: ");
        car2.startEngine();
    }
}