public class MainBA {
    public static void main(String[] args) {
        BankAccount acc1=new BankAccount();
        BankAccount acc2=new BankAccount();
        BankAccount acc3=new BankAccount();
        acc1.setName("Zahid");
        acc1.setAccountID("182333");
        acc1.setAddress("Dhaka");
        acc1.setBalance(544.56);
        acc2.setName("Abir");
        acc2.setAccountID("1233");
        acc2.setAddress("CTG");
        acc2.setBalance(876.45);
        acc3.setName("Soumya");
        acc3.setAccountID("2479");
        acc3.setAddress("Barishal");
        acc3.setBalance(231.66);
        acc1.addInterest();
        acc3.addInterest();

        System.out.println(acc1.getName());
        System.out.println(acc1.getAddress());
        System.out.println(acc1.getAccountID());
        System.out.println(acc1.getBalance());
        System.out.println(acc2.getName());
        System.out.println(acc2.getAddress());
        System.out.println(acc2.getAccountID());
        System.out.println(acc2.getBalance());
        System.out.println(acc3.getName());
        System.out.println(acc3.getAddress());
        System.out.println(acc3.getAccountID());
        System.out.println(acc3.getBalance());
    }
}
