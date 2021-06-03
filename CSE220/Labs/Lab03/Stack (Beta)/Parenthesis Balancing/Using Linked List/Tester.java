/*
 * Name: Sanjib Kumar Sen
 * ID: 19301101
 * Section: 01 (JNM) 
 */

public class Tester {
    public static void main(String[] args) {
        String ab = "1+[](){}[{}()()()]";
        ParenthesisBalancing(ab);
    }

    public static char opposite(char c) {
        if (c == '(') {
            return ')';
        } else if (c == '{') {
            return '}';
        } else if (c == '[') {
            return ']';
        } else if (c == ')') {
            return '(';
        } else if (c == '}') {
            return '{';
        } else {
            return '[';
        }
    }

    public static void ParenthesisBalancing(String par) {
        ListStack ab = new ListStack();
        for (int i = 0; i < par.length(); i++) {
            char c = par.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                ab.push(c, i);
            } else if (c == ')' || c == '}' || c == ']') {
                if (ab.size == 0 || !ab.exist(opposite(c))) {
                    System.out.println("This expression is NOT correct.");
                    System.out.println("Error at character # " + (i + 1) + ". '" + par.charAt(i) + "'- not opened.");
                    return;
                } else if (ab.peek().toString().charAt(0) != opposite(c)) {
                    System.out.println("This expression is NOT correct.");
                    System.out.println("Error at character # " + (ab.getPosition() + 1) + ". '"
                            + ab.peek().toString().charAt(0) + "'- not closed.");
                    return;
                }
                ab.pop();
            }

        }
        if (ab.size != 0) {
            System.out.println("This expression is NOT correct.");
            System.out.println("Error at character # " + (ab.getPosition() + 1) + ". '" + ab.peek().toString().charAt(0)
                    + "'- not closed.");
            return;
        }
        System.out.println("This expression is correct.");
    }

}