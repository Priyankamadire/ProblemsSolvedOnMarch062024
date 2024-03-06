public class CountNoOfNodes {
    static Node head;

    public static void main(String args[]) {
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        insertbeg(5);
        System.out.print("Length of List is:" + countList());

    }

    public static void insertbeg(int d) {
        Node t = new Node(d);
        t.next = head;
        head = t;
    }

    public static int countList() {
        Node temp = head;
        int l = 0;
        while (temp != null) {
            l++;
            temp = temp.next;

        }
        return l;

    }

    public static void printList() {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}