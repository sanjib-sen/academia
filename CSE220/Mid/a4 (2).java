import java.util.*;
public class a4 {
    public static void main(String []args){
    ArrayStack ab = ArrayStack();
    String pop ="";

    String s = "F#IND%Y# O % * U R O * # * W # # N # # * S E A # * % # T #";
    for (int i=0; i<s.length();i++){
        char c =s.charAt(i);
        if(c==' ' || c=='%'){
            continue;
        }
        else if(c=='#'){
            pop+=c;
            ab.pop();
        }
        else if(c=='*'){
            ab.peek();
        }
    }
    System.out.println(pop);
    System.out.println(ab.toString());
    }
}