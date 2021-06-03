class Echinacea extends MedicinalPlants {
  String power = "Important";
  public void method2() {
    super.method1();
    System.out.println("Echinacea m1");
    super.method2();
    method3();
  }
  public void method3() {
    System.out.println("Echinacea m2");
    System.out.println(this);
  }}
