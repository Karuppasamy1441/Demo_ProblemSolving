public class Node {
}
//
class LinkedNode {
    Node head; // head of the list

    // Linked list Node
    static class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;   // Save next node
            current.next = prev;   // Reverse the current node's pointer
            prev = current;        // Move prev and current one step forward
            current = next;
        }

        head = prev;  // Set the new head
    }

    // Function to print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Function to add a new node at the end
    public void append(int data) {
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

    public static void main(String[] args) {
        LinkedNode list = new LinkedNode();

        // Append data to the linked list
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);

        System.out.println("Original Linked List:");
        list.printList();  // Print the original list

        // Reverse the linked list
        list.reverse();

        System.out.println("Reversed Linked List:");
        list.printList();  // Print the reversed list
    }
}
