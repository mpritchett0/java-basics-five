
import java.time.LocalDate;
import java.time.temporal.ChronoField;


public class Mondays {
    
    public static void main(String [] args) {
        LocalDate a = LocalDate.of(2021, 6, 1);

        int l = a.get(ChronoField.DAY_OF_WEEK);
        for(int i = 0; i<=3; i++){
            if(l == 1){
                LocalDate d = LocalDate.of(2021, 6, l+(i*7));
                System.out.println(d);
            } else{
                int b = 9-l;
                LocalDate f = LocalDate.of(2021, 6, b+(i*7));
                System.out.println(f);
            }
        }


    }
}
