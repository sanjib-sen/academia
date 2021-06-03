public class ParenthesisBalancing {
    public static void main(String [] args){
        boolean check = true;
        String par = "(6*[5}+9)";
        ListStack ab =new ListStack();
        for (int i =0; i<par.length(); i++){
            if (par.charAt(i)=='(' || par.charAt(i)=='{' || par.charAt(i)=='['){
                ab.push(par.charAt(i));
            }
            else if (par.charAt(i)==')' || par.charAt(i)=='}' || par.charAt(i)==']'){
                if(ab.size == 0){
                    System.out.println("Bad");
                    check =false;
                }
                else if(par.charAt(i) == ')' && ab.peek().toString().charAt(0)!= '('){
                    System.out.println("Bad");
                    check = false;
                }
                else if(par.charAt(i) == '}' && ab.peek().toString().charAt(0)!= '{'){
                    System.out.println("Bad");
                    check = false;
                }
                else if(par.charAt(i) == ']' && ab.peek().toString().charAt(0)!= '['){
                    System.out.println("Bad");
                    check = false;
                }
            ab.pop();
        }

            
        }
        if (check){
        System.out.println("Good");
        }
    }
}