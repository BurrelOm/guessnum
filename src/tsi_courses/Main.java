package tsi_courses;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Random randome = new Random ();

        Scanner scanner = new Scanner(System.in);

        System.out.println("I think of number from 1 to 100. Try to guess it.");

        int myNum = randome.nextInt(100) + 1;

        for (int i = 10; i > 1;  i--) {
            System.out.println( " your have " + i + " try " );

        int userNum = scanner.nextInt();

        if (myNum < userNum) {
            System.out.println( "<"+ userNum + " , try next number");
        } else if (myNum > userNum) {
            System.out.println( userNum + "< , try next number");
        } else {
            System.out.println("your win");
            break ;
        }



        }






    }
}
