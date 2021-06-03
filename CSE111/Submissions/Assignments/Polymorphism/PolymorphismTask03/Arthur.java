class Arthur extends TommyShelby {
    String power = "Arthur Shelby";
    public void method1() {
        System.out.println("mercenary m1");
    }
    public void method2() {     
        System.out.println("mercenary m2");
    }
    public void method3() {
        System.out.println("mercenary m3");
        method1();
    }
    public String toString(){ 
        return "The elder brother is "+ power;
    }
}
