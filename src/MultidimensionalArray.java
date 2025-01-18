import java.util.Scanner;
public class MultidimensionalArray{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //int ;
        System.out.println("Enter the Rows of the array : ");
        int rows = sc.nextInt();
        System.out.println("Enter the Cols of the array : ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter the Elements of the Array : ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++) {
                System.out.print("Enter the Elements at indexes( " + rows + " , " + cols + " )");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Elements of the Array of size " + rows + " & " + cols + " are : ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
