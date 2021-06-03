class Tree {
  String power = "default";
  public void method1() {
    System.out.println("Tree m1");    
  }
  public void method2() {
    System.out.println("Tree m2");
  }
  public String toString(){ 
    method2();
    return "Tree is  "+ power;
  }
}
