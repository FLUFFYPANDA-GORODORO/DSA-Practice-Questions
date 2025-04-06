import java.util.Scanner;

class arrayQueue {
    private int front, rear, size;
    private int capacity;
    private int[] queue;

    // Constructor to initialize the queue
    public Queue(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.front = 0;
        this.rear = capacity - 1;
        this.queue = new int[capacity];
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Add an element to the queue
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full, cannot enqueue " + item);
            return;
        }
        rear = (rear + 1) % capacity;  // Circular increment
        queue[rear] = item;
        size++;
        System.out.println(item + " enqueued to queue");
    }

    // Remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot dequeue");
            return -1;
        }
        int item = queue[front];
        front = (front + 1) % capacity;  // Circular increment
        size--;
        return item;
    }

    // Get the front element of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty, no front element");
            return -1;
        }
        return queue[front];
    }

    // Display all elements in the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue q = new Queue(5);  // Queue with capacity 5

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
