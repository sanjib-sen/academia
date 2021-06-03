import java.util.Scanner;
public class Task19{
  public static void main (String []args){
   Scanner sks=new Scanner (System.in);
   int a[]=new int [10];
   int odds=0,temp, even;
   for (int i=0;i<a.length;i++){
    a[i]=sks.nextInt();
    if (a[i]%2!=0){
     odds+=1;
    }
   }
   even=10-odds;
   int odd[]=new int [odds];
   int ev[]=new int [even];
   for ( int i=0,p=0, r=0;i<a.length;i++){
     if (a[i]%2!=0){
       odd[p]=a[i];
       p++;
     }
     else if (a[i]%2==0){
       ev[r]=a[i];
       r++;
     }
   }  
   if (a[0]%2!=0){
   for(int b=1;b<=2;b++){      
   for(int d=0;d<odd.length-1;d++){
     for (int dd=0;dd<odd.length-1;dd++){
       if (odd[dd]>odd[dd+1]){
        temp=odd[dd];
        odd[dd]=odd[dd+1];
        odd [dd+1]=temp;
       }
     }
   }
   for(int m=0;m<odd.length;m++){
   System.out.print(odd[m]+" ");
   }
   odd=ev;
   }
   }
   else {
      for(int b=1;b<=2;b++){      
   for(int d=0;d<ev.length-1;d++){
     for (int dd=0;dd<ev.length-1;dd++){
       if (ev[dd]>ev[dd+1]){
        temp=ev[dd];
        ev[dd]=ev[dd+1];
       ev[dd+1]=temp;
       }
     }
   }
   for(int m=0;m<ev.length;m++){
   System.out.print(ev[m]+" ");
   }
   ev=odd;
   }
   }
   System.out.println();
  }
}