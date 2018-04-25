package cracktheinterview;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class ArrayRotation {

    private static final Scanner scan = new Scanner(System.in);
 
    static void rotate (int[] original, int rotations){
        int new1[] = new int[original.length];
        
        for(int i = rotations; i< original.length;i++){
           new1[i-rotations] = original[i]; 
        }
        
        for(int i = 0; i<rotations;i++){
           new1[new1.length-rotations+i] = original[i]; 
        }
        String print = "";
        for (int i = 0; i < new1.length; i++) {
            print = print + new1[i]+ " ";
        }
        System.out.println(print);
            
    }
    
    public static void main(String[] args) {
       
        String[] nd = scan.nextLine().split(" ");

        int n = Integer.parseInt(nd[0].trim());

        int d = Integer.parseInt(nd[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = d; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            
            a[aItr-d] = aItem;
        }
        for (int aItr = 0; aItr < d; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            
            a[a.length-d+aItr] = aItem;
        }
        
        String print = "";
        for (int i = 0; i < a.length; i++) {
            print = print + a[i]+ " ";
        }
        System.out.println(print);
        
    }
        
    
}