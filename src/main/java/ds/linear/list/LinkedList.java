/* Linked List :
 *  a) Insert in the beginning.
 *  b) Display the content.
 *  c)
 * */

package ds.linear.list;

class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

public class LinkedList {
    private Node head;

    private boolean isEmpty() {
        return head == null;
    }

    public void insertInTheBeginning(int data) {
        Node new_node = new Node(data);
        if (isEmpty()) {
            head = new_node;
            return;
        }

        Node current = new_node;
        current.setNext(head);
        head = current;
    }

    public void display() {
        if (isEmpty())
            System.out.println("List is Empty!!");
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public Node generateLinkedList() {
        insertInTheBeginning(100);
        insertInTheBeginning(90);
        insertInTheBeginning(80);
        insertInTheBeginning(70);
        insertInTheBeginning(60);
        insertInTheBeginning(50);
        insertInTheBeginning(40);
        insertInTheBeginning(30);
        insertInTheBeginning(20);
        insertInTheBeginning(10);
        return head;
    }

}

