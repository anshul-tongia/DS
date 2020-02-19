package ds.linear.list;

/* Use two pointers :
 *  Start the second only when first reaches to nth from the start location.
 * */
public class NthToLastInLinkedList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node head = list.generateLinkedList();
        NthToLastInLinkedList app = new NthToLastInLinkedList();
        System.out.println(app.findNthToLastInLinkedList(head, 4));
    }

    public int findNthToLastInLinkedList(Node head, int n) {
        if (head == null) {
            System.out.println("List is Empty.");
            return -1;
        }
        Node first = head;
        Node second = head;
        int count = 0;
        while (first != null) {
            first = first.getNext();
            if (count >= n + 1) {
                second = second.getNext();
            }
            count++;
        }
        return second.getData();
    }
}
