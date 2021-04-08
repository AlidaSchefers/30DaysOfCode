package Day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryNumbers {
    private static final Scanner scanner = new Scanner(System.in);

    public static List<Integer> convertToBinaryArr(int decimalInt) {
        List<Integer> binaryIntArr = new ArrayList<Integer>();
        while(decimalInt > 0) {
            binaryIntArr.add(decimalInt % 2);
            decimalInt = decimalInt / 2;
        }
        return binaryIntArr;
    }

    public static void main(String[] args) {
        int maxNumOnes = 0;
        int onesCount = 0;
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        List<Integer> binaryIntArr = convertToBinaryArr(n);
        for (int i = 0; i < binaryIntArr.size(); i++) {
            if(binaryIntArr.get(i) == 1) {
                onesCount++;
                if(onesCount > maxNumOnes) {
                    maxNumOnes = onesCount;
                }
            }else{
                onesCount = 0;
            }
        }
        System.out.print(maxNumOnes);
        scanner.close();
    }
}
