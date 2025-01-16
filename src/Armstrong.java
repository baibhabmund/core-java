import java.util.Scanner;
public class Armstrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        int number = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while(num > 0){
            int dig = num % 10;
            sum += Math.pow(dig, digits);
            num /= 10;
        }

        if(number == sum){
            System.out.println(number + " is an Armstrong Number.");
        } else{
            System.out.println(number + " is not an Armstrong Number.");
        }
        sc.close();
    }
}
