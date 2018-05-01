/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracktheinterview;

import java.util.Scanner;

/**
 *
 * @author SG0214164
 */
public class Calculator {

 

        static double power(int a, int b) throws Exception {
            if (a < 0 || b < 0) {
                throw new Exception("n and p should be non-negative");
            }
            Double a1 = (double)a;
            Double b1 = (double)b;
            return Math.pow(a, b);
        }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                double ans = myCalculator.power(n, p);
                System.out.println(ans);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }

}
