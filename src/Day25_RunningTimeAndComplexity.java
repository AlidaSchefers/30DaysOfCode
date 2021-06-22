import java.util.*;

public class Day25_RunningTimeAndComplexity {
    static boolean isPrime(int testNum){
        if(testNum == 1){
            return false;
        }
        for(int curNum = (int)Math.sqrt(testNum); curNum > 1; curNum--){
            // System.out.println(curNum);
            if(testNum % curNum == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();
        for(int i = 1; i <= tests; i++){
            int testNum = scanner.nextInt();
            System.out.println((isPrime(testNum) == true) ? "Prime" : "Not prime");
        }
    }
}
