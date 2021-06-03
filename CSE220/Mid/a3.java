import java.util.*;
public class a3 {
    public static void main(String []args){
        Node n7 = new Node(6, null);
        Node n6 = new Node(1, n7);
        Node n5 = new Node(2, n6);
        Node n4 = new Node(1, n5);
        Node n3 = new Node(1, n4);
        Node n2 = new Node(6, n3);
        Node n1 = new Node(6, n2);
        Node n0 = new Node(6, n1);
        Node head = n0;
        int p =LCA(head);
        System.out.println(p);
    }

    public static int LCA(Node A){
        int max =0;
        int count=1;
        for(Node a =A; a.next!=null;a=a.next){
            if(a.element == a.next.element){
                count+=1;
            }
            else{
                if (max<count){
                    max = count;
                }
                count = 1;
            }
        }
        return max;
    }
}