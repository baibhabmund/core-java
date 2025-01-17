import java.util.Scanner;
public class Fibonacci {
    public static void main(String args[]){
        int a = 0;
        int b = 1;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Nth Value : ");
        int n = sc.nextInt();

        if(n <= 0){
            System.out.println("Please enter a Positive Number");
        } else{
            int i = 1;
            System.out.println("The first " + n + " numbers of Fibonacci Series is : ");

            if(i == a){
                System.out.print(a + " ");
            }if(i == b){
                System.out.print(b + " ");
            }
            while(i <= n){
                /*if(i == a){
                    System.out.print(a + " ");
                } else if(i == b){
                    System.out.print(b + " ");
                } else{*/
                    sum = a + b;
                    a = b;
                    b = sum;
                    System.out.print(b + " ");
                    i++;
                }
                //i++;
            }
        sc.close();
    }
}
//