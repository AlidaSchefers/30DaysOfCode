package Day6;

import java.util.Scanner;

public class ReviewLoop {
    static public void treatAndPrintAStr(String wordInput) {
        char[] myCharArray = wordInput.toCharArray();
        for(int i=0; i < wordInput.length(); i+=2) {
            System.out.print(myCharArray[i]);
        }
        System.out.print(" ");
        for(int i=1; i < wordInput.length(); i+=2) {
            System.out.print(myCharArray[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte testCasesNum = scanner.nextByte();
        String[] inputArr = new String[testCasesNum];
        scanner.nextLine();
        for (byte i = 0; i < testCasesNum; i++) {
            inputArr[i] = scanner.nextLine();
        }
        for (byte i = 0; i < testCasesNum; i++) {
            treatAndPrintAStr(inputArr[i]);
        }
        System.out.println();
    }
}
