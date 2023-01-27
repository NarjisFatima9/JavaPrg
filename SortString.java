/*Java program to Sort a String Alphabetically
  With using the sort() method
  User Narjis Fatima
  Date 1/27/2023*/

 import java.util.Arrays;

public class SortString {

// Importing Arrays class from java.util package

    // To sort a string alphabetically
    public static String sortString(String inputString)
    {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();

        // Sorting temp array using
        Arrays.sort(tempArray);

        // Returning new sorted string
        return new String(tempArray);
    }
        public static void main(String[] args)
        {
            // Custom string as input
            String inputString = "hellosort";
            String outputString = sortString(inputString);

            // Print and display commands

            // Input string
            System.out.println("Input String : " + inputString);
            // Output string
            System.out.println("Output String : "
                    + outputString);
        }

    }
