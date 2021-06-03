public class print {
    public static void main(String[] args) {
        for(Node n =head.next; n!= head; n=n.next){
            System.out.print(n.element+" ");
        }
    }
}