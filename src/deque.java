import java.util.ArrayDeque;
import java.util.Deque;
public class deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(5);
        deque.addLast(30);
        System.out.println("Deque : " + deque);

        //Remove element from first
        System.out.println("updated deque : " + deque.removeFirst());
    }
}
