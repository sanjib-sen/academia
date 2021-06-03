public class ArrayQueue implements Queue {
        Object [] a;
        int size;
        int start;
        int actlen =0;
        public ArrayQueue(){
            a = new Object[10];
            size = 0;
            start = 0;
        }
    
        public void enqueue (Object e){
            if (size == a.length){
                System.out.println("Queue over flow!");
                return;
            }
            a[(start+size)%a.length] =e;
            size++;
            actlen++;
        }
    
        public Object peek(){
            if(size == 0){
                System.out.println("Queue under flow!");
                return null;
            }
            Object val = a[start];
            return val;
        }
    
        public Object dequeue(){
            if(size == 0){
                System.out.println("Queue under flow!");
                return null;
            }
            Object val = a[start];
            a[start] = null;
            start++;
            if(start==a.length){
                start = 0;
            }
            size--;
            return val;
        }
    
        public String toString(){
            String str="";
            for(int i =start; i<actlen-1;i++){
                str+=a[i].toString().charAt(0)+" ";
            }
            str+=a[actlen-1].toString().charAt(0);
            return str;
        }
}