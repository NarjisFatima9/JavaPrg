import java.util.Scanner;
public class VowelsAndConsonantFinding {
           public static void main(String[] var0) {
            VowelsAndConsonantFinding var1 = new VowelsAndConsonantFinding();
            Scanner var2 = new Scanner(System.in);
            System.out.println("Enter a character : ");
            char var3 = var2.next().charAt(0);
            var1.findVowelOrNot(var3);
        }

        void findVowelOrNot(char var1) {
            if (var1 != 'a' && var1 != 'e' && var1 != 'i' && var1 != 'o' && var1 != 'u' && var1 != 'A' && var1 != 'E' && var1 != 'I' && var1 != 'O' && var1 != 'U') {
                if ((var1 < 'a' || var1 > 'z') && (var1 < 'A' || var1 > 'Z')) {
                    System.out.println("Not an alphabet");
                } else {
                    System.out.println("Entered character " + var1 + " is Consonent");
                }
            } else {
                System.out.println("Entered character " + var1 + " is  Vowel");
            }

        }

    }
