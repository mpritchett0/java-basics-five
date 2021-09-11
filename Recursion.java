import java.util.Arrays;

public class Recursion {

    public static boolean groupSumClump(int s, int a[], int e) {
        if(s == e){
            return true;
        }
        if(a.length == 1){
            if(s+a[0] == e){
                return true;
            } else{
                return false;
            }
        }
        if(a.length == 0 && s!=e){
            return false;
        }

        
        int value = a[0];
        int index = 1;
        int sum = value;
        while(value == a[index]){
            sum+=value;
            index++;
        }
        int numTimes = sum/value;
        int b[] = Arrays.copyOfRange(a, numTimes, a.length);

        return (groupSumClump(s+sum,b,e) || groupSumClump(s, b, e)); 

    }
    public static void main(String [] args) {

        int ar[] = {2, 4, 8};
        int arr[] = {1, 2, 4, 8, 1};
        int arrr[] = {2, 4, 4, 8};

        System.out.println(groupSumClump(0, ar, 10));
        System.out.println(groupSumClump(0, arr, 14));
        System.out.println(groupSumClump(0, arrr, 14));
    }
}
