    public static int LCA(Node A){
        int max =0;
        int count=1;
        for(Node a =A; a.next!=null;a=a.next){
            if(a.element == a.next.element){
                count+=1;
            }
            else{
                if (max<count){
                    max = count;
                }
                count = 1;
            }
        }
        return max;
    }