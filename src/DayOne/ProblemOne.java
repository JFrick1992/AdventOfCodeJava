package DayOne;

import utils.ReadFile;
import java.util.ArrayList;
public class ProblemOne {
    public static final String FILE_NAME = "input.txt";
    public static void run() {
        int count = 0;
        ArrayList<Integer> depths = ReadFile.getFileAsIntegerList(FILE_NAME);
        System.out.println("1.1 is to determine how many times the sub's depth INCREASED");
        System.out.println("Running 1.1:");
        for (int i = 1; i < depths.size(); i++) {
            if(depths.get(i - 1) < depths.get(i)) {
                count++;
            }
        }
        System.out.println("The total number of INCREASES were: " + count);
    }
}
