import java.util.Scanner;
public class PrimeNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println(num + " is not a Prime Number.");
        } else {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num + " is a Prime Number.");
            } else {
                System.out.println(num + " is not a Prime Number.");
            }
        }
        sc.close();
    }
}
//