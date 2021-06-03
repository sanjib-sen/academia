/*
 * Name: Sanjib Kumar Sen
 * ID: 19301101
 * Section: 01 (JNM) 
 */

/*
 * So why did you create the Parenthis Variable in Node? 
 *  => Sir, I needed to store the position of a Parenthesis in the 
 *      String to the Stack. Because according to
 *      the samples I also have to show the position of the 
 *      parenthesis in "'Parenthesis' - not closed." Case. So, I
 *      created another variable.
 */

public class Node {
    Object element;
    Node next;
    int position;

    public Node(Object e, Node n, int p) {
        element = e;
        next = n;
        position = p;
    }

}