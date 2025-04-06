import java.util.Scanner;

// Node class representing each element in the queue
class Node {
    int data;
    Node next;

    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Queue class implemented using a linked list
class listQueue {
    private Node front, rear;
    private int size;

    // Constructor to initialize the queue
    public Queue() {
        front = rear = null;
        size = 0;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Add an element to the queue (enqueue)
    public void enqueue(int item) {
        Node newNode = new Node(item);

        // If the queue is empty, both front and rear are the new node
        if (rear == null) {
            front = rear = newNode;
            System.out.println(item + " enqueued to queue");
            size++;
            return;
        }

        // Add the new node to the end of the queue and update the rear
        rear.next = newNode;
        rear = newNode;
        size++;
        System.out.println(item + " enqueued to queue");
    }

    // Remove an element from the queue (dequeue)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot dequeue");
            return -1;
        }

        // Remove the front element
        int item = front.data;
        front = front.next;

        // If the queue becomes empty, set rear to null
        if (front == null) {
            rear = null;
        }

        size--;
        return item;
    }

    // Get the front element of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty, no front element");
            return -1;
        }
        return front.data;
    }

    // Display all elements in the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        System.out.print("Queue elements: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Get the current size of the queue
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue q = new Queue();  // Create a queue

        while (true) {
            System.out.println("\nQueue Operations Menu:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Enqueue
                    System.out.print("Enter a number to enqueue: ");
                    int item = scanner.nextInt();
                    q.enqueue(item);
                    break;
                case 2:
                    // Dequeue
                    int dequeuedItem = q.dequeue();
                    if (dequeuedItem != -1) {
                        System.out.println(dequeuedItem + " dequeued from queue");
                    }
                    break;
                case 3:
                    // Peek
                    System.out.println("Front element is: " + q.peek());
                    break;
                case 4:
                    // Display
                    q.display();
                    break;
                case 5:
                    // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
