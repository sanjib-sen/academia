public class ListStack implements Stack{
    Node head;
    int size = 0;
    public void push(Object e){
        Node n = new Node(e, head);
        head = n;
        size++;
    }
    public Object peek(){
        if(head==null){
            System.out.println("Stack under flow!");
            return null;
        }
        return head.element;
    }
    public Object pop(){
        if(head==null){
            System.out.println("Stack under flow!");
            return null;
        }
        Node remove = head;
        head = head.next;
        remove.next = null;
        return remove.element;
    }
}