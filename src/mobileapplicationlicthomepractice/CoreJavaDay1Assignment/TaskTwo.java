/**
 * Write a program that accepts two numbers from the Command Line and prints them out. Then use a for loop to print the next 13 numbers in the sequence where each number is the sum of the previous two
 */
package mobileapplicationlicthomepractice.CoreJavaDay1Assignment;

import java.util.Scanner;

/**
 *
 * @author Md.Asiful
 * @serial 1.2
 * @since 2016 September 24
 * @author asm-linksys.com
 * 
 */
public class TaskTwo {

    public static void main(String[] args) {
        /**
         * Scanner scn use to take input from user
         */
        Scanner scn = new Scanner(System.in);

        // Promoting for first user input.
        System.out.println("Please Enter First Number = ");
        /**
         * firstNumber pram use to take input first number from user
         */

        int firstNumber = scn.nextInt();

        // Promotting for second user input 
        System.out.println("Please Enter Second Number = ");

        /**
         * secondNumber param use to take input second number from user
         */
        int secondNumber = scn.nextInt();

        // Initilizing sum=0 to store temporary value.
        int sum = 0;

        /**
         * As per program specification this system will print first two number
         * taken from user along with next 13 sequence
         */
        System.out.print(firstNumber + " " + secondNumber + " ");

        /**
         * Running loop for next 13 consecutive number this counter will start
         * from 0 to less than 13 with following increment counter ++
         */
        for (int counter = 0; counter < 13; counter++) {

            /**
             * this line will be first logic of this program Adding first two
             * number and be the third number of the sequence For example : if
             * the user enter 1 & 2 the output will be sum=1+2=3 print sequence
             * will be 1 2 3 or if input is 1 & 3 then the print sequence is 1 3
             * 4
             */
            sum = firstNumber + secondNumber;
            /**
             * Printing the print sequence Notice that i use print instead of
             * println
             */
            System.out.print(sum + " ");
            /**
             * This section for making secondNumber become firstNumber and sum
             * of two number (Sum=firstNumber+secondNumber) will be secondNumber
             * For example: user input is 1 and 3 then next number will be 1+3=4
             * printing sequence will be like this 1 3 4 what will be next
             * sequence 1 3 4 7 which is sum of 3+4=7 for 1 3 4 7 sequence
             * firstNumber=secondNumber will make firstNumber=3 in next line
             * secondNumber=4 // which is a sum of two previous no
             *
             */

            firstNumber = secondNumber;
            secondNumber = sum;
        }

    }

}
