import java.util.Scanner;

import java.util.Scanner;

class arrayStack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    // Constructor to initialize the stack
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[size];
        top = -1;
    }

    // Method to push an element to the stack
    public void push(int value) {
        if (top >= maxSize - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println(value + " pushed to stack");
        }
    }

    // Method to pop an element from the stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Stack is empty");
            return -1;
        } else {
            int poppedValue = stackArray[top--];
            System.out.println(poppedValue + " popped from stack");
            return poppedValue;
        }
    }

    // Method to peek at the top element of the stack
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();

        Stack stack = new Stack(size);

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

