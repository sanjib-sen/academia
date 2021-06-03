public class Lecture4P1 {
    public static void main (String [] args){

        Node n5 = new Node('B', null);
        Node n4 = new Node('I', n5);
        Node n3 = new Node('J', n4);
        Node n2 = new Node('N', n5);
        Node n1 = new Node('A', n2);
        Node n0 = new Node('S', n1);
        Node head = n0;

        System.out.println(n2);

    }
}

