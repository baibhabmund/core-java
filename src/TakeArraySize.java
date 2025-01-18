import java.util.Scanner;
public class TakeArraySize {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //int ;
        System.out.println("Enter the Size of the array : ");
        int s = sc.nextInt();

        int[] arr = new int[s];

        for(int i=0; i<s; i++){
            System.out.print(i);
            arr[i] = sc.nextInt();
        }

        System.out.print("The Elements of the Array of size " + s + " are : ");
        for (int i=0; i<s; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
