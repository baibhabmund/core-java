import java.util.Scanner;
public class intrests {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int simple_intrest;
        int rateOfIntrest;
        int time_Period;


        System.out.println("Enter the Profit : ");
        int P = sc.nextInt();

        System.out.println("Enter the Rate : ");
        int R = sc.nextInt();

        System.out.println("Enter the Time : ");
        int T = sc.nextInt();

        if(P>=0 && P<=100000 && R>=0 && R<=100 && T>=0 && T<=30){
            simple_intrest = (P * R * T)/100;
            System.out.println("Simple Intrest = " + simple_intrest);

            rateOfIntrest = (simple_intrest * 100) / (P * T);
            System.out.println("Rate of Intrest = " + rateOfIntrest);

            time_Period = (simple_intrest * 100) / (P * R);
            System.out.println("Time Period = " + time_Period);

        }
        sc.close();
    }
}
