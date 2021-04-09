import java.util.Scanner;

public class Day11_2DArrays {
    public static int findHourglassSum(int startI, int startJ, int[][] wholeArray){
        int sumCount = (wholeArray[startI][startJ] + wholeArray[startI][startJ+1] + wholeArray[startI][startJ+2]); //top row of the hourglass
        sumCount += wholeArray[startI+1][startJ+1]; //middle row of the hourglass
        sumCount += wholeArray[startI+2][startJ] + wholeArray[startI+2][startJ+1] + wholeArray[startI+2][startJ+2]; //bottom row of the hourglass
        return sumCount;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //interpreting the inputted array
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        //finding the largest sum from the hourglass shapes
        int maxHourglassSum = findHourglassSum(0, 0, arr);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(findHourglassSum(i, j, arr) > maxHourglassSum) {
                    maxHourglassSum = findHourglassSum(i, j, arr);
                }
            }
        }

        System.out.println(maxHourglassSum);

        scanner.close();
    }
}
