import java.util.Scanner;
public class sanjibtask4
{public static void main (String []args)
  {Scanner sanju=new Scanner (System.in);
   System.out.println("Ekta number diye dhonno hon");
  double prothom=sanju.nextDouble();
   System.out.println("Arekta number dieo dhonno hon");
   double ditio=sanju.nextDouble();
   System.out.println("Jogfol holo= "+ (prothom+ditio) );
    if (prothom>ditio)
   {
   System.out.println("Difference holo= " + (prothom-ditio) );
   }
   else 
   {
     System.out.println("Difference holo= "+ (ditio-prothom) ); 
   }
   System.out.println("Product hocche= " + (prothom*ditio) );
}
}