import java.util.Scanner;
public class RoomDemo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Height of Room:1 : ");
        int height1 = sc.nextInt();
        System.out.print("Enter the Width of Room:1 : ");
        int width1 = sc.nextInt();
        System.out.print("Enter the Breadth of Room:1 : ");
        int breadth1 = sc.nextInt();

        System.out.print("Enter the Height of Room:2 : ");
        int height2 = sc.nextInt();
        System.out.print("Enter the Width of Room:2 : ");
        int width2 = sc.nextInt();
        System.out.print("Enter the Breadth of Room:2 : ");
        int breadth2 = sc.nextInt();


        Room room1 = new Room(height1, width1, breadth1);
        Room room2 = new Room(height2, width2, breadth2);
        //Room room3 = new Room(height, width, breadth);

        System.out.println("The Volume of Room:1 is " + room1.volume() + " cubic units");
        System.out.println("The Volume of Room:2 is " + room2.volume() + " cubic units");
        //System.out.println("The Volume of Room:3 is " + room1.volume() + " cubic units");

    }
}
