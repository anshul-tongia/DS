package ds.tree.bst;

public class BST {
    private Node root;

    public void insert(int data) {
        root = insert(data, root);
    }

    private Node insert(int data, Node root) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        Node current = root;
        if (data < current.getData()) {
            current.setLeftChild(insert(data, current.getLeftChild()));
        } else if (data > current.getData()) {
            current.setRightChild(insert(data, current.getRightChild()));
        } else {
            return current;
        }
        return current;
    }

    public void display() {
        System.out.println(root);
    }


}
