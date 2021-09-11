import java.time.Instant;
import java.time.ZonedDateTime;

public class ZoneDateTest {
    public static void main(String [] args) {
        Instant i = Instant.now();
        ZonedDateTime z = ZonedDateTime.parse(i.toString());

        System.out.println(z);

        i = Instant.parse(z.toString());

        System.out.println(i);
    }
}
