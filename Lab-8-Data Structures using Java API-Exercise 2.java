package programmingIIlap;
import java.util.Queue; // Import Queue interface
import java.util.LinkedList; // Import LinkedList class to implement Queue

public class MyQueueApp {
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<Integer> q = new LinkedList<Integer>();

        // Print statement indicating that elements will be added to the queue
        System.out.println("Add 5 elements to queue...");

        // Add elements to the queue
        q.add(10); // Add first element
        q.add(20); // Add second element
        q.add(30); // Add third element
        q.add(40); // Add fourth element
        q.add(50); // Add fifth element

        // Print the current state of the queue
        System.out.println("Queue now: " + q);

        // Print statement indicating a remove operation will be performed
        System.out.println("Remove Operation: " + q.remove()); // Remove and display the front element

        // Print the current state of the queue after removal
        System.out.println("Element at head of queue: " + q.peek()); // Display the new front element
        System.out.println("Queue now: " + q); // Print the updated queue
    }
}
