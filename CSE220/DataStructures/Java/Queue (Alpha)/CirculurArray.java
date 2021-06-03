public class CirculurArray {

 /** To Do's:
 * 1. In-place Reverse
 * 2. Insert
 * 3. Remove
 * 4. Rotate Left-Right
 */

    public static void main (String [] args){
        int array[] = {10,20,30,40,50};
        int test[]= linerToCirculur(array, 2, 5);
        justPrint(test);
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
        for (; index >= 0; index--){
            System.out.print(source[index]+" ");            
        }
        index = source.length-1;
        for (;index >= start+1; index--){
            System.out.print(source[index]+" ");
        }
        System.out.println(source[index]);
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

}