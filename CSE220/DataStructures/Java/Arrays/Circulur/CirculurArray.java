import java.util.*;
public class CirculurArray {

 /** To Do's:
 * 2. Insert
 * 3. Remove
 * 4. Rotate Left-Right
 */

    public static void main (String [] args){
        int ar[] = {10,20,30,40,50};
        //int test[]= linerToCirculur(array, 2, 5);
        reverse_inside(ar, 0, 5);
        justPrint(ar);
    }

    public static void justPrint(int [] source){
        for(int i =0; i<source.length-1; i++){
            System.out.print(source[i]+" ");
        }
        System.out.println(source[source.length-1]);
    }

    public static void forwardPrint(int [] source, int start, int size){
        int index = start;
        for (int i =0; i < size-1; i++, index = (index+1)%source.length){
            System.out.print(source[index]+" ");
        }
        System.out.print(source[index]+" ");
    }

    public static void backwardPrint(int [] source, int start, int size){
        int index = (start + size -1) % source.length;
        for (int i =0; i<size ; i++, index--){
            System.out.print(source[index]+" ");
            if (index-1==-1){
                index = source.length;
            }            
        }
    }

    public static int[] linerToCirculur(int[] linear, int start, int size){
        int circulur [] = new int [linear.length];
        int index = start;
        for (int  i = 0; i<size;i++){
            circulur[index] = linear[i];
            index = (index+1) % circulur.length;
        }
        return circulur;
    }

    //resize array length to size (+/=change)
    public static int[] resize(int[] source, int start, int size, int change){ 
        int [] dest = new int[source.length+change];
        int source_index = start;
        int dest_index = start;

        for(int i =0; i < size; i++){
            dest[dest_index] = source[source_index];
            source_index = (source_index+1) % source.length;
            dest_index = (dest_index+1) % dest.length;
        }
        return dest;
    }

    public static void reverse_inside(int [] source, int start, int size){
        int index = (start + size -1) % source.length;
        for (int i =0; i<size/2 ; i++, index--){
            int temp = source[index];
            source[index] = source[(i+start)%source.length];
            source[(i+start)%source.length] = temp;
            if (index-1==-1){
                index = source.length;
            }            
        }
    }

}