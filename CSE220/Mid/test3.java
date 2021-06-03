import java.util.*;
public class test3 {
    public static void main(String []args){
    int ar[] ={1,2,3,4,5,6,7,8,9};
    Node p = createList(ar);
    }


    public static Node createList(int[] array){
        Node head = null;
        Node tail = null;

        for (int i= 0; i<array.length;i++){
            Node newNode = new Node(array[i], null);
            if (head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;

    }
}