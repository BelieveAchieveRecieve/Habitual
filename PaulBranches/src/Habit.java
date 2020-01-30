import java.util.ArrayList;
import java.util.Scanner;

public class Habit {

    private String habitToTrack;
    private ArrayList<Boolean> weekTracker;

    public Habit(String habitToTrack) {
        this.habitToTrack = habitToTrack;
        this.weekTracker = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            this.weekTracker.add(false);
        }
    }

    @Override
    public String toString() {
        return "---------------------------------\n" + "|" + habitToTrack + "|" + "\n" + "|" + weekTracker + "|"+"\n";
    }

    public String getHabitToTrack() {
        return habitToTrack;
    }

    public void setHabitToTrack(String habitToTrack) {
        this.habitToTrack = habitToTrack;
    }

    public Boolean getWeekTrackerIndex(int i) {
        return weekTracker.get(i);
    }

    public void setWeekTrackerIndex(Boolean bool, int i ) {
        this.weekTracker.set(i, bool);
    }


    public ArrayList<Habit> checkDaysOff(){
        for (Habit item : HabitFactory.getHabitList()) {
            System.out.println(item.getHabitToTrack() + " What day to check off?");
            boolean flag = false;
            while (flag == false) {
                Scanner day = HabitualUtilities.scanner();
                switch (day.toString().toLowerCase()) {
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

        return HabitFactory.getHabitList();
    }

}
