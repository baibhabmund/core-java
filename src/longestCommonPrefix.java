import java.util.Scanner;
public class longestCommonPrefix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Word : ");
        String s1 = sc.nextLine();
        System.out.print("Enter another Word : ");
        String s2 = sc.nextLine();

        StringBuilder prefix = new StringBuilder();

        int minlength = Math.min(s1.length(), s2.length());

        for (int i=0; i<minlength; i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if(c1 == c2){
                prefix.append(c1);
            } else{
                break;
            }
        }

        if(prefix.length() > 0){
            System.out.println("Your Longest common Prefix is = " + prefix.toString());
        } else {
            System.out.println("Your String has no Longest Common prefix");
        }
        sc.close();



        /* for(int i = 0; i<s1.length(); i++){
            char c1 = s1.charAt(i);
            System.out.print(c1);
        }
        for(int j = 0; j<s2.length(); j++){
            char c2 = s2.charAt(j);
            System.out.print(c2);
        }
        */



    }
}
