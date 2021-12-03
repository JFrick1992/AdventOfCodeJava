package DayTwo;

import utils.ReadFile;

import java.util.ArrayList;

public class ProblemTwo {
    public static final String FILE_NAME = "input2.txt";
    public static final String FORWARD = "forward";
    public static final String DOWN = "down";
    public static final String UP = "up";
    public static void run() {
        System.out.println("2.1 Running Day Two Problem Two ");
        System.out.println("Find Horizontal distance total for each FORWARD number");
        System.out.println("Find Vertical depth total for current AIM times Current forward move");
        System.out.println("When Up command given, reduce aim by that amount.");
        System.out.println("When down command is given, increase aim by that amount.");
        ArrayList<String> movements = ReadFile.getFileAsStringList(FILE_NAME);
        int forward = 0;
        int aim = 0;
        int depth = 0;

        for(String movement : movements) {
            String[] moves = movement.split(" ");
            Integer moveNum = Integer.parseInt(moves[1]);
            switch (moves[0]) {
                case FORWARD:
                    forward += moveNum;
                    depth += moveNum*aim;
                    break;
                case DOWN:
                    aim += moveNum;
                    break;
                case UP:
                    aim -= moveNum;
                    break;
            }
        }
        System.out.println("Forward Total: " + forward);
        System.out.println("Aim Total: " + aim);
        System.out.println("Depth Total: " + depth);
        System.out.println("Multiplication of both: " + (forward * depth));
    }
}
