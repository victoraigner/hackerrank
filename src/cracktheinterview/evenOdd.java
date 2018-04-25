package cracktheinterview;

import java.io.*;
import java.util.*;

public class evenOdd {

    static String transform(String input) {
        String even = "";
        String odd = "";
        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0) {
                even = even + input.charAt(i);
            } else {
                odd = odd + input.charAt(i);
            }
        }

        return even + " " + odd;
    }

    static void transform(String[] strings) {
        for (String string : strings) {
            System.out.println(transform(string));
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();
        
        String[] strings = new String[n];
       
        for(int i =0; i<n; i++){
            strings[i] = scan.nextLine();
        }
        transform(strings);
        scan.close();
    }
}
