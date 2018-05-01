package crackintreview;

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arrays2d {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        int suma = 0;
        for(int i = 0;i<arr.length-2;i++){
            for(int j = 0;j<arr[0].length-2;j++){
                suma = arr[i][j]+arr[i][j+1]+arr[i][j+2]+
                                arr[i+1][j+1]+
                       arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if(suma>max)
                    max=suma;
                    
            }
        }
        System.out.println(max);
    }
}