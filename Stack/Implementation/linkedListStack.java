import java.util.Scanner;

class Node {
    int data;
    Node next;

    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class linkedListStack {
    private Node top;  // Reference to the top of the stack

    // Constructor to initialize the stack
    public Stack() {
        top = null;  // Initially, the stack is empty
    }

    // Push method to add an element to the stack
    public void push(int value) {
        Node newNode = new Node(value);
        if (top == null) {
            top = newNode;  // If the stack is empty, set the new node as the top
        } else {
            newNode.next = top;  // Link the new node to the current top
            top = newNode;       // Move the top to the new node
        }
        System.out.println(value + " pushed to stack");
    }

    // Pop method to remove and return the top element of the stack
    public int pop() {
        if (top == null) {
            System.out.println("Stack Underflow! Stack is empty");
            return -1;  // Return -1 if the stack is empty
        } else {
            int poppedValue = top.data;
            top = top.next;  // Move the top to the next node
            System.out.println(poppedValue + " popped from stack");
            return poppedValue;
        }
    }

    // Peek method to return the top element without removing it
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return top.data;  // Return the top element
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Method to check if the stack is full (this stack won't be full unless memory is exhausted)
    public boolean isFull() {
        // In a linked list-based implementation, the stack can grow dynamically
        // So, it's never really "full" unless there's a memory issue
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack stack = new Stack();

        while (true) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Check if Stack is Empty");
            System.out.println("5. Check if Stack is Full");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a value to push to the stack: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    int topValue = stack.peek();
                    if (topValue != -1) {
                        System.out.println("Top element is: " + topValue);
                    }
                    break;
                case 4:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Stack is not empty");
                    }
                    break;
                case 5:
                    if (stack.isFull()) {
                        System.out.println("Stack is full");
                    } else {
                        System.out.println("Stack is not full");
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}


