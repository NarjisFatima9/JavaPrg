//Prg5 Java Program to Print Spiral Pattern of Numbers

import java.lang.Math;
public class SpriralPatternNumbers {
            public static void main(String args[]){
            int num , i, j,patternsize ;
            num = 5;
            System.out.print("The spiral pattern ");
            System.out.println();
            patternsize = 2 * num- 1;
            for( i = 1; i <= patternsize; i++){
                for( j = 1; j <= patternsize; j++){
                    System.out.print(Math.max(Math.abs(i - num), Math.abs(j - num)) + 1 + " ");


                }
                System.out.println();
            }
        }
    }

