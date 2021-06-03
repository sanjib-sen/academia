import java.util.Scanner;
public class SelectionSorting{
  public static void main(String []args){
   Scanner sks=new Scanner (System.in);
   int a[]={1,2,5,4,6,8,7,9,0,3};
   
        //Loop Start//
   for (int s=0;s<a.length-1;s++){  
     int max=a[s];int maxpos=s;
                //Determining Maximum Value//       
     for (int b=s+1;b<a.length;b++){ 
       if (max<a[b]){
        max=a[b];maxpos=b;
     }
    }
          //Swapping Maximum Value with first box//
      int temp=a[s];
      a[s]=max;
      a[maxpos]=temp;
     
   }
   for (int z=0;z<a.length;z++){  
     System.out.print(a[z]+" ");
   }
   System.out.println();
  }
}