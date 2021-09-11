import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Doubling {

    public static List<Integer> doubler(List<Integer> list) {
        return list.stream().map(i -> i * 2).collect(Collectors.toList());
    }

    public static void main(String [] args) {
        List<Integer> l = Arrays.asList(1,3,6,2,4,10,20,15);
        
        System.out.println(doubler(l));
    }
}
