public class linkedListInserAtBegin {
    static Node head;

    public static void main(String args[]) {
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        insertbeg(5);
        printList();

    }

    public static void insertbeg(int d) {
        Node t = new Node(d);
        t.next = head;
        head = t;
    }

    public static void printList() {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;  
        }
    }

}