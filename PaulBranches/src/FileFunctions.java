import java.io.*;
import java.util.Scanner;

public class FileFunctions {

    //This is where the saved file exists
    public static File file = new File("resources/com/achievebelieverecieve/SaveData");

    //this function will validate your save file, to make sure one is in place
    public static void saveFileCreation() throws IOException {

        BufferedWriter writer = HabitualUtilities.writer(file);

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null)
                    writer.close();
            } catch (Exception ex) {
                System.out.println("Error in closing BufferedWriter" + ex);
            }
        }
    }

    //This function allows you to add items to the save file
    public static void addLists(String lists) throws IOException {

        BufferedWriter writer = HabitualUtilities.writerappender(file);
        writer.append(" ");
        writer.append(lists);
        writer.close();
    }


    //this function will clear out the save file
    public static void clearSave() {
        BufferedWriter writer;
        try {
            writer = HabitualUtilities.writer(file);
            writer.write("No saves");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //this function will read whatever is stored in your save file
    public static void readLists(File HabitSavedTxt) throws IOException {
            Scanner scan = HabitualUtilities.scanner(HabitSavedTxt);

            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
                return;
            }
        }

    }


