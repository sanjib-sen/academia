public class Tester{
  public static void main (String[] args){
  
    Author a1 = new Author():
    Author a2 = new Author("Humayun","Ahmed"):
    Author a3 = new Author("Mario","Puzo"):
      Book b1 = new Book();
      Book b2 = new Book("Deyal",a2,300.0);
      Book b3 = new Book("Badshah Namdar",a2,250.0);
      Book b4 = new Book("Godfather",a3);
      Book b5 = new Book("Omerta",a3,600.0);
      Book b6 = new Book("Joshna o Jononir Golpo",a2,500.0);
      System.out.println("==============");
      System.out.println(b1.detail());
      System.out.println("==============");
      System.out.println(b4.detail());
      System.out.println("==============");
      b4.setPrice(500.0);
      System.out.println(b4.detail());
      System.out.println("==============");
      a2.addBook(b2);
      a2.addBook(b3);
      a3.addBook(b4);
      a3.addBook(b5);
      a2.addBook(b6);
      a2.printBooks();
      System.out.println("**************");
      a3.printBooks();
      
      
      
      
      
  
  
  }

}