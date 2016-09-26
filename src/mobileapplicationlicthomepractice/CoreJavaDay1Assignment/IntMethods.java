/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobileapplicationlicthomepractice.CoreJavaDay1Assignment;

/**
 *
 * @author Md.Asiful Haque
 * @author asm-linksys.com
 * @author Department of Computer Science
 * @author BRAC University
 * @version 10.1
 * @since 2016 September
 *
 */
public class IntMethods {

   

        /**
         *
         * @param userInputNumber use for pass the reference of value taken from
         * user via scanner.nextLine();
         * @return convertToInt return Converted String value in Int to calling
         * program.
         */
        public int reverseInt(String userInputNumber) throws NumberFormatException {

            // Obtaining string length
            int length = userInputNumber.length();
            /**
             * @param reversInt store original string in Reverse Order
             */
            String reverseInt = "";

            //to covert given string to int
            int convertToInt = 0;

            for (int counter = length - 1; counter >= 0; counter--) {
                /**
                 * Iterate through length-1 to 0 and place it to reverse order
                 */
                reverseInt = reverseInt + userInputNumber.charAt(counter);

            }
            try {

                //Try to convert String to int 
                convertToInt = Integer.parseInt(reverseInt);

            } catch (Exception e) {
                //Catch Exception NumberFormatException if Converted Int contains any non-int value
                System.out.println("Please enter an integer number ");
            }
            //Return Converted Int to Main App.
            return convertToInt;
        }

    



    public  int IntEquals(int original, int reverse) {
        Integer origianlNumber = original;
        Integer reverseNumber = reverse;

            if (origianlNumber.equals(reverse)) {
                return 1;
            } else {
                return 0;
            } //System.out.println("Equals ");
            //System.out.println("Not Equal");
//        if(origianlNumber==reverseNumber)
//        {
//            System.out.println("Reverse Int is equal to Original Int");
//        }
//        else
//        {
//            System.out.println("Not Equal");
//        }
    }
}

