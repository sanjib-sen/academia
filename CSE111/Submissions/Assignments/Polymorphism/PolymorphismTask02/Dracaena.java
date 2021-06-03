class Dracaena extends Tree {
  String power = "beautiful";
  public void method1() {
    System.out.println("Dracaena m1");
  }
  public void method2() {     
    System.out.println("Dracaena m2");
  }
  public void method3() {
    System.out.println("Dracaena m3");
    super.method2();
  }
  public String toString(){ 
    return "Dracaena is parent class of "+ power;
  }
}
