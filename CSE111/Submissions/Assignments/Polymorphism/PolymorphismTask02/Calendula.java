class Calendula extends MedicinalPlants {
  String power = "MedicinalPlants";
  public void method1() {
    System.out.println("Calendula m1");
  }
  public void method4() {
    System.out.println("Calendula m4");
    method1();
  }
  public String toString(){ 
    method2();
    return "Calendula is parent class of "+ power;
  }
}
