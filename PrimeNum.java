import java.util.Scanner;
    public class PrimeNum {
        public static void main(String[] args) {

            int num, count;
            Scanner s = new Scanner(System.in);

            System.out.print("Enter a Number: ");
            num = s.nextInt();


            for (int i = 1; i <= num; i++) {
                count = 0;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        count++;
                        break;
                    }
                }

                if (count == 0) {
                    System.out.println(i);
                }

            }
        }
    }