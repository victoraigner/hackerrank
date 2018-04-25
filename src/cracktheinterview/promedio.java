package cracktheinterview;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class promedio {

    // Complete the averageOfTopEmployees function below.
    static void averageOfTopEmployees(int[] rating) {
        float cantidad =0;
        float total = 0;
        for(int i=0;i<rating.length; i++){
            if(rating[i]>=90){
                total = total + rating[i];
                cantidad++;
            }
        }
        System.out.print(rounded(total,cantidad));

    }
    static String rounded(float total,float cantidad){
        Float promedio = total/cantidad;
        promedio = promedio + 0.001f;
        Double round = Math.round(promedio * 100.0) / 100.0;
        String resultado = round.toString();
        if(resultado.length()<5){
            resultado=resultado + "0";
        }
        return resultado;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] rating = new int[n];

        for (int ratingItr = 0; ratingItr < n; ratingItr++) {
            int ratingItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            rating[ratingItr] = ratingItem;
        }

        averageOfTopEmployees(rating);

        scanner.close();
    }
}