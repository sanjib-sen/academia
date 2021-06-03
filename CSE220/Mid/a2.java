import java.util.*;
public class a2 {
    public static void main(String []args){
        boolean check = true;
        String par = "< . . <> > . > < . < . . > >";
        char ar[] = new char[par.length()];
        for (int i=0;i< par.length();i++){
            ar[i] = par.charAt(i);
        }
        System.out.println(findDiamond(ar));
    }
    public static int findDiamond(char [ ] c){
        int tot =0;
        ArrayStack ab =new ArrayStack();
        for (int i =0; i<c.length; i++){
            char d = c[i];
            
            if (d=='<'){
                ab.push(c);
            }
            else if (d=='>'){
                if(ab.size==0){
                    continue;
                }
                else{
                    ab.pop();
                    tot++;
                }
            }
        }
        return tot;
    }
}