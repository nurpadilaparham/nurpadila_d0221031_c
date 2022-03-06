import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        int lastIndex = s.length()-k;
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        for(int i=0;i<=lastIndex;i++){
            String sub = s.substring(i, i+k);
            //System.out.println(sub);
            if (smallest.compareTo(sub)>0) {
                smallest = sub;
            }
            if (largest.compareTo(sub)<0) {
                largest = sub;
                
            }
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }