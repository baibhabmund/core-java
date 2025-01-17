import java.util.Scanner;
public class Logical {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter bool1 True/False : ");
        boolean bool1 = sc.nextBoolean();

        System.out.print("Enter bool2 True/False : ");
        boolean bool2 = sc.nextBoolean();

        boolean logicalAND = bool1 && bool2;
        boolean logicalOR = bool1 || bool2;
        boolean logicalNOT = !bool1 && !bool2;

        System.out.println("Logical AND = " + logicalAND);
        System.out.println("Logical AND = " + logicalOR);
        System.out.println("Logical AND = " + logicalNOT);
    }
}
//