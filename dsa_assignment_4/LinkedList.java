import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    static Node head = null;
    static Scanner sc = new Scanner(System.in);

    // Create Node for Linked List
    static Node createNode() {
        System.out.print("Input data: ");
        int data = sc.nextInt();
        return new Node(data);
    }

    // Insert at beginning
    void InsBeg() {
        Node temp = createNode();
        if (head == null) {
            head = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    // Insert at end
    void InsEnd() {
        Node x = createNode();
        if (head == null) {
            head = x;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = x;
        }
    }

    // Deletion at beginning
    static void DelBeg() {
        if (head != null) {
            head = head.next;
        }
    }

    // Deletion at end
    static void DelEnd() {
        if (head == null) {
            System.out.println("List is empty.");
        } else if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    // Insertion of Node at a particular position
    void InsPos(int position) {
        if (position < 1) {
            System.out.println("Invalid position.");
            return;
        }

        Node newNode = createNode();

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        for (int i = 1; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds.");
        } else {
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    // Displaying the linked list
    void display() {
        System.out.println("The list is: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    //sort 
    public void sort() {
        int cur = 0;
        Node temp = head;
    
        // Count the number of nodes
        while (temp != null) {
            temp = temp.next;
            cur++;
        }
        System.out.println("No. of nodes : " + cur);
    
        // Bubble Sort Algorithm
        for (int i = 0; i < cur - 1; i++) {
            Node currentNode = head;
            Node nextNode = head.next;
    
            for (int j = 0; j < cur - i - 1; j++) {
                // Swap data if the current node's data is greater than the next node's data
                if (currentNode.data > nextNode.data) {
                    int tempData = currentNode.data;
                    currentNode.data = nextNode.data;
                    nextNode.data = tempData;
                }
                currentNode = nextNode;
                nextNode = nextNode.next;
            }
        }
    }
    

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();

        l1.InsBeg();
        l1.InsEnd();
        l1.InsEnd();
        l1.InsEnd();
        l1.InsEnd();

       

        // Testing insertion at a particular position
        // System.out.print("Enter position to insert: ");
        // int position = sc.nextInt();
        // l1.InsPos(position);
        l1.sort();
        l1.display();
    }
}
