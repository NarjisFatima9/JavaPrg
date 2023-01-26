public class LargestNumber {
            public static void main(String args[]) {
            int a, b, c, temp, result;
            a = 10;
            b = 20;
            c = 30;

            temp = a > b ? a:b;
            result = c > temp ? c:temp;
            System.out.println("Largest number is ::"+result);
        }
    }

