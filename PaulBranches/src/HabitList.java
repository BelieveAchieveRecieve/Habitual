import java.util.Scanner;

public class HabitList {

    public void generateNewList(HabitFactory maker) {

        boolean flag = false;
        while (flag==false) {
            Scanner userInput = HabitualUtilities.scanner();
            if (userInput.equals("end")){
                flag = true;
            } else {
                maker.generateHabit(userInput.toString());
            }
        }

    }
}
