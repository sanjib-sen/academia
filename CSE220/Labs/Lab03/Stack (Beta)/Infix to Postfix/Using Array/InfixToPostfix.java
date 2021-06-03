public class InfixToPostfix {
    public static void main(String [] args){
        boolean high = false;
        boolean mid = false;
        String infix = "A+B*(C-D/E)";
        String postfix = "";
        ArrayStack ab = new ArrayStack();
        for (int i =0; i<infix.length();i++){
            char a = infix.charAt(i);
            if(a=='(' || a=='{' || a=='['){
                high = false;
                mid = false;
                ab.push(a);
            }
            else if (a == '*' || a=='/' || a=='%'){
                if (high == false){
                    ab.push(a);
                    high =true;
                }
                else{
                    char b =ab.peek().toString().charAt(0);
                    while(ab.size!=0 && (b!='(' || b!='{' || b!='[')){
                        postfix+=ab.peek().toString().charAt(0);
                        ab.pop();
                    }
                    ab.push(a);
                }
            }
            else if (a=='+' || a=='-'){
                if(mid == false && high == false){
                    ab.push(a);
                    mid =true;
                }
                else{
                    //System.out.println(ab.toString());
                    char b =ab.peek().toString().charAt(0);
                    while(ab.size!=0 && (b!='(' || b!='{' || b!='[')){
                        System.out.println(postfix +" "+ (ab.size));
                        postfix+=ab.peek().toString().charAt(0);
                        ab.pop();
                    }
                    ab.push(a);
                }
            }
            else if (a==')' ||a=='}' ||a==']'){
                char b =ab.peek().toString().charAt(0);
                while(b!='(' && b!='{' && b!='[' && ab.size!=0){
                    postfix +=b ;
                    ab.pop();
                }
            }
            else{
                postfix+=a;
            }
        }
        while(ab.size !=0){
            postfix+=ab.peek().toString().charAt(0);
            ab.pop();
        }
        System.out.println(postfix +" "+ (ab.size));
    }
}