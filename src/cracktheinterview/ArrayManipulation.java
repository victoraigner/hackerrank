package cracktheinterview;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class ArrayManipulation {

    /*
     * Complete the arrayManipulation function below.
     */
    static long arrayManipulation(int n, int[][] queries) throws FileNotFoundException {

        int[] array = new int[n + 1];

        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            array[query[0]] = array[query[0]] + query[2];
            if (query[1] + 1 < array.length) {
                array[query[1] + 1] = array[query[1] + 1] - query[2];
            }

        }
        long devolver = 0;
        long maximo = 0;
        for (int i = 0; i < array.length; i++) {
            devolver = devolver + array[i];
            if (devolver > maximo) {
                maximo = devolver;
            }

        }
        return maximo;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        FileReader in = new FileReader("C:\\Vagrant\\input1.txt");
        BufferedReader br = new BufferedReader(in);
        
        
        
        String[] nm = br.readLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[][] queries = new int[m][3];
        
        int queriesRowItr = 0;
        String line;
        while ((line = br.readLine()) != null) {
            String[] queriesRowItems = line.split(" ");
            
            for (int queriesColumnItr = 0; queriesColumnItr < 3; queriesColumnItr++) {
                int queriesItem = Integer.parseInt(queriesRowItems[queriesColumnItr].trim());
                queries[queriesRowItr][queriesColumnItr] = queriesItem;
            }
            queriesRowItr++;
        }
        
        

        long result = arrayManipulation(n, queries);
        in.close();
        System.out.println(result);
        System.out.println("882");
    }
}
