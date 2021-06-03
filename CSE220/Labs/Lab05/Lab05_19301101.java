/*
 * Lab 05: "Searching and Sorting Lab"
 * 
 * Name : Sanjib Kumar Sen
 * ID: 19301101
 * Section: 01 (JNM)
 * 
 * GitHub = https://github.com/sanjib-sen
 */

// Some Q/As and Notes:
/**
 * Why I used sooo long names for methods?
 * = Dear Sir/Madam, I store my codes in my Github Private 
 * Repository and also Google Drive in case
 * I need these methods in the future.
 * There are so many similar algorithms/methods
 * having different parameters.
 * For example: Every sorting algorithm
 * can be done by using array, singly linked
 * list, doubly linked list, or circular
 * linked list. I can be confused which way
 * I used in the method. So, I kept my
 * method name understandable to future me.
 * And also commented for better realization.
 */

/**
 * I used Non-Dummy headed Linked List for
 * every Singly or Doubly Linked List.
 * It is because, I saw Proma Madam using
 * Non-Dummy Headed Linked List in the Lab 
 * Lecture 05. So, I went for this instead of
 * going with dummy headed Linked List.
 */

/**
 * I tried to use recursion for every method of this lab as understanding the
 * concept of recursion is also a part of this lab assesment. But there are 4
 * methods, where using recursion can be harder to call the methods for
 * end-users/readers of this code. For example, if I use recursion in creating
 * Doubly Linked List, I have to use 3 parameters which doesn't look cool to me.
 * Also, these 4 methods are not part of the lab assesment, So, I can use any.
 */
import java.util.*;

public class Lab05_19301101 {
    public static void main(String[] args) {
        Scanner sks = new Scanner(System.in);
        int ar[] = { 2, 9, 5, 10, 8, 1, 2, 7 };

        // This is the default array whicch is
        // also used in creating Linked List.
        // You can modify it.

        Node node = createSinglyList(ar);
        DNode dnode = createDoublyList(ar);

        // DNode stands for the Node of Doubly Linked List

        // CreateSinglyList method is for creating a non-dummy
        // headed Singly Linked List using provided array.

        // CreateDoublyList method is for creating a non-dummy
        // headed Doubly Linked List using provided array.

        // Both of the method will return the first Node of
        // the Linked List containing the first element
        // of the provided array.

        // Lab Assesment started from here.
        // Note that the 2nd parameter of any array related
        // method is the first index of the array.
        // And the first one is, obviously the array itself. :p
-
        System.out.println("\n----> Task01: Selection Sort an Array using Recursion <----");
        int car[] = recursiveCopy_array(ar, 0);
        System.out.print("Original Array: ");
        recursivePrint_array(car, 0);
        System.out.print("Sorted Array: ");
        recursiveSelectionSort_array(car, 0);
        recursivePrint_array(car, 0);

        System.out.println("\n----> Task02: Insertion Sort an Array using Recursion <----");
        car = recursiveCopy_array(ar, 0);
        System.out.print("Original Array: ");
        recursivePrint_array(car, 0);
        System.out.print("Sorted Array: ");
        recursiveInsertionSort_array(car, 0);
        recursivePrint_array(car, 0);

        System.out.println("\n----> Task03: Bubble Sort a Singly Linked List using Recursion <----");
        Node cnode = CopySinglyList(node);
        System.out.print("Original Linked List: ");
        recursivePrint_singlyList(cnode);
        System.out.print("Sorted Linked List: ");
        recursiveBubbleSort_singlyList(cnode);
        recursivePrint_singlyList(cnode);

        System.out.println("\n----> Task04: Selection Sort a Singly Linked List using Recursion <----");
        cnode = CopySinglyList(node);
        System.out.print("Original Linked List: ");
        recursivePrint_singlyList(cnode);
        System.out.print("Sorted Linked List: ");
        recursiveSelectionSort_singlyList(cnode);
        recursivePrint_singlyList(cnode);

        System.out.println("\n----> Task05: Insertion Sort a Doubly Linked List using Recursion <----");
        DNode cdnode = CopyDoublyList(dnode);
        System.out.print("Original Linked List: ");
        recursivePrint_doublyList(cdnode);
        System.out.print("Sorted Linked List: ");
        recursiveInsertionSort_doublyList(cdnode);
        recursivePrint_doublyList(cdnode);

        System.out.println("\n----> Task06: Search a value using Binary Search Algorithm and Recursion <----");
        car = recursiveCopy_array(ar, 0);
        System.out.print("Array: ");
        recursivePrint_array(car, 0);
        System.out.print("Enter value to search in the array: ");
        int value = sks.nextInt();
        if (recursiveBinarySearch_array(car, value, 0, 7)) {
            System.out.println("Yes! " + value + " was found in the array.");
        } else {
            System.out.println("No! " + value + " was not found in the array.");
        }

        System.out.println("\n----> Task07: Finding nth Fibonacci number using Recursion and Memorization <----");
        System.out.print("Enter value for n: ");
        int n = sks.nextInt();
        // The following code is for determining "th,rd or nd" in printing the number.
        int p = n;
        while (p >= 10) {
            p = p % 10;
        }
        String s = "";
        if (p == 1 && n != 11) {
            s = "st";
        } else if (p == 2 && n != 12) {
            s = "nd";
        } else if (p == 3 && n != 13) {
            s = "rd";
        } else {
            s = "th";
        }
        // Determining done.

        System.out.println("The " + n + s + " Fibonacci Number is: " + nthFibonacci(n) + ". ");
        System.out.println("\n----> The End <----\n");

    }

    public static Node createSinglyList(int[] source) {
        // This method is for creating a non-dummy
        // headed Singly Linked List using provided array.

        // This method is not a part of the Lab05 graded assesment.

        Node first = new Node(source[0], null);
        Node tail = first;

        for (int i = 1; i < source.length; i++) {
            Node here = new Node(source[i], null);
            tail.next = here;
            tail = here;
        }
        return first;
    }

    public static DNode createDoublyList(int[] source) {
        // This method is for creating a non-dummy
        // headed Doubly Linked List using provided array.

        // This method is not a part of the Lab05 graded assesment.

        DNode first = new DNode(source[0], null, null);
        DNode prev = first;
        DNode tail = first;

        for (int i = 1; i < source.length; i++) {
            DNode here = new DNode(source[i], null, prev);
            tail.next = here;
            tail = here;
            prev = here;
        }
        return first;

    }

    public static void recursivePrint_array(int source[], int ind) {
        // This method is for printing an array.

        // This method is not a part of the Lab05 graded assesment.

        // I used recursion for this method.

        if (ind == source.length - 1) {
            System.out.println(source[ind]);
            return;
        }
        System.out.print(source[ind] + " ");
        recursivePrint_array(source, ++ind);
    }

    public static void recursivePrint_singlyList(Node n) {
        // This method is for printing Non-dummy headed Dingly
        // Linked list.

        // This method is not a part of the Lab05 graded assesment.

        // I used recursion for this method.
        if (n.next == null) {
            System.out.println(n.element);
            return;
        }
        System.out.print(n.element + " ");
        recursivePrint_singlyList(n.next);
    }

    public static void recursivePrint_doublyList(DNode n) {
        // This method is for printing Non-dummy headed Doubly
        // Linked list.

        // This method is not a part of the Lab05 graded assesment.

        // I used recursion for this method.
        if (n.next == null) {
            System.out.println(n.element);
            return;
        }
        System.out.print(n.element + " ");
        recursivePrint_doublyList(n.next);
    }

    // The following "copy[]" array is used for memorization
    // in the "recursiveCopy_array" method
    public static int copy[];

    public static int[] recursiveCopy_array(int[] source, int start) {
        // This method is used for copying an array.

        // This method is not a part of the Lab05 graded assesment.

        // I used recursion and memorization for this method.

        if (start == 0) {
            copy = new int[source.length];
        }
        if (start == source.length) {
            return copy;
        }
        copy[start] = source[start];
        return recursiveCopy_array(source, ++start);
    }

    public static Node CopySinglyList(Node n) {
        // This method is for copying a non-dummy
        // headed Singly Linked List.

        // This method is not a part of the Lab05 graded assesment.

        Node first = new Node(n.element, null);
        Node tail = first;

        for (Node p = n.next; p != null; p = p.next) {
            Node here = new Node(p.element, null);
            tail.next = here;
            tail = here;
        }
        return first;
    }

    public static DNode CopyDoublyList(DNode n) {
        // This method is for copying a non-dummy
        // headed Doubly Linked List.

        // This method is not a part of the Lab05 graded assesment.

        DNode first = new DNode(n.element, null, null);
        DNode prev = first;
        DNode tail = first;

        for (DNode p = n.next; p != null; p = p.next) {
            DNode here = new DNode(p.element, null, prev);
            tail.next = here;
            tail = here;
            prev = here;
        }
        return first;

    }

    public static void recursiveSelectionSort_array(int source[], int start) {
        // This method is for Sorting an array using Selection Sort.

        if (start == source.length - 1) {
            return;
        }
        int min = start;

        for (int i = start + 1; i < source.length; i++) {
            if (source[i] < source[min]) {
                min = i;
            }
        }
        if (min != start) {
            int temp = source[min];
            source[min] = source[start];
            source[start] = temp;
        }
        recursiveSelectionSort_array(source, ++start);
    }

    public static void recursiveInsertionSort_array(int source[], int start) {
        // This method is Sorting an array using Insertion Sort.

        if (start > source.length - 1) {
            return;
        }
        for (int j = start - 1; j >= 0; j--) {
            if (source[j] > source[j + 1]) {
                int temp = source[j];
                source[j] = source[j + 1];
                source[j + 1] = temp;
            } else {
                break;
            }
        }
        recursiveInsertionSort_array(source, ++start);
    }

    public static void recursiveBubbleSort_singlyList(Node n) {
        // This method is Sorting a Non-Dummy headed Singly
        // Linked List using Bubble Sort.

        // I used recursion for this method.
        if (n == null) {
            return;
        }
        for (Node p = n.next; p != null; p = p.next) {
            if ((int) n.element > (int) p.element) {
                Object temp = n.element;
                n.element = p.element;
                p.element = temp;
            }
        }
        recursiveBubbleSort_singlyList(n.next);
    }

    public static void recursiveSelectionSort_singlyList(Node n) {
        // This method is Sorting a Non-Dummy headed Singly
        // Linked List using Selection Sort.

        // I used recursion for this method.
        if (n.next == null) {
            return;
        }
        Node min = n;

        for (Node p = n; p != null; p = p.next) {
            if ((int) p.element < (int) min.element) {
                min = p;
            }
        }
        if (min.element != n.element) {
            Object temp = n.element;
            n.element = min.element;
            min.element = temp;
        }
        recursiveSelectionSort_singlyList(n.next);
    }

    public static void recursiveInsertionSort_doublyList(DNode n) {
        // This method is Sorting a Non-Dummy headed Doubly
        // Linked List using Insertion Sort.

        // I used recursion for this method.
        if (n == null) {
            return;
        }
        if (n.prev == null) {
            recursiveInsertionSort_doublyList(n.next);
            return;
        }
        for (DNode j = n.prev; j != null; j = j.prev) {
            if ((int) j.element > (int) j.next.element) {
                Object temp = j.element;
                j.element = j.next.element;
                j.next.element = temp;
            } else {
                break;
            }
        }
        recursiveInsertionSort_doublyList(n.next);
    }

    public static boolean recursiveBinarySearch_array(int source[], int value, int start, int end) {
        // This method is for searching a value using Binary Search Algorithm in a
        // provided array.

        if (start >= end + 1) {
            return false;
        }
        recursiveInsertionSort_array(source, start);
        int mid = (start + end) / 2;
        if (value == source[mid]) {
            return true;
        } else if (value > source[mid]) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
        return recursiveBinarySearch_array(source, value, start, end);
    }

    // The following "fib[]" array is used for memorization
    // in the nthFibonacci method.
    public static int fib[] = new int[100];

    public static int nthFibonacci(int n) {
        // This method is for finding the n'th (Where n is provided)
        // fibonacci number.
        if (fib[n] > 0)
            return fib[n];
        if (n <= 1) {
            return fib[n] = n;
        }
        return fib[n] = nthFibonacci(n - 1) + nthFibonacci(n - 2);
    }

}
