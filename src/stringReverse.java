import java.util.Scanner;
public class stringReverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your String : ");
        String str = sc.nextLine();

        //char ch = str.charAt(0);

        int a = str.length();
        System.out.print("Reversed String = ");

        for(int i = a-1; i >= 0; --i){

            System.out.print(str.charAt(i));
        }
        sc.close();
    }
}
//