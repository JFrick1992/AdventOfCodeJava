package DayThree;
import utils.ReadFile;
import java.util.ArrayList;
public class ProblemTwo {
    public static final String FILE_NAME = "input3.txt";
    private ArrayList<String> readings;
    public void run() {
        this.readings = ReadFile.getFileAsStringList(FILE_NAME);
        ArrayList<String> popular = new ArrayList<String>();
        ArrayList<String> unpopular = new ArrayList<String>();
        String pop = "";
        String un = "";
        int count = 0;
        for(String reading : this.readings) {
            if(reading.charAt(0) == '0') count--;
            else count++;
        }
        if(count < 0) {
            pop = "0";
            un = "1";
        }else {
            pop = "1";
            un = "0";
        }
        for(String reading : readings) {
            if(reading.charAt(0) == pop.charAt(0)) popular.add(reading);
        }
        for(int i = 1; i < this.readings.get(0).length(); i++) {
            if(popular.size() == 1) break;
            ArrayList<String> temp = new ArrayList<String>();
            count = 0;
            for (String s : popular) {
                String sub = s.substring(0, i + 1);
                if (sub.compareTo(pop + "1") == 0) count++;
                else count--;
            }
            if (count <0) {
                pop += "0";
            } else {
                pop += "1";
            }
            for (String s : popular) {
                String sub = s.substring(0, i + 1);
                if (sub.compareTo(pop) == 0) temp.add(s);
            }
            popular = temp;
        }

        for (String reading : this.readings) {
            if(reading.charAt(0) == un.charAt(0)) unpopular.add(reading);
        }
        for(int i = 1; i < this.readings.get(0).length(); i++) {
            if(unpopular.size() == 1) break;
            ArrayList<String> temp = new ArrayList<String>();
            System.out.println("**********");
            for(String b : unpopular) {
                System.out.println(b);
            }
            System.out.println("**********");
            count = 0;
            for (String s : unpopular) {
                String sub = s.substring(0, i + 1);
                if (sub.compareTo(un + "1") == 0) count++;
                else count--;
            }
            if (count >= 0) {
                un += "0";
            } else{
                un += "1";
            }
            System.out.println(un);
            for (String s : unpopular) {
                String sub = s.substring(0, i + 1);
                if (sub.compareTo(un) == 0) temp.add(s);
            }
            unpopular = temp;
        }


        int second = Integer.parseInt(unpopular.get(0), 2);
        int first = Integer.parseInt(popular.get(0), 2);
        System.out.println(second);
        System.out.println(first);
        System.out.println(second * first);
    }
}
