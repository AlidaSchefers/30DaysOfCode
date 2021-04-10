import java.util.Scanner;

class Difference {
    private int[] elements;
    public int maximumDifference;
    Difference(int[] elements) {
        this.elements = elements;
    }
    int computeDifference() {
        maximumDifference = 0;
        for (int i = 0; i < elements.length; i++) {
            for(int j = elements.length-1; j > i; j--) {
                if(Math.abs(elements[i]-elements[j]) > maximumDifference) {
                    maximumDifference = Math.abs(elements[i]-elements[j]);
                }
            }
        }
        return maximumDifference;
    }
}

public class Day14_Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
