import java.util.Scanner;
import java.io.*;
import java.lang.*;
import java.io.Writer;
public class Main {

    public static boolean appRunning = true;

    //while appruning is false close files todo


    public static void main(String[] args) throws IOException {

        HabitFactory maker = new HabitFactory();
        HabitList listOne = new HabitList();
        Scanner scan = HabitualUtilities.scanner();

        FileFunctions.saveFileCreation();
        FileFunctions.readLists(FileFunctions.file);

        System.out.println("What habits would you like to track? Enter 'end' to continue.");
        listOne.generateNewList(maker);

        for (Habit item : maker.getHabitList()) {
            FileFunctions.addLists(item.toString());
        }


        for (Habit item : maker.getHabitList()) {
            System.out.println(item);
        }

        System.out.println("would you like to clear the save? y/n");

        String option = scan.nextLine();
        if (option.equals("y")) {
            FileFunctions.clearSave();
            
        }
    }
}

