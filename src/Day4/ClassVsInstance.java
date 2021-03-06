package Day4;

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class ClassVsInstance {
    public class Person {
        private int age;

        public Person(int initialAge) {
            if(initialAge > 0){
                this.age = initialAge;
            }else{
                this.age = 0;
                System.out.println("Age is not valid, setting age to 0.");
            }
        }

        public void amIOld() {
            if(age < 13){
                System.out.println("You are young.");
            }else if(age >= 13 && age < 18){
                System.out.println("You are a teenager.");
            }else{
                System.out.println("You are old.");
            }
        }

        public void yearPasses() {
            age += 1;
        }

        public void main(String[] args) { //How to fix this error when there is static keyword?
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for (int i = 0; i < T; i++) {
                int age = sc.nextInt();
                Person p = new Person(age);
                p.amIOld();
                for (int j = 0; j < 3; j++) {
                    p.yearPasses();
                }
                p.amIOld();
                System.out.println();
            }
            sc.close();
        }
    }
}
