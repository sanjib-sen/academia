public class LinearArray{
    public static void main (String[] args){
        int array [] ={10,20,30,40,50,60, 70, 80, 90, 100};
         rotateLeft_inside(array, 2);
        print(array);
    }


    // This will just print the array
    public static void print(int [] source){       
        int i =0;
        for(;i<source.length-1;i++){
            System.out.print(source[i]+" ");
        }
        System.out.println(source[source.length-1]);
    }


    //This will just print the array in reverse
    public static void PrintReverse(int [] source){    
        int i = source.length-1;
        for (;i>0;i--){
            System.out.print(source[i]+" ");
        }
        System.out.println(source[0]);
    }


    // This will make a copy of the array
    public static int[] CopyArray(int [] source){      
        int dest[] = new int [source.length];
        for (int i =0; i<source.length;i++){
            dest[i] = source[i];
        }
        return dest;
    }


    // This will create a copy of the reversed array
    public static int[] CopyReverse(int[] source){      
        int dest[] = new int [source.length];
        for (int i = source.length - 1, j =0;i >= 0; i--, j++ ){
            dest[j] = source[i];
        }
        return dest;
    }


    // This will reverse the array without creating a copy
    public static void ReverseArray(int [] source){    
        for (int i = 0; i<source.length/2;i++){
            int temp = source[source.length-1-i];
            source[source.length-1-i] = source[i];
            source[i] = temp;
        }
    }


    
    public static void shiftRight_inside(int [] source, int k){      
        for (int i = source.length-1; i>=k;i--){
            source[i] = source[i-k];
        } 

        for (int i =k-1;i>=0;i--){
            source[i] =0;
            continue;
        }
    }


    // This will shift the array in right by k step with creating a new array
    public static int [] shiftRight_outside(int [] source, int k){
        int dest[] = new int [source.length];
        for (int i = 0; i < k; i++){
            dest[i] = 0;
        }
        for (int i = 0; i <= k; i++){
            dest[i+k+1] = source[i];
        }
        return dest;
    }


    // This will shift the array in left by k step without creating a new array
    public static void shiftLeft_inside(int [] source, int k){       
        int i = k;
        for(;i<source.length;i++){
            source[i-k] = source[i];
        }
        for (;i<source.length+k;i++){
            source[i-k] =0;
        }
    }


    // This will shift the array in left by k step with creating a new array
    public static int[] shiftLeft_outside(int[] source, int k){    
        int dest[] = new int [source.length];
        int i = 0;
        for(; i < source.length-k; i++ ){
            dest[i] = source[i+k];
        }

        for (; i < source.length; i++ ){
            dest[i] = 0;
        }
        return dest;
    }


    // This will rotate the array in right by k step without creating a new array
    public static void rotateRight_inside(int [] source, int k){
        int i = 0;
        for(; i < k; i++){
            int temp = source[i];
            source[i] = source[source.length-k+i];
            source[source.length-k+i] = temp;
        }

        for(; i<2*k;i++){
            int temp = source[i];
            source[i] = source[source.length-2*k+i];
            source[source.length-2*k+i] = temp;
        }

    }


    // This will rotate the array in right by k step with creating a new array
    public static int [] rotateRight_outside(int [] source, int k){      
        int tmparray [] = new int [source.length];
        for (int i =0; i<source.length;i++){
            if (i<k){
              tmparray[i] = source[source.length+i-k];
              continue;
            }
            tmparray[i] = source[i-k];
        }
        return tmparray;
    }


    // This will rotate the array in left by k step without creating a new array
    public static void rotateLeft_inside(int [] source, int k){           
        for(int i =source.length-k; i<source.length; i++ ){
            int temp = source[i];
            source[i] = source[i-(source.length-k)];
            source[i-(source.length-k)] = temp;
        }
        for (int i =0; i<source.length-2*k; i++){
            int temp = source[i];
            source[i] = source[i+k];
            source[i+k] = temp;
        }
    }


    // This will rotate the array in left by k step with creating a new array
    public static int [] rotateLeft_outside(int [] source, int k){       
        int dest[] = new int[source.length];
        int j =0;
        for(int i=k;i<source.length;i++,j++){
          dest[j] = source[i];
        }
        for (int i =0;j<source.length;i++,j++){
          dest[j] = source[i];
        }
        return dest;
      }


   /** @return true if insertion is successful; @return false otherwise
    * @param arr the reference to the linear array
    * @param size the number of elements that exists in the array. size<=arr.length
    * @param elem the element that is to be inserted
    * @param index the index in which the element is required to be inserted
    * if insertion is not successful due to lack space, print "No space Left"
    * if given index is invalid, print "Invalid Index"
    * if insertion is successful, print the 'Number of elements after insertion' is completed
    */
    public static boolean insert(int [] arr, int size, int elem, int index){
        int space = 0;
        if(index>=arr.length || index<0){
            System.out.println("Invalid Index");
            return false;
        }
    
        for(int i = 0;i<arr.length;i++){
            if (arr[i]==0){
                space++;
            }
        }
    
        if(space==0){
            System.out.println("No space Left");
            return false;
        }
        int tmp = arr[index];
        for (int i = index+1;i<arr.length;i++){
            int tmp2 = arr[i];
            arr[i] = tmp;
            tmp = tmp2;
        }
    
        arr[index] = elem;
    
        System.out.println("Number of elements after insertion: "+(size+1));
        return true;  
      }
      

      /** 
       * removes all the occurences of the given element
       * @param arr the reference to the linear array
       * @param size the number of elements that exists in the array. size<=arr.length
       * @param elem the element to be removed
       * @return true if removal is successful; return false otherwise
       * if removal is successful, print the 'Number of elements after removal' is completed
       */  
      public static boolean removeAll(int [] arr, int size, int elem){  
        boolean check = false;
        int rem = size;
        for (int i =0; i<size-1;i++){
          if(arr[i] == elem || arr[i]==0){
            check =true;
            if (arr[i+1]==elem){
              rem--;
              arr[i+1] = 0;
            }
            if (arr[i] == elem){
              rem--;
            }
            arr[i] = arr[i+1];
            arr[i+1] = 0;
    
          }
        }
    
        if(check){
          System.out.println("Number of elements after removal is completed: "+rem);
          return true;
        }
    
        return false;
    }
    
}