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
 * @serial 1.3
 * @since 2016 September 24
 * @author asm-linksys.com
 */
class TaskThreeMethod {
      int firstNumber, secondNumber;
     public TaskThreeMethod()
    {
        
    }
     
    Scanner scn=new Scanner(System.in);
    public int firstNumberInput()
    {
        System.out.println("Please Enter First No = ");
        this.firstNumber=scn.nextInt();
        return firstNumber;
    }
       
    
    
    
}