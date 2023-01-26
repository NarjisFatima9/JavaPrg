import java.util.Scanner;

public class FactorialNum {
            public static void main(String[] args) {
            //          int fac = 1, N = 9;
            int N,  fact=1;
            Scanner s = new Scanner(System.in);

            System.out.print("Enter a Number: ");
            N = s.nextInt();

            for (int i = 1; i <= N; i++) {
                fact *= i;
            }
            System.out.println("Factorial of the number is: " + fact);
        }

    }
