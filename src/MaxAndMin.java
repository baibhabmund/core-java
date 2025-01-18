import java.util.Scanner;
public class MaxAndMin {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //int ;
        System.out.println("Enter the Size of the array : ");
        int s = sc.nextInt();

        int[] arr = new int[s];

        for(int i=0; i<s; i++){
            System.out.print(i);
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];
        for(int i=1; i<s; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The Elements of the Array of size " + s + " are : ");
        for (int i=0; i<s; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("The Minimum Element is = " + min);
        System.out.println("The Maximum Element is = " + max);

        sc.close();
    }
}
