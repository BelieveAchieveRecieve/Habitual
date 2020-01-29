import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFromFile {

    public void readListsFromFile(File HabitSavedTxt) {
        Scanner sc;
        try {
            sc = new Scanner(HabitSavedTxt);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
