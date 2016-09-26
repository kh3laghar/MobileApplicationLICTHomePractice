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
 */
public class IntReverseApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Test");
        String input=scn.nextLine();
        IntMethods ir=new IntMethods();
        System.out.println(ir.reverseInt(input));
    }
    
}
