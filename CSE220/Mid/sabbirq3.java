public class sabbirq3{
  public static void main(String []args){
    int [] circularArr = { 10,20,30,40,50,60,0,0,0,0,0 };
    circularArr = reverse (circularArr,0,11);
    for (int i : circularArr) {
      System.out.println(i);
    }

  }

  public static int [] reverse(int [] source, int start, int size){
    int startInd = start;
    int lastValInd = (start + size - 1) % source.length;
    int sourceSize = size;
    for(int i = 0; i < size / 2; i++){
      int temp = source[startInd];
      source[startInd] = source[lastValInd];
      source[lastValInd] = temp;
      startInd = (startInd +1) % source.length;
      sourceSize--;
      lastValInd = (start + sourceSize - 1) % source.length;
    }

    return source;
  }
}
