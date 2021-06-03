/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg111_lab_mid;

/**
 *
 * @author cse1
 */
public class FriendsTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        Sitcom bestShow = new Sitcom("F.r.i.e.n.d.s");
        System.out.println("Do not search for new shows."+bestShow.tagline);
        System.out.println("=====================");
        Friends mon = new Friends("Monica", "Geller");
        bestShow.addCharacter(mon);
        System.out.println(bestShow.whoseThere());
        System.out.println("***********************");
        System.out.println(mon.match("Chandler"));
        mon.talent("loves to cook");
        System.out.println("=====================");
        Friends rach = new Friends("Rachel");
        bestShow.addCharacter(rach);
        System.out.println(bestShow.whoseThere());
        System.out.println("***********************");
        System.out.println(rach.match("Ross"));
        System.out.println("=====================");
        rach.setSurName("Green");
        Friends pheeb = new Friends("Phoebe");
        bestShow.addCharacter(pheeb);
        System.out.println(bestShow.whoseThere());
    }
    
}
