 /*Un Checked Exception Handling program
  *(Array)IndexoutOfBoundException Using Try Catch Block
  * User Narjis Fatima
  * Date 1/27/2023
  */
 import java.io.*;

 public class PrgUnCheckExc {


     public static void main(String[] args) {
         int n1 = 15, n2 = 0; // Try to divide by zero
         try {
             int result = n1 / n2;
         } catch (ArithmeticException e) {
             System.out.println("Exception in division operation");
         }
     }
 }