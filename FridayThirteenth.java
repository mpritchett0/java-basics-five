import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.ChronoField;

public class FridayThirteenth {
    public static void main(String [] args){
        MonthDay m = MonthDay.of(9, 13);
        LocalDate e = m.atYear(2021);

        int day = e.get(ChronoField.DAY_OF_WEEK);
        
        if(day == 5){
            System.out.println(e+" is a Friday.");
        } else{
            System.out.println(e+" is not a Friday.");
        }
    }
}
