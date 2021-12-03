package DayTwo;
import utils.ReadFile;

import java.util.ArrayList;
import java.util.HashMap;

public class ProblemOne {
    public static final String FILE_NAME = "input2.txt";
    public static final String FORWARD = "forward";
    public static final String DOWN = "down";
    public static final String UP = "up";

    public static void run() {
        System.out.println("2.1 Running Day Two Problem One ");
        System.out.println("Find Horizontal distance total for each FORWARD number");
        System.out.println("Find Vertical depth total for each UP and DOWN number");
        ArrayList<String> movements = ReadFile.getFileAsStringList(FILE_NAME);
        HashMap<String, Integer> moveTotals = new HashMap<String, Integer>();
        moveTotals.put(FORWARD, 0);
        moveTotals.put(DOWN, 0);
        moveTotals.put(UP, 0);
        for(String movement : movements) {
            String[] moves = movement.split(" ");
            Integer curr = moveTotals.get(moves[0]);
            Integer moveNum = Integer.parseInt(moves[1]);
            switch (moves[0]) {
                case FORWARD:
                case DOWN:
                    curr += moveNum;
                    break;
                case UP:
                    curr -= moveNum;
                    break;
            }
            moveTotals.put(moves[0], curr);
        }
        Integer verticalTotals = moveTotals.get(UP) + moveTotals.get(DOWN);
        Integer forwardTotals = moveTotals.get(FORWARD);
        System.out.println("Forward Total: " + forwardTotals);
        System.out.println("Depth Total: " + verticalTotals);
        System.out.println("Multiplication of both: " + (forwardTotals * verticalTotals));

    }
}