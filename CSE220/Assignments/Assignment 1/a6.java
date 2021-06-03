public class a6 {
    public static void main(String [] args){
        int[]array={25000,100000,250000,350000};
        print(array,0);
    }



    public static void print(int[]array,int idx){
        if(idx<array.length){
            double profit=calcProfit(array[idx]);
            System.out.println("Investment: "+array[idx]+"; Profit: "+profit);
            print(array,++idx);
        }
    }

    public static double calcProfit(int investment){
        if(investment<=25000){
            return 0.0;
        }
        if(investment>100000){
            return ((investment-100000)*.08) + calcProfit(100000); 
        }
        return ((investment-25000)*.045);
    }
}
