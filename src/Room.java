public class Room {
    private int height;
    private int width;
    private int breadth;

    public Room(){
        this.height = 0;
        this.width = 0;
        this.breadth = 0;
    }

    public Room(int height, int width, int breadth){
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public int volume(){
        int vol = height * breadth * width;
        return vol;
        //System.out.println("The Volume of your room is : " + )
    }
}
