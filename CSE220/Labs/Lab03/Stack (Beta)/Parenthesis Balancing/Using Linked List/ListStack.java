/*
 * Name: Sanjib Kumar Sen
 * ID: 19301101
 * Section: 01 (JNM) 
 * github: https://github.com/sanjib-sen
 */

public class ListStack {
    Node head;
    int size;

    public ListStack() {
        head = new Node(null, null, 0);
        size = 0;
    }

    public void push(Object e, int p) {
        Node n = new Node(e, head, p);
        // This node will also store the position of the
        // Parenthesis in String to Stack. Please check
        // Node Class for detailed info.
        head = n;
        size++;
    }

    public Object peek() {
        if (head == null) {
            System.out.println("Stack under flow!");
            return null;
        }
        return head.element;
    }

    public Object pop() {
        if (head == null) {
            System.out.println("Stack under flow!");
            return null;
        }
        Node remove = head;
        head = head.next;
        remove.next = null;
        size--;
        return remove.element;
    }

    // This method is useful for getting the position of the Stacked Parenthesises.
    public int getPosition() {
        if (size <= 0) {
            System.out.println("Stack Underflow");
        }
        return head.position;
    }

    // This method is useful for checking if the parenthesis exists in Stack or Not.
    public boolean exist(Object e) {
        for (Node p = head; p != null; p = p.next) {
            if (p.element == e) {
                return true;
            }
        }
        return false;
    }
}