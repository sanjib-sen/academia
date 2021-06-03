import org.w3c.dom.Node;

public class another {
    public static void main(String []args){
                Node n5 = new Node(1, null);
                Node n4 = new Node(2, n5);
                Node n3 = new Node(3, n4);
                Node n2 = new Node(4, n3);
                Node n1 = new Node(5, n2);
                Node n0 = new Node(6, n1);
                Node head = n0;
                Node p5 = new Node(7, null);
                Node p4 = new Node(8, p5);
                Node p3 = new Node(9, p4);
                Node p2 = new Node(10, p3);
                Node p1 = new Node(1, p2);
                Node p0 = new Node(2, p1);

            Node k = Prduct (n0,p0);
            System.out.print(k.element);
        }

    public static Node Prduct (Node A, Node B){
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
}