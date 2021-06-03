/*
 * Name : Sanjib Kumar Sen 
 * ID: 19301101 
 * Lab and Theory Section: 01 (JNM)
 */

public class Node {
    Patient patient;
    Node next;
    Node prev;

    public Node(Patient p, Node n, Node pr) {
        patient = p;
        next = n;
        prev = pr;
    }

}