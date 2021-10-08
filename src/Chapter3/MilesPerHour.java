package Chapter3;

public class MilesPerHour {
    public static void main(String[] args) {
        toMilesPerHour(77);

    }


    public static long toMilesPerHour(double kilometerPerHour) {

        if (kilometerPerHour < 0) {
            return -1;
        } else {
            return Math.round(kilometerPerHour / 1.609);
        }
    }
}
