import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HabitualUtilities {


    public static Scanner scanner() {
        final Scanner scan = new Scanner(System.in);
        return scan;
    }

    public static BufferedWriter writer(File file) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
        return writer;
    }
}

