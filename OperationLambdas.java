import java.util.Scanner;

interface PerformOperation {
    boolean operate(int a);
}

public class OperationLambdas {

    public static boolean check(PerformOperation p, int num){
        return p.operate(num);
    }
    
    public PerformOperation isOdd(){
        PerformOperation p = (a -> {
            if(a % 2 == 0){
                return false;
            }
            else {
                return true;
            }
        });
        return p;
    }

    public PerformOperation isPrime() {
        PerformOperation p =  (a -> {
            for(int i = 2; i< Math.sqrt(a); i++){
                if(a % i == 0){
                    return false;
                }
            }
            return true;

        });
        return p;
    }

    public PerformOperation isPalindrome() {
        PerformOperation p =  (a -> {
            String s = Integer.toString(a);
            StringBuilder st = new StringBuilder();
            st.append(s);
            st.reverse();
            if(s.equals(st.toString())){
                return true;
            } else {
                return false;
            }
        });
        return p;
    }

    public static void main(String [] args){
        OperationLambdas ol = new OperationLambdas();
        PerformOperation op;
        String ans = "";
        boolean ret;
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();

        for(int k = 1; k<=i; k++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            switch(a){
                case 1:
                    op = ol.isOdd();
                    ret = ol.check(op, b);
                    if(ret) ans="ODD";
                    else ans = "EVEN";
                    break;
                case 2:
                    op = ol.isPrime();
                    ret = ol.check(op, b);
                    if(ret) ans="PRIME";
                    else ans = "COMPOSITE";
                    break;
                case 3:
                    op = ol.isPalindrome();
                    ret = ol.check(op, b);
                    if(ret) ans="PALINDROME";
                    else ans = "NOTPALINDROME";
                    break;
            }

            System.out.println(ans);
        }

        
        scan.close();

        


    }
    
}
