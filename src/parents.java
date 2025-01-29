class Parent {
    void show(){
        System.out.println("Parent Method");
    }
}
class child extends Parent{
    @Override
    void show() {
        System.out.println("Child Method");
    }
}
public class parents {
    public static void main(String[] args) {
        Parent child = new Parent();
        //Parent.show();
        child.show();
    }
}