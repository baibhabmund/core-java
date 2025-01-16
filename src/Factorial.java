import java.util.Scanner;
public class Factorial{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int a = sc.nextInt();

        if (a < 0) {
            System.out.println("Error");
        } else {
            int fact = 1;
            for (int i = 1; i <= a; i++) {
                fact *= i;
            }
            System.out.println("The factorial of " + a + " is: " + fact);
        }
        sc.close();
    }
}
