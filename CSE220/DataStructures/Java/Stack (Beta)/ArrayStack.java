public class ArrayStack implements Stack {
    Object [] a;
    int size;
    public ArrayStack(){
        a = new Object[100];
        size = 0;
    }

    public void push (Object e){
        if (size == a.length){
            System.out.println("Stack over flow!");
            return;
        }
        a[size] =e;
        size++;
    }

    public Object peek(){
        if(size == 0){
            System.out.println("Stack under flow!");
            return null;
        }
        Object val = a[size-1];
        return val;
    }

    public Object pop(){
        if(size == 0){
            System.out.println("Stack under flow!");
            return null;
        }
        Object val = a[size-1];
        a[size-1] = null;
        size--;
        return val;
    }

    public String toString(){
        String str="";
        for(int i =0; i<size-1;i++){
            str+=a[i].toString().charAt(0)+" ";
        }
        str+=a[size-1].toString().charAt(0);
        return str;
    }


}