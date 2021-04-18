import java.util.Scanner;

public class Day20_Sorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        int numOfSwaps = 0;
        int thisRoundSwaps = 0;
        while(true){
            for (int i = 0; i < n - 1; i++){
                if (a[i] > a[i+1]) {
                    int tmp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = tmp;
                    thisRoundSwaps++;
                }
            }
            if(thisRoundSwaps == 0){
                break;
            }else{
                numOfSwaps += thisRoundSwaps;
                thisRoundSwaps = 0;
            }
        }
        System.out.println("Array is sorted in "+numOfSwaps+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[n-1]);
    }
}
