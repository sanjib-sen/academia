class James{
    String power = "James Potter";
    public void method1() {
        method2();
        System.out.println("father m1");    
    }
    public void method2() {
        System.out.println("father m2");
    }
    public String toString(){ 
        method2();
        return "Father is"+ power;
    }
}

