/**
Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
Print the decimal value of each fraction on a new line with  places after the decimal.
Note: This challenge introduces precision problems. 
The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.
Function Description

Complete the plusMinus function in the editor below.

plusMinus has the following parameter(s):

int arr[n]: an array of integers
Print
Print the ratios of positive, negative and zero values in the array. 
Each value should be printed on a separate line with 6 digits after the decimal. The function should not return a value.
/*
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code hereDecimal
    Format df = new DecimalFormat("0.000000");
                        float Positives = (float)0;
                        float Negatives = (float)0;
                        float Zeros = (float)0;
                        float size = (float)arr.size();
                        for(int i = 0; i < size; i++)
                        {
                            if(arr.get(i) > 0){Positives++;}
                            else if(arr.get(i) < 0){Negatives++;}
                            else{Zeros++;}
                        }
                        System.out.println(df.format(Positives/size));
                        System.out.println(df.format(Negatives/size));
                        System.out.println(df.format(Zeros/size));
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
 
