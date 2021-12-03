package DayOne;

import utils.ReadFile;
import java.util.ArrayList;

public class ProblemTwo {
    public static final String FILE_NAME = "input.txt";
    public static void runProblemTwo() {
        int count = 0;
        ArrayList<Integer> depths = ReadFile.getFileAsIntegerList(ProblemOne.FILE_NAME);
        System.out.println("1.2 is to determine how many times the sub's depth INCREASED over window SIZE = 3");
        System.out.println("Running 1.2:");
        for (int i = 0; i < depths.size() -3; i++) {

            if((depths.get(i) + depths.get(i + 1) + depths.get(i + 2)) < (depths.get(i+1) + depths.get(i + 2) + depths.get(i + 3))) {
                count++;
            }
        }
        System.out.println("The total number of INCREASES were: " + count);
    }
}
