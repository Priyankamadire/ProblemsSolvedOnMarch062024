class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class linkedListInserAtPosition {
    static Node head;

    public static void main(String args[]) {
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        insertAtPos(25, 3);
        printList();

    }

    public static void insertAtPos(int d, int pos) {
        Node temp = new Node(d);

        if (pos == 1) {
            temp.next = head;
            head = temp;
            return;
        }

        if (head == null) {
            System.out.println("out of range");
            return;
        }

        Node curr = head;
        for (int i = 1; i < pos - 1; i++) {
            if (curr.next == null) {
                System.out.println("out of range");
                return;
            }
            curr = curr.next;
        }
        temp.next = curr.next;
        curr.next = temp;
    }

    public static void printList() {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}