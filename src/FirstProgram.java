import java.util.Scanner;
public class FirstProgram{
    public static void main(String args[]){
        /*SWAP TWO VALUES
        int a = 10, b = 20;
        a = a + b; // a = 30
        b = a - b; // b = 10
        a = a - b; // a = 20
        System.out.println("a = " + a + " b = " + b);
         */

        /*FIND ASCII VALUE
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Character = ");
        char c = scanner.next().charAt(0);
        int ascii = (int)c;
        System.out.println(ascii);
         */

        /*SUM OF DIGITS
        int a = 55;
        int sum = 0;

        while (a > 0){
            sum += a % 10;
            a /= 10;
        }
        System.out.println(sum);
         */

        /* ODD EVEN FIND
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = scanner.nextInt();
        if(num % 2 == 0){
            System.out.println(num + " is even");
        } else{
            System.out.println(num + " is odd");
        }
        */

        // local variable is stored in stack
        // instance variable is stored in heap
        // static variable is stored in method area

        //System.exit();    used to terminate the program
    }
}
//