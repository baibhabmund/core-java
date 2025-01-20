import java.util.Scanner;
public class strings {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        //String str = "Hello";
        //String str = new String("Hi");

        String a = str.toUpperCase();
        System.out.println("UPPER CASE = " + a);

        String b = str.toLowerCase();
        System.out.println("LOWER CASE = " + b);

        String c = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed String = " + c);

        if(str.equals(c)){
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is not a Palindrome");
        }
        sc.close();
    }
}
