/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracktheinterview;

import java.util.Arrays;

/**
 *
 * @author Victor
 */
public class CrackIntreview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        printArray(a);

        arrayLeftRotation(a, 5, 2);
        
        printArray(a);

    }
    
    public static void printArray(int[]a){
        for(int i=0; i < a.length-1; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(a[a.length-1]);
    }
    
    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        //n = numero de enteros
        //k numero de rotaciones
        int temp = 0;
        for (int j = 1; j <= k; j++) {

            int actual = a[n - 1];

            for (int i = n - 1; i > 0; i--) {

                temp = a[i - 1];

                a[i - 1] = actual;
                actual = temp;
            }
            a[n - 1] = temp;
            int b = a.length;

        }
        return a;
    }
}
