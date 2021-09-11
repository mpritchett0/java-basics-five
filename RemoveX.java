import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveX {
    
    public static List<String> noX(List<String> list){
        return list.stream().map(i -> i.replace("x","")).collect(Collectors.toList());
    }
    public static void main(String [] args) {
        List<String> l = Arrays.asList("axexa","ax","axe","exe","ole","olx","eaw","xxx");
        
        System.out.println(noX(l));
    }
}
