import java.util.Scanner;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}

class Student extends Person{
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    private int[] scores;
    Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);
        // super(lastName);
        // super(id);
        this.scores = scores;
    }
    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here

    public String calculate() {
        int sumOfGrades = 0;
        for (int i = 0; i < scores.length; i++) {
            sumOfGrades += scores[i];
        }
        int averageGrade = sumOfGrades / scores.length;
        if(averageGrade >= 90){
            return "O";
        }else if(averageGrade < 90 && averageGrade >= 80){
            return "E";
        }else if(averageGrade < 80 && averageGrade >= 70){
            return "A";
        }else if(averageGrade < 70 && averageGrade >= 55){
            return "P";
        }else if(averageGrade < 55 && averageGrade >= 40){
            return "D";
        }else{
            return "T";
        }
    }

}

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
