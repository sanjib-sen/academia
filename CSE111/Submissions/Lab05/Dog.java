public class Dog {
    private String color = "Black";
     public Dog(String a){
         color=a;
     }
     public void changeColor(String a){
         color=a;
     }
     public void bark(){
         System.out.println(color+" dog is barking");
     }
}
