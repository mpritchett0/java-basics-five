import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RightDigit {

    public static List<Integer> operation(List<Integer> list){
        return list.stream().map(i -> i % 10).collect(Collectors.toList());
    }
    
    public static void main(String [] args){

        List<Integer> l = Arrays.asList(123,107,24,5,14,526);

        System.out.println(operation(l));
    }
}
