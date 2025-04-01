import java.util.Scanner;

class SinglyLinkedList {
    // Node class representing each element of the list
    static class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head; // Head of the list

    // Constructor to initialize an empty list
    SinglyLinkedList() {
        head = null;
    }

    // Insert at the head (beginning) of the list
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at the last (end) of the list
    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insert in the middle (after a specific index)
    public void insertInMiddle(int data, int index) {
        if (index < 0) {
            System.out.println("Invalid index");
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int count = 0;

        while (temp != null && count < index - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Print the whole linked list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Delete the head node
    public void deleteHead() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    // Delete the last node
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // Delete a node at the middle (after a specific index)
    public void deleteMiddle(int index) {
        if (head == null || index < 0) {
            System.out.println("Invalid index or empty list");
            return;
        }

        Node temp = head;
        int count = 0;

        while (temp != null && count < index - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Index out of bounds");
            return;
        }

        temp.next = temp.next.next;
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLinked List Operations Menu:");
            System.out.println("1. Insert at Head");
            System.out.println("2. Insert at Last");
            System.out.println("3. Insert in Middle");
            System.out.println("4. Delete Head");
            System.out.println("5. Delete Last");
            System.out.println("6. Delete Middle");
            System.out.println("7. Print List");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at head: ");
                    int valueHead = scanner.nextInt();
                    list.insertAtHead(valueHead);
                    break;

                case 2:
                    System.out.print("Enter value to insert at last: ");
                    int valueLast = scanner.nextInt();
                    list.insertAtLast(valueLast);
                    break;

                case 3:
                    System.out.print("Enter value to insert in middle: ");
                    int valueMiddle = scanner.nextInt();
                    System.out.print("Enter index to insert at: ");
                    int indexMiddle = scanner.nextInt();
                    list.insertInMiddle(valueMiddle, indexMiddle);
                    break;

                case 4:
                    list.deleteHead();
                    break;

                case 5:
                    list.deleteLast();
                    break;

                case 6:
                    System.out.print("Enter index to delete middle node: ");
                    int indexDeleteMiddle = scanner.nextInt();
                    list.deleteMiddle(indexDeleteMiddle);
                    break;

                case 7:
                    list.printList();
                    break;

                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
