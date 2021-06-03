import java.util.Scanner;

public class L03V2HARD2 {
    public static void main(String[] args) {
        Scanner sks=new Scanner (System.in);
        String team=sks.nextLine();
        String coach=sks.nextLine();
        int tproduct=1,cproduct=1;
        int nteam[]=L03V2.A1(team);
        for(int i=0;i<nteam.length;i++){
            tproduct*=nteam[i];
        }
        int ncoach[]=L03V2.A1(coach);
        for(int i=0;i<ncoach.length;i++){
            cproduct*=ncoach[i];
        }
        if (tproduct%14<cproduct%14){
            System.out.println("I am happy with my Coach");
        }
        else {
            System.out.println("I am SAD with my Coach");
        }
    }
}
