class DoublyLinkedList {
    class Node {
        int data;
        Node prev, next;
        Node(int d) { data = d; }
    }
    private Node head, tail;
    
    void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        System.out.println("Inserted at head: " + data);
    }
    
    void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Inserted at tail: " + data);
    }
    
    void traverseForward() {
        Node temp = head;
        System.out.print("Forward Traversal: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    void traverseBackward() {
        Node temp = tail;
        System.out.print("Backward Traversal: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
}

public class CC0 {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtHead(3);
        dll.insertAtTail(5);
        dll.insertAtHead(1);
        dll.insertAtTail(7);
        dll.traverseForward();
        dll.traverseBackward();
    }
}