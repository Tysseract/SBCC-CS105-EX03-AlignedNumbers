/**
 * CS 105 Theory & Practice
 * CRN: 62499
 * Assignment: AlignedNumbers
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Mattys C vanZeyl
 */
package edu.sbcc.cs105;

import java.util.*;

/**
 * This class tests the AlignedNumbers object.
 *
 */
public class AlignedNumbers {
    /**
     * This code accepts two integers and then prints out the relationship 
     * between those two numbers as described in the problem statement.
     *
     * @param first The first integer value
     * @param second The second integer value
     *
     * @return A string with the metrics formatted as described
     */
    public static String alignNumbers(int first, int second) {
        String aligned = "";
    	
        // Put your code for this assignment here.
        
        //spacing to ones: 30
        final int SPACING = 30;
        
        //calculate
        int valueSum = first + second;
        String stringSum = "Sum:" + String.format("%26s", valueSum) + "\n";
        
        double valueAverage = valueSum / 2.0;
        String stringAverage = "Average:" + String.format("%25.2f",  valueAverage) + "\n";
        
        int valueDifference = first - second;
        String stringDifference = "Difference:" + String.format("%19s", valueDifference) + "\n";
        
        int valueProduct = first * second;
        String stringProduct = "Product:" + String.format("%22s", valueProduct) + "\n";
        
        int valueDistance = Math.abs(first - second);
        String stringDistance = "Distance:" + String.format("%21s", valueDistance) + "\n";
        
        int valueMax = Math.max(first,second);
        String stringMax = "Maximum:" + String.format("%22s", valueMax) + "\n";
        
        int valueMin = Math.min(first,second);
        String stringMin = "Minimum:" + String.format("%22s", valueMin) + "\n";
        
        //concatinate
        aligned = stringSum + stringAverage + stringDifference + stringProduct + stringDistance + stringMax + stringMin;       
     
        return aligned;
    }
    
    /**
     * This code runs by asking for two numbers, computing the various stats,
     * and then printing it out.
     * 
     * @param args
     *            command line values. Not used in this example.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = in.nextInt();
        System.out.print("Enter the second number: ");
        int second = in.nextInt();

        System.out.println(alignNumbers(first, second));
    }
}