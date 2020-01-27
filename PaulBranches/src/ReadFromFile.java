import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFromFile {

    File file = new File("C:\\Users\\GA1\\code\\BeleiveAcheiveRecieve\\Habitual\\PaulBranches\\src\\SaveData");

    public void readListsFromFile() {
        Scanner sc;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
