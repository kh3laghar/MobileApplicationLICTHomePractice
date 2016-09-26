/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobileapplicationlicthomepractice.CoreJavaDay1Assignment;

import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author Md.Asiful
 */
public class TaskTenApp extends IntMethods {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input;

        System.out.println("Please Enter a Number = ");
        input = scn.nextLine();
      
        if (input.length() != 5) {
            while(true){
            System.out.println("Please Enter a 5 Length Integer = ");
            input = scn.nextLine();
        }
        }else {
            System.exit(0);

        }
        
        
       
        int inputToint = Integer.parseInt(input);
        IntMethods im = new IntMethods();
        int reverse = im.reverseInt(input);
        System.out.println("Reverse No is = " + reverse);

        int equalsReseult = im.IntEquals(inputToint, reverse);
        if (equalsReseult == 1) {
            System.out.println("No are Equals");
        } else if (equalsReseult == 0) {
            System.out.println("NO are not Equals");
        }

    }

}
