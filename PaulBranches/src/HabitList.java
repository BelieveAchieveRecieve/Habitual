import java.util.Scanner;

public class HabitList {

    public void generateNewList(HabitFactory maker) {

        boolean flag = false;
        while (flag==false) {
            Scanner scan = HabitualUtilities.scanner();
            String userInput = scan.nextLine();
            if (userInput.equals("end")){
                flag = true;
            } else {
                maker.generateHabit(userInput);
            }
        }

    }
}
