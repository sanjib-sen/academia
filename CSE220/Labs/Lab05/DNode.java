/**
 * Name : Sanjib Kumar Sen ID: 19301101 Section: 01 (JNM)
 */

// This class used for creating a Node for Doubly Linked List
public class DNode {
    Object element;
    DNode next;
    DNode prev;

    public DNode(Object e, DNode n, DNode p) {
        element = e;
        next = n;
        prev = p;
    }
}
