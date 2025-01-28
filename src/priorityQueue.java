import java.sql.SQLOutput;
import java.util.PriorityQueue;
public class priorityQueue {
    public static void main(String[] args) {
        /*
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        System.out.println("Priority Queue : " + pq);
        int smallest_pq = pq.poll();
        System.out.println("Smallest Element : " + smallest_pq);

         */
        /*
        PriorityQueue<String> pq = new PriorityQueue<String>();
        pq.offer("Banana");
        pq.offer("Apple");
        pq.offer("Cherry");
        System.out.println("Priority Queue : " + pq);
        String head_pq = pq.peek();
        System.out.println("Head Element : " + head_pq);
         */

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        pq.offer(1);
        pq.offer(2);
        pq.offer(3);

        System.out.print("Priority Queue = ");
        for(int priorityQueue : pq){
            System.out.print(priorityQueue + " ");
        }
    }
}
