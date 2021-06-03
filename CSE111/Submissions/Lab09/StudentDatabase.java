public class StudentDatabase{
    Student [] records;
    void printDatabase(){
        int c=0; /* jj*/
        while(c<records.length){ //5
            System.out.println(records[c].toString());
            ++c;
        }
    }
    void sortByName(){
        Student tmp;
        for (int i=0;i<records.length;i++){
            for (int j=1;j<records.length;j++){
                if(records[j-1].name.compareTo(records[j].name)>0){
                    tmp=records[j-1];
                    records[j-1]=records[j];
                    records[j]=tmp;
                }
            }
        }
    }
    void sortByID(){
        int i,j;
        Student tmp;
        i=0;
        while(i<records.length){
            j=1;
            while(j<records.length){// "batman".compareTo("badman")
                if(records[j-1].id.compareTo(records[j].id)>0){
                    tmp=records[j-1];
                    records[j-1]=records[j];
                    records[j]=tmp;
                }
                ++j;
            }
            ++i;
        }
    }
    void sortBySection() {
        Student tmp;
        for (int i = 0; i < records.length; i++) {
            for (int j = 1; j < records.length; j++) {
                if (records[j - 1].section > records[j].section) {
                    tmp = records[j - 1];
                    records[j - 1] = records[j];
                    records[j] = tmp;
                }
            }
        }
    }
    void sortByMark(){
        int i,j;
        Student tmp;
        i=0;
        while(i<records.length){
            j=1;
            while(j<records.length){
                if(records[j-1].mark > records[j].mark){
                    tmp=records[j-1];
                    records[j-1]=records[j];
                    records[j]=tmp;
                }
                ++j;
            }
            ++i;
        }
    }
}
