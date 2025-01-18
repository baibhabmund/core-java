public class cars {
    private String make;
    private String model;
    private int year;

    public cars(){
        this.make = "...";
        this.model = "...";
        this.year = 0;

    }
    public cars(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void startEngine(){
        System.out.println("The engine of Year " + year + ", make " + make + " & model " + model + " is Starting.......");
    }
}
