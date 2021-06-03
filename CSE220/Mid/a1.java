import java.util.*;

public class a1 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 6 };
        int b[] = { 2, 4, 6, 8, 10, 17, 12 };
        Node s = build(a, b);
        for (Node ps = s; ps != null; ps = ps.next) {
            System.out.print(ps.element + " ");
        }
    }

    public static Node build(int a[], int b[]) {
            Node head = null;
            Node tail = null;
            Node previous = null;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    if (a[i] == b[j]) {
                        Node newNode = new Node(a[i], null, null);
                        if (head == null) {
                            head = newNode;
                            tail = newNode;
                            previous = head;
                        } 
                        else {
                            tail.next = newNode;
                            tail = newNode;
                            tail.prev = previous;
                            previous =tail;
                        }
                        break;
                    }
                }
            }
            head.prev = tail;
            return head;
        }
}