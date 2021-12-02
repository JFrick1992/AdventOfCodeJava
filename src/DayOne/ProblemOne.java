package DayOne;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class ProblemOne {
    private ArrayList<Integer> depths;

    public ProblemOne(String fileName) {
        try {
            File file = new File("src/Resources/" + fileName);
            Scanner scanner = new Scanner(file);
            depths = new ArrayList<Integer>();
            while(scanner.hasNextLine()) {
                depths.add(Integer.parseInt(scanner.nextLine()));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("An error occurred trying to get the file.");
            ex.printStackTrace();
        }
    }
    public void runProblemOne() {
        int count = 0;
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
