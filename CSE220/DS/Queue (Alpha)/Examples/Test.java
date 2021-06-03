
public class Test {
    public static void main(String [] args){
        ArrayQueue ab = new ArrayQueue();
        ab.enqueue("a");
        ab.enqueue('b');
        ab.enqueue('c');
        ab.enqueue('d');
        ab.enqueue('e');
        ab.enqueue('f');
        ab.enqueue('g');

        System.out.println(ab.toString());
        ab.dequeue();
        ab.dequeue();
        System.out.println(ab.toString());

    }
}