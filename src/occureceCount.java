import java.util.Scanner;
public class occureceCount {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        long num = sc.nextLong();

        System.out.print("Enter the digit to count: ");
        int dig = sc.nextInt();

        int count = 0;

        while(num > 0){
            if(num % 10 == dig){
                count++;
            }
            num /= 10;
        }
        System.out.println(count + " Occurences of " + dig);
        sc.close();
    }
}
