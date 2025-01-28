import java.util.Queue;
import java.util.LinkedList;
public class queue1 {
    public static void main(String[] args) {

        //Initialize a linked list to simulate a Queue. Add the following elements to the queue.
        //Remove the first element
        //Print the queue after each operation

        Queue<Integer> que = new LinkedList<Integer>();

        que.offer(10);
        que.offer(20);
        que.offer(30);

        System.out.println("Original Queue : " + que);

        int r_ele = que.poll();
        System.out.println("Removed Element : " + r_ele);
        System.out.println("Updated queue : " + que);


    //use a linkedList to manage tasks("Task1, Task2, Task3")
    //Add the following tasks to the queue in order : "Download File", "Process File", "Upload File"
        //


    }
}
