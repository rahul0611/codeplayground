
/**
 *
 * @author rahula
 */
public class Fibonacci {

    public static void main(String[] args) {

        java.util.Scanner scannerObject = null;

        try {

            System.out.println("****** Fibonacci Series ********");

            System.out.println("***** Please enter N to generate fibonacci series *******");

            /**
             * creating scanner object to read from system input *
             */
            //TODO close scanner object
            scannerObject = new java.util.Scanner(java.lang.System.in);

            /**
             * read the number from keyboard it can range a high value so i took
             * long data type*
             */
            long number = scannerObject.nextInt();

            /**
             * closing the scanner **
             */
            scannerObject.close();

            int a = 0, b = 1;

            System.out.println(a);
            
            while (number >= 0) {

                System.out.println(b);

                b = b + a;
                a = b - a;
                
                /** decrease number for loop condition ***/
                number--;
            }
        } finally {
            if(scannerObject != null){
                scannerObject.close();
                scannerObject = null;
            }
        }
    }
}