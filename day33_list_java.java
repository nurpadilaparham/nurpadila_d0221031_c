import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> integerList = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            integerList.add(sc.nextInt());
        }

        // Queries
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            String command = sc.next();
            if(command.equalsIgnoreCase("Insert")){
                int x = sc.nextInt();
                int y = sc.nextInt();
                integerList.add(x, y);
            }
            if (command.equalsIgnoreCase("Delete")) {
                int x = sc.nextInt();
                integerList.remove(x);
            }
        }
        //print

        for (Integer value : integerList) {
            System.out.print(value + " ");
        }
    }
    
}