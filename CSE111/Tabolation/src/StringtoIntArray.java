import static java.lang.Integer.parseInt;
 
/*
Methods Used:
        get.split(",") = Differentiate Comma separated values.
        Integer.parseInt(String) =  Get integer values from a String.
        Integer.toString (int Value, Base) = Convert base of an integer value.
 
Flow:
        1. Get Comma separated input from user.
        2. Differentiated the Comma separated values.
        3. Convert the Values to integer. Note the Largest number.
        4. Convert the integers to Base 2 (Binary) format.
        5. Get the bit of the largest number.
        6. Fill up all the String values of Binary format with zeros to mach the bit count
            with the largest number.
        7. Return the values.
*/
public class StringtoIntArray {
    private static int maxbit,one;
    private static String actualbinary[];
    public static String [] strbin (String get) {
        String splittedStr[] = get.split(",");      
        int intOfStr[] = new int[splittedStr.length];
        for (int i = 0; i < intOfStr.length; i++) {
            intOfStr[i] = Integer.parseInt(splittedStr[i]);                     //3a
        }
        String bin[] = new String[intOfStr.length];
        actualbinary= new String[intOfStr.length];
        for (int i=0; i<bin.length;i++){
            bin[i]=Integer.toString(intOfStr[i],2);                       //4
            }
            maxbit=maxbin(intOfStr);                                            //3b
            actualbinary=binary(bin,maxbit);
        return actualbinary;
    }
 
    public static String[] getActualbinary(String get) {
        return actualbinary;
    }
 
    private static String[] binary(String binr[], int mb){
        String newzero[]=new String [binr.length];
        for (int i=0;i<binr.length;i++){                                        //6
            String zero="";
            if(mb>binr[i].length()) {
                for (int j = 1; j <= mb - (binr[i].length()); j++) {
                    zero += "0";
                }
            }
            newzero[i]=zero+binr[i];
        }
        return newzero;
    }
 
    private static int maxbin (int [] a){
        int max=a[0];
        for (int i=1;i<a.length;i++){
            if (a[i]>max){
                max=a[i];
            }
        }
        int maxbyt=Integer.toString(max,2).length();  
        return maxbyt;                                                            //5
    }
 
   / private static int [][] onecount (String a[]{
            int b [][]=new int [1][a.length];
            for (int i = 0; i < a.length; i++) {
            b[0][i] = Integer.parseInt(a[i]);
        }
 
    }

 
}