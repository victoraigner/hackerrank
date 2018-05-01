/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracktheinterview;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        sort(a);// Write Your Code Here
    }
    
    static void sort(int[] a){
        int n = a.length;
        int totalnumberOfSwaps = 0;
        
        for (int i = 0; i < n; i++) {
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j + 1] = tmp;    
                    
                    numberOfSwaps++;
                }
            }
            
            
            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                System.out.println("Array is sorted in "+totalnumberOfSwaps+" swaps.");
                System.out.println("First Element: " + a[0]);
                System.out.println("Last Element: " + a[a.length-1]);
                break;
            }
            totalnumberOfSwaps+=numberOfSwaps;
        }
    }
}