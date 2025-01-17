import java.util.Scanner;
public class takingZeros {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter your number : ");
                    int num = sc.nextInt();
            if(num == 0){
                System.out.println("Correct value");
                break;
            } else{
                System.out.println("Try again");
            }
        }
        sc.close();
    }
}
//