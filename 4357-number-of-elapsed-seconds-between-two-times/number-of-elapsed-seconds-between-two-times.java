import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        LocalTime d1 = LocalTime.parse(startTime);
        LocalTime d2 = LocalTime.parse(endTime);
        return (int) Math.abs(ChronoUnit.SECONDS.between(d1, d2));
    }
}