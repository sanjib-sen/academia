public class Teacher {
    private String Name,Dept;
    Course clist[] =new Course[10];; int cn;
    public Teacher (String a,String b){
        Name=a; Dept=b;
    }

    public void addCourse(Course a){
        clist[cn++]=a;
    }
    public void printDetail(){
        System.out.println("==================");
        System.out.println("Name: "+Name);
        System.out.println("Department "+Dept);
        System.out.println("------------------");
        for (int i=0;i<cn;i++){
            System.out.println(clist[i].getCname());
        }
    }
}
   class Course{
    public String cname;
     public Course(String a){
         cname=a;
     }

       public String getCname() {
           return cname;
       }
   }
