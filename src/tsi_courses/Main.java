package tsi_courses;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Random randome = new Random ();

        Scanner scanner = new Scanner(System.in);

        System.out.println("I think of number from 1 to 100. Try to guess it.");

        int myNum = randome.nextInt(100) + 1;

        for (int i = 1; i < 10;  i++) {
            System.out.println("try number is: " + i );

        int userNum = scanner.nextInt();

        System.out.println(userNum);



        if (myNum < userNum) {
            System.out.println("your num >, try next number");
        } else if (myNum > userNum) {
            System.out.println("your num <, try next number");
        } else {
            System.out.println("your win");
            break ;
        }



        }






    }
}
