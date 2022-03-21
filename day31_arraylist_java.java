import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> data= new ArrayList<>();
        for(int i=0;i<n;i++){
            int d =sc.nextInt();
            ArrayList<Integer>baris = new ArrayList<>();
            
            if(d>0){
                for(int j=0;j<d;j++){
                    int element = sc.nextInt();
                    baris.add(element);
                }
            }
            data.add(baris);
        }//end of input element
        
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            if(x<n && data.get(x)!=null&& y<data.get(x).size()){
                int element = data.get(x).get(y);
                System.out.println(element);
            }else{
                System.out.println("ERROR!");
            }
        }
    }
}