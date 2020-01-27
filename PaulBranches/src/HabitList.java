import java.util.Scanner;

public class HabitList {

    public void generateNewList(HabitFactory maker) {

        boolean flag = false;
        while (flag==false) {
            Scanner readLine = new Scanner(System.in);
            String userInput = readLine.nextLine();
            if (userInput.equals("end")){
                flag = true;
            } else {
                maker.generateHabit(userInput);
            }
        }

    }
}
