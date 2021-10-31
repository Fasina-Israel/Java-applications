package Chapter4;

import java.sql.Time;

public class Time1 {

  // Time2 with overloaded constructors

    private int hour;
    private int minute;
    private int second;

    public Time1(){
        this(0, 0, 0);

        System.out.println("hello");
    }
    public Time1(int hour){
        this(hour,0,0);
    }
    public Time1(int hour, int minute){
        this(hour,minute,0);
    }

    public Time1(int hour, int minute, int second) {
        validation(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    private void validation(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour cannot exceed 23");
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute cannot exceed 59");
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second cannot exceed 59");
    }

    public Time1 (Time1 time){
            this(time.getHour(), time.getMinute(), time.getSecond());
        }

        public int getHour() {
            return hour;
        }

        public void setHour(int hour) {
            this.hour = hour;

            throw new IllegalArgumentException("hour cannot exceed 23");
        }

        public int getMinute() {
            return minute;
        }

        public void setMinute(int minute) {
            throw new IllegalArgumentException("minute cannot exceed 59");
        }

        public int getSecond() {
            return second;
        }

        public void setSecond(int second) {
            throw new IllegalArgumentException("seconds cannot exceed 59");
        }

        public String toUniversalString(){
           return String.format("%02d: %02d: %02d", getHour(),getMinute(),getSecond());
        }
        public String toString() {
           return String.format("%d:%02d:%02d %s",
                 ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                 getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
         }


}
