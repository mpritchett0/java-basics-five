import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lambdas {

    public static int sortByE(String s1, String s2){
        if (s1.contains("e") && s2.contains("e")){
            return 0;
        } else if (s1.contains("e")){
            // if s1 contains e, it must come before.
            return -1;
        } else if (s2.contains("e")){
            // if s2 contains e, s1 must come after s2.
            return 1;
        } else{
            // if neither contain e, they're the same.
            return 0;
        }
    }

    public static void main(String [] args) {

        List<String> list = Arrays.asList("enemy","mail","fetch","walk","granted","spaghetti and meatballs");


        // Sorted by length least to greatest.
        System.out.println("Sorted by least to greatest.");
        Collections.sort(list, (s1, s2) -> (s1.length() - s2.length()));
        for(String s : list){
            System.out.println(s);
        }

        // Sorted by length greatest to least.
        System.out.println("Sorted by greatest to least.");
        Collections.sort(list, (s1, s2) -> (s2.length() - s1.length()));
        for(String s : list){
            System.out.println(s);
        }

        System.out.println("Sorted alphabetically by first character.");
        Collections.sort(list, (s1, s2) -> (s1.charAt(0) - s2.charAt(0)));
        for(String s : list){
            System.out.println(s);
        }

        System.out.println("Sorted by strings that contain 'e'.");
        Collections.sort(list, (s1, s2) -> {
            // if both contain e, they're the same.
            if (s1.contains("e") && s2.contains("e")){
                return 0;
            } else if (s1.contains("e")){
                // if s1 contains e, it must come before.
                return -1;
            } else if (s2.contains("e")){
                // if s2 contains e, s1 must come after s2.
                return 1;
            } else{
                // if neither contain e, they're the same.
                return 0;
            }
        });
        for(String s : list){
            System.out.println(s);
        }

        System.out.println("Sorted by strings that contain 'e' redux.");
        Collections.sort(list, (s1, s2) -> sortByE(s1,s2));
        for(String s : list){
            System.out.println(s);
        }


    }
}