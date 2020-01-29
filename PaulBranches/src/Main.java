import java.util.Scanner;
import java.io.*;
import java.lang.*;
import java.io.Writer;


public class Main {

    public static void main(String[] args) throws IOException {


        HabitFactory maker = new HabitFactory();
        HabitList listOne = new HabitList();
        FileFunctions.saveFileCreation(listOne.toString());

        System.out.println("What habits would you like to track? Enter 'end' to continue.");
        listOne.generateNewList(maker);

        for (Habit item : maker.getHabitList()) {
            FileFunctions.addLists(item.toString());
        }


        for (Habit item : maker.getHabitList()) {
            System.out.println(item.getHabitToTrack() + " What day to check off?");
            boolean flag = false;
            while (flag == false) {
                Scanner sr = new Scanner(System.in);
                String day = sr.nextLine();
                switch (day.toLowerCase()) {
                    case "monday":
                        item.setWeekTrackerIndex(true, 0);
                        break;
                    case "tuesday":
                        item.setWeekTrackerIndex(true, 1);
                        break;
                    case "wednesday":
                        item.setWeekTrackerIndex(true, 2);
                        break;
                    case "thursday":
                        item.setWeekTrackerIndex(true, 3);
                        break;
                    case "friday":
                        item.setWeekTrackerIndex(true, 4);
                        break;
                    case "saturday":
                        item.setWeekTrackerIndex(true, 5);
                        break;
                    case "sunday":
                        item.setWeekTrackerIndex(true, 6);
                        break;
                    default:
                        flag = true;
                }
            }
        }

        for (Habit item : maker.getHabitList()) {
            System.out.println(item);
        }

        System.out.println("would you like to clear the save? y/n");
        Scanner e = new Scanner(System.in);
        String option = e.nextLine();
        if (option.equals("y")) {
            FileFunctions.clearSave();
        }
    }
}

