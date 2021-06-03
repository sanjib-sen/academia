public class LinkedList {
    public int countNode(Node head) {
        int count = 0;
        for (Node n = head; n != null; n = n.next) {
            count++;
        }
        return count;
    }

    public Object getElement(Node head, int index) {

        int c = 0;
        for (Node n = head; n != null; n = n.next) {
            if (c == index) {
                return n.element;
            }
            c++;
        }
        return -1;
    }

    public Node nodeAt(Node head, int size, int index) {
        if (index < 0 || index >= size) {
            return null;
        }

        Node n = head;
        for (int i = 0; i < index; i++, n = n.next) {
            ;
        }
        return n;

    }

    public void set(Node head, int index, Object elem) {

        if (countNode(head) <= index) {
            throw new IndexOutOfBoundsException();
        }

        int c = 0;
        for (Node n = head; n != null; n = n.next) {
            if (c == index) {
                n.element = elem;
            }
        }
        c++;
    }

    public int indexOf(Node head, Object elem) {
        int i = 0;
        for (Node n = head; n != null; n = n.next) {
            if (n.element.equals(elem)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public Node insert(Node head, int size, Object elem, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        Node newNode = new Node(elem, null);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
        }

        else {
            Node pred = nodeAt(head, size, index - 1);
            newNode.next = pred.next;
            pred.next = newNode;
        }
        return head;
    }

    public Node remove (Node head, int size, int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        Node removedNode = null;
        if(index == 0){
            removedNode = head;
            head = head.next;
        }
        else{
            Node pred = nodeAt(head, size, index -1)
            removedNode = pred.next;
            pred.next = removedNode.next;
            
        }

        removedNode.element = null;
        removedNode.next = null;
        return head;
    }

    public Node createList(int[] array){
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

    public Node copyList (Node head){
        Node copyHead = null;
        Node copyTail = null;
        for (Node n =head; n!= null; n=n.next){
            Node newNode = new Node(n.element, null);
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

    public Node SortedList(Node head){
        Node copyHead = null;
        for (Node n = head;n!=null;n=n.next){
            Node newNode = new Node (n.element, null);
            if (copyHead==null){
                copyHead = newNode;
            }
            else{
                newNode.next = copyHead;
                copyHead = newNode;
            }
        }
        return copyHead;
    }
    
    public static Node rotateLeft(Node head){
        Node oldHead = head;
        head = head.next;
        Node tail = head;

        while (tail.next!= null){
            tail = tail.next;
        }

        tail.next = oldHead;
        oldHead.next = null;

        return head;

    }

    public static Node rotateRight(Node head){
        Node tail = head;
        Node temp = null;
        while(tail.next!=null){
            temp = tail;
            tail = tail.next;
        }
        tail.next = head;
        head = tail;
        temp.next = null;
        return head;
    }
}