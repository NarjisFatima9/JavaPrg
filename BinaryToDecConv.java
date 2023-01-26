/* Java program to convert Binary number to Decimal number*/
import java.util.Scanner;
public class BinaryToDecConv {

    /**
     * Can convert large binary number by storing binary number as String
     */
        public static void main(String args[])
        {
           // Scanner s=new Scanner(System.in);
            String num = "111111011";

            System.out.print("Binary number: " + num + " to decimal number = " );

           // String num=s.nextLine();

            System.out.println(Integer.parseInt(num,2));
        }
    }


