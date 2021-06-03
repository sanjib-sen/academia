public class Lecture4P2 {
    public static void main(String[] args) {
        Node n7 = new Node(6, null);
        Node n6 = new Node(10, n7);
        Node n5 = new Node(1, n6);
        Node n4 = new Node(1, n5);
        Node n3 = new Node(10, n4);
        Node n2 = new Node(10, n3);
        Node n1 = new Node(6, n2);
        Node n0 = new Node(6, n1);
        Node head = n0;
        Node p7 = new Node (2, null);
        Node p6 = new Node (2, p7);
        Node p5 = new Node(7, p6);
        Node p4 = new Node(8, p5);
        Node p3 = new Node(9, p4);
        Node p2 = new Node(10, p3);
        Node p1 = new Node(1, p2);
        Node p0 = new Node(6, p1);



        Node k = Product (head, p0);

        for (Node n = k; n!=null;n=n.next){
            System.out.println(n.element);
        }

        // if (contains(head, 30)) {
        //     System.out.println("Yes, it Worked");
        // } else {
        //     System.out.println("No, it didn't work");
        // }
        // if (contains(head, "Hello")) {
        //     System.out.println("Yes String");
        // } else {
        //     System.out.println("No, it didn't work");
        // }

        // findDuplicate(head);

    }

    // public static boolean contains(Node n, Object element) {
    //     for (; n != null; n = n.next) {
    //         if (n.element.equals(element)) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    public static Node Product (Node A, Node B){
        Node copyHead = null;
        Node copyTail = null;
        for (Node n =A; n!= null; n=n.next, B=B.next, A= A.next){
            Node newNode = new Node(A.element*B.element, null);
            if (copyHead == null){
                copyHead = newNode;
                copyTail = newNode;
            }
            else{
                copyTail.next = newNode;
                copyTail = newNode;
            }
        }
        return copyHead;
    }

    // public static void findDuplicate(Node haha) {
    //     for (Node first = haha; first != null; first = first.next) {
    //         for (Node second = first.next; second != null; second = second.next) {
    //             if (second.element.equals(first.element)) {
    //                 System.out.println(second.element);
    //                 return;
    //             }
    //         }
    //     }
    // }

}