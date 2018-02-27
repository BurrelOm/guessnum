package tsi_courses;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Random randome = new Random ();

        Scanner scanner = new Scanner(System.in);

        int myNum = randome.nextInt(100) + 1;

        String answer ;

        do {

            System.out.println("I think of number X from 1 to 100. Try to guess X.");
            for (int i = 10; i > 0; i--) {
                System.out.println(" your have " + i + " try. Please enter your number: ");

                int userNum = scanner.nextInt();

                if (myNum < userNum) {
                    System.out.println("X <" + userNum + " , try next number");
                } else if (myNum > userNum) {
                    System.out.println(userNum + "< X , try next number");
                } else {
                    System.out.println("your win");
                    break;
                }
            }

            System.out.println("The game is over! The number was " + myNum);

            System.out.println("One more game? (yes/no) ");
            answer = scanner.next();

        } while (answer.equals("yes"));


        }}

