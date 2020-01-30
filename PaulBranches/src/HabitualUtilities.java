import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HabitualUtilities {


    public static Scanner scanner() {
        final Scanner scan = new Scanner(System.in);
        return scan;
    }

    public static BufferedWriter writer() throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter(FileFunctions.file, true));
        return writer;
    }
}

