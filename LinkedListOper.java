class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class LinkedListOper {

    static Node head;

    public static void main(String args[]) {
        LinkedListOper list = new LinkedListOper();
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        printLL();
        System.out.println();
        insertAtBeg(5);
        insertAtBeg(4);
        printLL();
        System.out.println();
        insertAtEnd(50);
        printLL();
        System.out.println();
        System.out.println("length is " + getLength());

    }

    public static void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void insertAtBeg(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    public static void insertAtEnd(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            return;
        }
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = temp;
    }

    public static int getLength() {
        Node t = head;
        int l = 0;
        while (t != null) {
            l++;
            t = t.next;
        }
        return l;
    }

}
