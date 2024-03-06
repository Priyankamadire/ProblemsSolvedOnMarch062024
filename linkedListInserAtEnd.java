public class linkedListInserAtEnd {
    static Node head;

    public static void main(String args[]) {
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        insertAtEnd(90);
        printList();

    }

    public static void insertAtEnd(int d) {
        Node temp = new Node(d);
        if (head == null) {
            head = temp;
            return;
        }
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        n.next = temp;
    }

    public static void printList() {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}