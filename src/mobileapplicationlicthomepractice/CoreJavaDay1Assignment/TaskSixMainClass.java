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
 * @serial 1.5.2
 * @since 2016 September 24
 * @author asm-linksys.com
 */
public class TaskSixMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * @param scn use to take input from user
         */
        Scanner scn=new Scanner(System.in);
        
        
        /**
         * Promoting for Upper divisible value
         * @param firstNumber for upperValue
         */
        System.out.println("Please Enter Upper Value = ");
        
        int firstNumber=scn.nextInt();
        
        
        /**
         * Promoting for Lower divisible value
         * @param secondNumber for secondNumber
         */
        System.out.println("Please Enter Lower Value = ");
        
        int secondNumber=scn.nextInt();
        
        /**
         * New Instance of TaskFiveMethod 
         * @param taskFiveMethod for new TaskFiveMethod instance
         */
        TaskSixMethod taskSixMethod=new TaskSixMethod();
        
        //Printing for test 
        //System.out.println(t6.dividerCalc(firstNumber, secondNumber));
        
        /**
         * @param tempDevideResult collect result from deviderCalc method.
         */
        int tempDivideResult=taskSixMethod.dividerCalc(firstNumber, secondNumber);
        //Printing for test
        //System.out.println(t6reminderCalc(firstNumber, secondNumber));
        
        /**
         * @param tempReminderResult collect result from reminderCalc method
         */
        int tempReminderResult=taskSixMethod.reminderCalc(firstNumber, secondNumber);
        
        System.out.println("Devided Value "+"\tReminder Value");
        System.out.println(tempDivideResult+"\t"+"\t"+tempReminderResult);
        
        
    }
    
}
