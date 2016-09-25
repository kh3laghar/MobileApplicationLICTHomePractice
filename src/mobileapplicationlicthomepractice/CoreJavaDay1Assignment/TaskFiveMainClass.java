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
public class TaskFiveMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
   
        System.out.println("Please Enter Upper Value = ");
        int firstNumber=scn.nextInt();
        System.out.println("Please Enter Lower Value = ");
        int secondNumber=scn.nextInt();
        
        TaskFiveMethod t5=new TaskFiveMethod();
        System.out.println(t5.dividerCalc(firstNumber, secondNumber));
        // TODO code application logic here
    }
    
}
