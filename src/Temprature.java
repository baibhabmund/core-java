import java.util.Scanner;
public class Temprature {
    public static void main(String args[]){
        double c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a Temperature in Fahrenheit : ");
        double f = sc.nextDouble();

        if(f>=-100 && f<=300){
            c = (5.0 / 9.0) * (f - 32.0);
            System.out.println("The Temprature is " + c + " degree Celcius");
        } else{
            System.out.println("Error in Temprature");
        }
        sc.close();
    }
}
