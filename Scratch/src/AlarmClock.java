



public class AlarmClock {
    private int snoozeInterval;
    private int repeat;


    public AlarmClock(int snoozeInterval, int repeat) {
        setSnoozeInterval(snoozeInterval);
        setRepeat(repeat);
    }

    public void setSnoozeInterval(int snoozeInterval) throws IllegalArgumentException {
        if (snoozeInterval > 0) {
            this.snoozeInterval = snoozeInterval;
        } else {
            throw new IllegalArgumentException("ERROR WHAT ARE YOU DOING WITH YOUR LIFE?!??!?!?!?!?!");
        }

    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public int getRepeat(){
        return this.repeat;
    }

    public int getSnoozeInterval() {
        return this.snoozeInterval;
    }

}
