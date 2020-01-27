import java.util.ArrayList;

public class HabitFactory {

    private ArrayList<Habit> habitList = new ArrayList<>();


    public HabitFactory() {

    }

    public void generateHabit(String habitName) {

        Habit habit = new Habit(habitName);
        habitList.add(habit);

    }

    public ArrayList<Habit> getHabitList() {
        return habitList;
    }
}
