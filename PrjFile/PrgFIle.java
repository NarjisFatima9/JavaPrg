/* Java program to read content from one file
 and write it into another file
 Custom paths for this program
 Reading from - Java_Programs.txt
 Writing to - Test.txt
 Importing input output classes
 User Narjis Fatima
 Date 1/27/2023*/
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class PrgFIle {
    public static void main(String[] args) {
        // Try block to check for exceptions
        try {

            // Creating a FileReader object and
            // file to be read is passed as in parameters
            // from the local directory of computer
            FileReader fr = new FileReader("Java_Programs.txt");

            // FileReader will open that file from that
            // directory, if there is no file found it will
            // through an IOException

            // Creating a FileWriter object
            FileWriter fw = new FileWriter("Test1.txt");

            // It will create a new file with name
            // "gfgOutput.text", if it is already available,
            // then it will open that instead

            // Declaring a blank string in which
            // whole content of file is to be stored
            String str = "";

            int i;

            // read() method will read the file character by
            // character and print it until it end the end
            // of the file

            // Condition check
            // Reading the file using read() method which
            // returns -1 at EOF while reading
            while ((i = fr.read()) != -1) {

                // Storing every character in the string
                str += (char)i;
            }

            // Print and display the string that
            // contains file data
            System.out.println(str);

            // Writing above string data to
            // FileWriter object
            fw.write(str);
            fr.close();
            fw.close();

            // Display message
            System.out.println("File reading and writing both done");
        }

        // Catch block to handle the exception
        catch (IOException e) {

            // If there is no file in specified path or
            // any other error occurred during runtime
            // then it will print IOException

            // Display message
            System.out.println(
                    "There are some IOException");
        }
    }
}

