package utils;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class ReadFile {
    private static Scanner readFile(String fileName) {
        try {
            File file = new File("src/Resources/" + fileName);
            return new Scanner(file);

        } catch (FileNotFoundException ex) {
            System.out.println("An error occurred trying to get the file.");
            ex.printStackTrace();
        }
        return null;
    }
    public static ArrayList<String> getFileAsStringList(String fileName) {
        Scanner scanner = readFile(fileName);
        ArrayList<String> data = new ArrayList<String>();
        while (scanner.hasNextLine()) {
            data.add(scanner.nextLine());
        }
        return data;
    }
    public static ArrayList<Integer> getFileAsIntegerList(String fileName) {
        Scanner scanner = readFile(fileName);
        ArrayList<Integer> data = new ArrayList<Integer>();
        while (scanner.hasNextLine()) {
            data.add(Integer.parseInt(scanner.nextLine()));
        }
        return data;
    }
}
