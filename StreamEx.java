import java.util.Arrays;
import java.util.List;

public class StreamEx {

    public static void main(String [] args){
        List<Integer> l = Arrays.asList(1,4,5,7,8,10,12,31,146,754,443,4265,2442561);
        
        StringBuilder s = new StringBuilder();
        l.forEach((i) -> {
            if(i % 2 == 0) {
                s.append("e"+i.toString()+",");
            } else {
                s.append("o"+i.toString()+",");
            }
        });
        System.out.println(s.toString());

    }
}