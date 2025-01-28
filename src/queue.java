import java.util.Queue;
import java.util.LinkedList;
public class queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        //Adding an element
        queue.offer("John Doe");
        queue.offer("Alice");
        queue.offer("Bob");

        System.out.println("The Queue = " + queue);

        //Vieweing the head of the queue
        System.out.println("Head Element : " + queue.peek());

        //Removing element one by one
        System.out.println("Updated queue : " + queue.poll());

        //Checking weather the queue is empty
        System.out.println("Is the Queue Empty ?  =  " + queue.isEmpty());
    }
}
