import java.time.LocalDate;

public class dayOfYear {

    public static int dayYear(String date) {
        return LocalDate.parse(date).getDayOfYear();
    }

    public static void main(String[] args) {

        String date = "2019-01-09";
        int dayNum = dayYear(date);

        System.out.println("Date: " + date);
        System.out.println("Day of the year: " + dayNum);
    }
}
