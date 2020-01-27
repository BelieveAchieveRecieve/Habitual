import java.util.ArrayList;

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


}
