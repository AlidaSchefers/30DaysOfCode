import java.util.Scanner;

public class Day26_NestedLogic {
    public static void main(String[] args) {
        //read input from STDIN
        Scanner scanner = new Scanner(System.in);
        int dayReturned = scanner.nextInt();
        int monthReturned = scanner.nextInt();
        int yearReturned = scanner.nextInt();

        int dayDue = scanner.nextInt();
        int monthDue = scanner.nextInt();
        int yearDue = scanner.nextInt();

        //determine the fine
        int fine;
        if(yearReturned > yearDue){
            fine = 10000;
        }else if(yearReturned == yearDue && monthReturned > monthDue){
            fine = 500 * (monthReturned - monthDue);
        }else if(yearReturned == yearDue && monthReturned == monthDue && dayReturned > dayDue){
            fine = 15 * (dayReturned-dayDue);
        }else{
            fine = 0;
        }

        //print out to STDOUT
        System.out.println(fine);
    }
}
