import java.util.*;

public class Lab04_19301101 {
    public static void main(String[] args) {
        Scanner sks = new Scanner(System.in);

        System.out.println("\n ---- Lab04: Recursion ----");
        System.out.println(" Name: Sanjib Kumar Sen");
        System.out.println(" ID: 19301101, Section: 01");
        System.out.println(" --------------------------\n");

        System.out.println("\n------- Task 01: Finding Factorial -------");
        System.out.print("Give a number to Find out its factorial.\nNumber: ");
        int n = sks.nextInt();
        System.out.println("The factorial of " + n + " is: " + factorial(n));
        System.out.println("------------------------------------------\n");

        System.out.println("\n------- Task 02: Finding the nth Fibonacci -------");
        System.out.print("Number (n): ");
        n = sks.nextInt();
        System.out.println("The " + n + "th Fibonacci number is: " + nthFibonacci(n));
        System.out.println("--------------------------------------------------\n");

        System.out.println("\n------- Task 03: Printing the elements of an Array -------");
        int ar[] = { 1, 2, 3, 4, 5, 56 };
        System.out.print("The elements of the array are: ");
        printArray(ar, 0);
        System.out.println("----------------------------------------------------------\n");

        System.out.println("\n------- Task 04: Finding the Binary of a Decimal Number -------");
        System.out.print("Decimal Number: ");
        n = sks.nextInt();
        System.out.println("The Binary format of " + n + " is: " + decimalToBinary(n));
        System.out.println("---------------------------------------------------------------\n");

        System.out.println("\n------- Task 05: Finding the nth power of a number m -------");
        System.out.print("Base Number (m): ");
        int m = sks.nextInt();
        System.out.print("To be Power (n): ");
        n = sks.nextInt();
        System.out.println(m + "^" + n + " is: " + mPowerN(m, n));
        System.out.println("-------------------------------------------------------------\n");

        System.out.println("\n------- Task 06: Adding the elements of a Linked List -------");
        Node n6 = new Node(60, null);
        Node n5 = new Node(50, n6);
        Node n4 = new Node(40, n5);
        Node n3 = new Node(30, n4);
        Node n2 = new Node(20, n3);
        Node n1 = new Node(10, n2);
        Node head = new Node(0, n1);
        System.out.println("The result of addition is: " + addElements(head));
        System.out.println("-------------------------------------------------------------\n");

        System.out.println("\n------- Task 07: Reverse printing the elements of a Linked List -------");
        System.out.print("The elements of the linked list (in reverse) are: ");
        printReversed(head);
        System.out.println("\n--------------------------------< The End >----------------------------\n");
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int nthFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return nthFibonacci(n - 1) + nthFibonacci(n - 2);
    }

    public static void printArray(int ar[], int n) {
        if (ar.length - 1 == n) {
            System.out.println(ar[n]);
            return;
        }

        System.out.print(ar[n] + " ");
        n++;
        printArray(ar, n);
    }

    public static String decimalToBinary(int n) {
        if (n <= 1) {
            return n % 2 + "";
        }
        return decimalToBinary(n / 2) + n % 2;
    }

    public static int mPowerN(int m, int n) {
        if (n == 1) {
            return m;
        }
        if (n == 0) {
            return 1;
        }
        return m * mPowerN(m, n - 1);
    }

    public static int addElements(Node p) {
        if (p.next == null) {
            return p.element;
        }
        return p.element + addElements(p.next);
    }

    public static void printReversed(Node p) {
        if (p.next == null) {
            System.out.print(p.element);
            return;
        }
        printReversed(p.next);
        System.out.print(" " + p.element);
    }

}
