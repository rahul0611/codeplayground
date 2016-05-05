/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rahula
 */
public class PlayGround {
    
    public static void main(String[] args) {
        
        java.util.Scanner scannerObject = null;
        
        try{
        
        System.out.println("****** Fibonacci Series ********");
        
        System.out.println("***** Please enter N number to which you need Fibonacci Series *******");
        
        /** creating scanner object to read from system input **/
        //TODO close scanner object
        scannerObject = new java.util.Scanner(java.lang.System.in);
        
        /** read the number from keyboard  it can range a high value so i took long data type**/
        long number = scannerObject.nextInt();
        
        /** closing the scanner ***/
        scannerObject.close();
        
        }finally{
        
            scannerObject.close();
        
        }
        
        
    }
    
}
