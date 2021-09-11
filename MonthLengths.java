import java.time.MonthDay;
import java.time.Year;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;


public class MonthLengths {
    
    public static void main(String [] args){
        long year = 1999;

        boolean isLeap = Year.isLeap(year);
        long d;

        for(int i = 1; i <= 12; i++){
            MonthDay md = MonthDay.of(i, 1);
            if(i == 2 && !isLeap){
                d = 28;
            } else{
                ValueRange r2 = md.range(ChronoField.DAY_OF_MONTH);
                d = r2.getMaximum();
            }
            System.out.println("Month "+i+" has "+d+" days in the year "+year);
        }

    }
}
