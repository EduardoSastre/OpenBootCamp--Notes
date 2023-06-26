import java.util.Calendar;
import java.util.Scanner;

public class DeleteThis {

    public static String findDay(int month, int day, int year) {

        Calendar calendar = Calendar.getInstance();
        calendar.set( year, month - 1, day);
        int weekDay = calendar.get( Calendar.DAY_OF_WEEK );

        String[] weekDays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

        return weekDays[ weekDay - 1 ];
    }

    public static void main(String[] args) {

        System.out.println( findDay( 8, 5, 2015 ) );

    }

}
