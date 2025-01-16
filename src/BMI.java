import java.util.Scanner;
public class BMI {
    public static void main(String args[]){
        double bmi;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Weight: ");
        double w = sc.nextDouble();
        System.out.print("Enter your Height: ");
        double h = sc.nextDouble();

        if(w>0 && w<500 && h>0 && h<3.0){
            bmi = w / (h*h);
            System.out.println("Your BMI is = " + bmi);
        } else{
            System.out.println("Please provide valid height and weight");
        }
        sc.close();
    }
}
