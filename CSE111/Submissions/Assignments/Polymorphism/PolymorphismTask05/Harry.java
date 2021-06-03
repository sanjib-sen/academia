class Harry extends James {
    String power = "Harry Potter";
    public void method1() {
        System.out.println("Harry m1");
    }
    public void method2() {     
        System.out.println("Harry m2");
    }
    public void method3() {
        System.out.println("Harry m3");
        method1();
    }
    public String toString(){ 
        return "The successor of James Potter is "+ power;
    }
}
