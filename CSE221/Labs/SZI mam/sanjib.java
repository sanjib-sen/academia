import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
import java.io.File;

/*Step By Step Process (Please Uncomment all the Print methods to see the processes in output)
* 1. Convert ChessBoard Positions to Actual Numbers (A1 = 11, B2= 22, H8 = 88)
* 2. Knights Can Move 8,12,19,21,-8,-12,-19,-21 Steps in the chess corresponding to actual numbers.
*       Wrote a method to Figure Out The Knight's probable valid Moves given it's current Position.
* 3. Used BFS Algorithm to explore the probable moves and reach the destination in minimum number of moves.
* 4. Added 0 to the queue when the BFS finish it's exploring all of the moves from current position.
* 5. Counting 0, we can figure out the number of levels the BFS algorithm passed. In this case, Levels = Moves.
* */

public class sanjib {
    public static void main(String[] args) throws Exception {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String[] sourceAndDest = sc.nextLine().split(" ");
            landingZone(sourceAndDest);
        }
    }

    private static void landingZone(String[] sourceAndDest) {
        int source = ((int) sourceAndDest[0].charAt(0) - 96) * 10
                + (Integer.parseInt(String.valueOf(sourceAndDest[0].charAt(1))));
        int dest = ((int) sourceAndDest[1].charAt(0) - 96) * 10
                + (Integer.parseInt(String.valueOf(sourceAndDest[1].charAt(1))));
        // System.out.println("\nFirst Position: "+source+" Destination "+dest);
        int moves = doBFS(source, dest);
        System.out.println(
                "To get from " + sourceAndDest[0] + " to " + sourceAndDest[1] + " takes " + moves + " knight moves.");
    }

    private static int doBFS(int source, int dest) {
        if (source == dest)
            return 0;
        ArrayList<ArrayList<Integer>> ar = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 89; i++) {
            ar.add(new ArrayList<Integer>());
        }
        Queue steps = new LinkedList();
        steps.add(source);
        int level = 1;
        int temp = 0;
        int savePos[] = new int[89];
        while (!steps.isEmpty()) {
            if (savePos[(int) steps.peek()] != 0) {
                // System.out.println("\nPosition "+steps.peek()+" already visited, Making
                // Another Move...");
                steps.remove();
                continue;
            }
            // System.out.println("\nKnight Moves to "+steps.peek()+" .");
            if ((int) steps.peek() == 0) {
                level++;
                // System.out.println("\nLevel Upgraded");
                steps.remove();
                steps.add(0);
            }
            if ((int) steps.peek() == dest) {
                break;
            }
            savePos[(int) steps.peek()] = 1;
            createNextSteps(ar, steps, (int) steps.remove());
            if (temp == 0) {
                steps.add(0);
                temp = 1;
            }
        }
        return level;
    }

    private static boolean validPos(int src, int pos, boolean add) {
        if (add) {
            if ((src + pos) % 10 == 0 || (src + pos) > 88 || (src + pos) % 10 == 9)
                return false;
        }
        if (!add) {
            if ((src - pos) % 10 == 0 || (src - pos) < 11 || (src - pos) % 10 == 9)
                return false;
        }
        return true;
    }

    private static void createNextSteps(ArrayList<ArrayList<Integer>> ar, Queue steps, int source) {
        // System.out.println("Possible Moves for Position "+source+" : ");
        if (validPos(source, 8, true)) {
            ar.get(source).add(source + 8);
            ar.get(source + 8).add(source);
            steps.add(source + 8);
            // System.out.print(source+8+" ");
        }
        if (validPos(source, 19, true)) {
            ar.get(source).add(source + 19);
            ar.get(source + 19).add(source);
            steps.add(source + 19);
            // System.out.print(source+19+" ");
        }
        if (validPos(source, 21, true)) {
            ar.get(source).add(source + 21);
            ar.get(source + 21).add(source);
            steps.add(source + 21);
            // System.out.print(source+21+" ");
        }
        if (validPos(source, 12, true)) {
            ar.get(source).add(source + 12);
            ar.get(source + 12).add(source);
            steps.add(source + 12);
            // System.out.print(source+12+" ");
        }
        if (validPos(source, 8, false)) {
            ar.get(source).add(source - 8);
            ar.get(source - 8).add(source);
            steps.add(source - 8);
            // System.out.print(source-8+" ");
        }
        if (validPos(source, 19, false)) {
            ar.get(source).add(source - 19);
            ar.get(source - 19).add(source);
            steps.add(source - 19);
            // System.out.print(source-19+" ");
        }
        if (validPos(source, 21, false)) {
            ar.get(source).add(source - 21);
            ar.get(source - 21).add(source);
            steps.add(source - 21);
            // System.out.print(source-21+" ");
        }
        if (validPos(source, 12, false)) {
            ar.get(source).add(source - 12);
            ar.get(source - 12).add(source);
            steps.add(source - 12);
            // System.out.print(source-12+" ");
        }

    }
}
