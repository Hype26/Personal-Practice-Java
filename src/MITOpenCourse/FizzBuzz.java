package MITOpenCourse;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String [] args) {

        /*
        Fizz for divisible by 5
        Buzz for divisible by 3
        MITOpenCourse.FizzBuzz for divisible by both
        Print number if not divisible by either
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Number: ");
        int userDigit = input.nextInt();

        // Conditions
        if (userDigit % 5 == 0 && userDigit % 3 == 0) {
            System.out.println("MITOpenCourse.FizzBuzz");
        }

        else if (userDigit % 5 == 0) {
            System.out.println("Fizz");
        }

        else if (userDigit % 3 == 0) {
            System.out.println("Buzz");
        }

        else System.out.println(userDigit);
    }
}
