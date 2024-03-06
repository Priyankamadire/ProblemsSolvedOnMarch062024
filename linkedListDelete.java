class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class linkedListDelete {
    static Node head;

    public static void main(String args[]) {
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        printList();
        head = del();
        System.out.println("");
        System.out.print("Deleted node");
        System.out.println("");
        printList();

    }

    public static Node del() {
        if (head == null) {
            return null;
        } else {
            head = head.next;
            return head;
        }

    }

    public static void printList() {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}