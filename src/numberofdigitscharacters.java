import java.util.Scanner;
public class numberofdigitscharacters {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your String : ");
        String a = sc.nextLine();

        int alphabets = 0;
        int numbers = 0;
        int specialCh = 0;

        for(int i = 0; i < a.length(); i++){
            char ch = a.charAt(i);
            if(Character.isDigit(ch)){
                numbers++;
            } else if(!Character.isLetter(ch) && !Character.isWhitespace(ch)){
                specialCh++;
            } else{
                alphabets++;
            }
        }
        System.out.println("The Number of Alphabets are = " + alphabets);
        System.out.println("The Number of Digits are = " + numbers);
        System.out.println("The Number of Special Characters are = " + specialCh);

        sc.close();
    }
}
//