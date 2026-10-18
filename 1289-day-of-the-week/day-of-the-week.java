import java.time.LocalDate;
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String s = LocalDate.of(year, month, day).getDayOfWeek().toString();
        return s.charAt(0) + s.substring(1).toLowerCase();
    }
}