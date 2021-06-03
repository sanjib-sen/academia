class SilkOreo extends DairyMilk {
  String texture = "silky";
  public void method1() {
    super.method1();
    System.out.println("SilkOreo m1");
  }
  public void method3() {
    System.out.println("SilkOreo m2");
    System.out.println(this);
  }
}
