package statementss;

public class Time {
    private int seconds;
    private int minutes;
    private int hours;

    public Time(int hours, int minutes, int seconds) {
        this.seconds = hours;
        this.minutes = minutes;
        this.hours = seconds;
    }

    public int getInMinutes() {
        int hourInMinutes = 60;
        return hours * hourInMinutes + minutes;
    }

    public int getInSeconds() {
        int minuteInSeconds = 60;
        return getInMinutes() * minuteInSeconds + seconds;
    }

    public boolean earlierThan(Time other) {
        int thisTimeInSeconds = this.getInSeconds();
        int otherTimeInSeconds = other.getInSeconds();
        return thisTimeInSeconds < otherTimeInSeconds;
    }

    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}

