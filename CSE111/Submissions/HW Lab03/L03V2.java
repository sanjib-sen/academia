public class L03V2 {

    public static int[] A1(String a){
        int ar[]=new int[a.length()];
        for (int i=0;i<a.length();i++){
            ar[i]=((int)a.charAt(i))-64;
        }
        return ar;
    }

    public static String reverse(String a){
        String st="";
        for(int i=a.length()-1;i>=0;i--){
            st+=Character.toString(a.charAt(i));
            }
        return st;
    }

}
