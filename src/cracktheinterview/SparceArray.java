package cracktheinterview;


import java.io.*;
import java.math.*;
import java.text.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.*;

public class SparceArray {

    /*
     * Complete the findSuffix function below.
     */
    static int findSuffix(HashMap<String, Integer> hash, String queryString) {
        
        if(hash.containsKey(queryString)){
            return hash.get(queryString);
        }else{
            return 0;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        HashMap<String, Integer> hash = new HashMap<>();

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        String[] strings = new String[stringsCount];

        for (int stringsItr = 0; stringsItr < stringsCount; stringsItr++) {
            String stringsItem = scanner.nextLine();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
            //strings[stringsItr] = stringsItem;
            
            if(hash.containsKey(stringsItem)){
                int value = (int)hash.get(stringsItem);
                hash.replace(stringsItem, value +1);
            }else{
                hash.put(stringsItem, 1);
            }
        }

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int qItr = 0; qItr < q; qItr++) {
            String queryString = scanner.nextLine();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
           
            //System.out.println(queryString);
            int res = findSuffix(hash, queryString);

            System.out.println(res);
        }

        

        scanner.close();
    }
}
