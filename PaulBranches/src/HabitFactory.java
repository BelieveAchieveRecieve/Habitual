import java.util.ArrayList;

public class HabitFactory {

    private static ArrayList<Habit> habitList = new ArrayList<>();


    public HabitFactory() {

    }

    public void generateHabit(String habitName) {

        Habit habit = new Habit(habitName);
        habitList.add(habit);

    }

    public static ArrayList<Habit> getHabitList() {
        return habitList;
    }
}
