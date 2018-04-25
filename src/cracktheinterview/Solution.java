package cracktheinterview;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
     public Solution(String magazine, String note) {
        magazineMap = new HashMap<>();
        noteMap = new HashMap<>();
        String[] source = magazine.split(" ");
        
        for(String word: magazine.split(" ")){
           if(magazineMap.containsKey(word)){
               Integer value = (int)magazineMap.get(word) + 1;
               magazineMap.replace(word, value);
           }else{
               magazineMap.put(word, 1);
           }  
        }
        
        for(String word: note.split(" ")){
           if(noteMap.containsKey(word)){
               Integer value = (int)noteMap.get(word) + 1;
               noteMap.replace(word, value);
           }else{
               noteMap.put(word, 1);
           }  
        }
        
        
    }
    
    public boolean solve() {
        Iterator it = noteMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            int magazineCount = magazineMap.get(pair.getKey());
            int noteCount = (int)pair.getValue();
            if( magazineCount< noteCount){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}
