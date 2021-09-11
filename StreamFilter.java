import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    
    public static void main(String [] args) {

        List<String> list = Arrays.asList("all","are","axe","eax","eel","foo","enemy","mail","fetch","walk","granted","spaghetti and meatballs");

        List<String> flist = list.stream().filter(i -> {
            if (i.length() == 3 && i.charAt(0) == 'a') {
                return true;
            } else{
                return false;
            }
        }).collect(Collectors.toList());

        for(String s: flist) {
            System.out.println(s);
        }

    }
}
