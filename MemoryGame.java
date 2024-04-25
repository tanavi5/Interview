package com.interview;
import java.util.Scanner;

import java.util.Scanner;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try 
        {
            System.out.println("Enter the total number of numbers shown:");
            int N = scanner.nextInt();
            int[] numbers = new int[N];
            System.out.println("Enter the numbers separated by spaces:");
            for (int i = 0; i < N; i++) 
            {
                numbers[i] = scanner.nextInt();
            }

            System.out.println("Enter the total number of queries:");
            int Q = scanner.nextInt();

            System.out.println("Enter the queries:");
       
            for (int i = 0; i < Q; i++) 
            {
                int query = scanner.nextInt();
                int count = countOccurrences(numbers, query);
                if (count > 0) 
                {
                    System.out.println(count);
                } else 
                {
                    System.out.println("NOT PRESENT");
                }
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Invalid input format. Please provide input as specified.");
        } 
        finally 
        {
            scanner.close();
        }
    }

   
    public static int countOccurrences(int[] arr, int num) 
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == num) 
            {
                count++;
            }
        }
        return count;
    }
}

