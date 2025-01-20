abstract class Shape {
    abstract void draw();
}

class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}
class Rectangle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a Rectangle");
    }
}
/*public class main {
    public static void main(String args[]) {

        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        Circle.draw();
        Rectangle.draw();
    }
}*/