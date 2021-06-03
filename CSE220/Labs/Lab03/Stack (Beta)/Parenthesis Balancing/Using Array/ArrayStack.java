/*
 * Name: Sanjib Kumar Sen
 * ID: 19301101
 * Section: 01 (JNM) 
 * github: https://github.com/sanjib-sen
 */

/*
 * So why did you create the Parenthis Class?
 *  => Sir, I needed to store the position of the Parenthesis
 *      in the String to the Stack. Because according to the samples
 *      I also have to show the position of the parenthesis
 *      in " 'Parenthesis' - not closed." Case. Also, it is
 *      not easy to store 2 values in Array. So, I created
 *      The Parenthesis Object and pass it to the Array.
 */

public class ArrayStack {
    Parenthesis[] a;
    int size;
    int def_size = 100;

    public ArrayStack() {
        a = new Parenthesis[def_size];
        size = 0;
    }

    public void push(Object e, int pos) {
        if (size == a.length) {
            System.out.println("Stack over flow!");
            return;
        }
        Parenthesis par = new Parenthesis(e, pos);
        a[size] = par;
        size++;
    }

    public Object peek() {
        if (size == 0) {
            System.out.println("Stack under flow!");
            return null;
        }
        return a[size - 1].object;
    }

    public Object pop() {
        if (size == 0) {
            System.out.println("Stack under flow!");
            return null;
        }
        Object val = a[size - 1].object;
        a[size - 1] = null;
        size--;
        return val;
    }

    // This method is useful for getting the position of the Stacked Parenthesises.
    public int getPosition() {
        if (size <= 0) {
            System.out.println("Stack Underflow");
        }
        return a[size - 1].position;
    }

    // This method is useful for checking if the parenthesis exists in Stack or Not.
    public boolean exist(Object e) {
        for (int i = 0; i < size; i++) {
            if (e == a[i].object) {
                return true;
            }
        }
        return false;
    }

}