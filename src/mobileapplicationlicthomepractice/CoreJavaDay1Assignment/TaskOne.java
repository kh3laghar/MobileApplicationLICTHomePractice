/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobileapplicationlicthomepractice.CoreJavaDay1Assignment;

import java.util.Scanner;

/**
 *
 * @author Md.Asiful
 * @Date 17.09.2016
 * @serial 1.1
 * @author ASM-Linksys.com
 */
public class TaskOne {

    public static void main(String[] args) {
        /**
         * param scn used for scanner class 
         * Initiating Scanner Class for Taking String input from user 
        **/
        Scanner scn = new Scanner(System.in);
        /**
         * Promoting for new String Input.
         */
        
        System.out.println("Please Write Something "
                + "");
        
        /**
         * inputArray taking String Line Input .
         */
        String inputArray = scn.nextLine();
        
        /**
         * toUpperCase use to convert taken Input Using inputArray
         */
        String toUperCase = inputArray.toUpperCase();
        System.out.println(toUperCase);
        int originalLength = inputArray.length();
        String reverse = "";
        for (int i = originalLength - 1; i >= 0; i--) {
            reverse = reverse + inputArray.charAt(i);

        }
        if (inputArray.equals(reverse)) {
            System.out.println("This is a Palingdrome ");

        } else {
            System.out.println("This is not a  PALINGDROME");
        }

    }

}
