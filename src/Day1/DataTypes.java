package Day1;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int additionalInt = scan.nextInt();
        double additionalDouble = scan.nextDouble();
        scan.nextLine();
        String additionalString = scan.nextLine();

        System.out.println(i + scan.nextInt());
        System.out.println(d + scan.nextDouble());
        System.out.println(s + scan.nextLine());

        scan.close();
    }
}
