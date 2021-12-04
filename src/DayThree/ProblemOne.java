package DayThree;
import utils.ReadFile;

import java.util.ArrayList;

public class ProblemOne {
    public static final String FILE_NAME = "input3.txt";
    public static void run() {
        ArrayList<String> readings = ReadFile.getFileAsStringList(FILE_NAME);
        int[] counts = new int[readings.get(0).length()];
        for(int i = 0; i < readings.size(); i++) {
            String reading = readings.get(i);
            for(int j = 0; j < reading.length() && j < counts.length; j++) {
                if(reading.charAt(j) == '0') {
                    counts[j] -= 1;
                } else {
                    counts[j] +=1;
                }
            }
        }
        String gammaString = "";
        String epsilonString = "";
        for(int i = 0; i < counts.length; i++) {
            if(counts[i] < 0) {
                gammaString += "1";
                epsilonString += "0";
            } else {
                gammaString += "0";
                epsilonString += "1";
            }
        }
        System.out.println(gammaString);
        int gamma = Integer.parseInt(gammaString, 2);
        int epsilon = Integer.parseInt(epsilonString, 2);
        int power = gamma * epsilon;
        System.out.println("Power: " + power);
    }
}
