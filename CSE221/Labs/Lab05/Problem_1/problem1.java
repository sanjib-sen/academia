import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;

public class problem1 {
    public static void main(String[] args) throws Exception {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        int capacity = sc.nextInt();
        sc.nextLine();
        int count = Integer.valueOf(sc.nextLine().split(" ")[0]);
        System.out.println(capacity + " " + count);
        String players[] = new String[count];
        int price[] = new int[count];
        int rating[] = new int[count];
        int i = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            players[i] = line.split(",")[0];
            price[i] = Integer.valueOf(line.split(",")[1].split(" ")[1]);
            rating[i] = Integer.valueOf(line.split(",")[2].split(" ")[1]);
            i++;
        }
        knapsack();
    }
}
