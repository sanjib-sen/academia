import java.util.*;
public class test1 {
    public static void main(String []args){
        ArrayStack abc =new ArrayStack();
        abc.push(1);
        abc.push(2);
        abc.push(3);
        abc.push(4);
        abc.push(5);
        abc.push(6);
        System.out.println(abc.peek());
        System.out.println(abc.pop());
        System.out.println(abc.peek());
    }
}