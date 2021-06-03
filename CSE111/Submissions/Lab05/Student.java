public class Student {
    private String Name; int ID;
    public Student(String a, int b){
        Name=a; ID=b;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }
}
class Printer{
    public void printDetail(Student s){
        System.out.println("Name of the Student: "+s.getName());
        System.out.println("ID of the Student: "+s.getID());
    }
}
