import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day24_tag_content_extractor{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	//Write your code here
              boolean ditemukan = false;
              Pattern p = Pattern.compile("<(.+)>([^<]+)</\\1>");
              Matcher m = p.matcher(line);
              
              while(m.find()){
                  System.out.println(m.group(2));
                  ditemukan = true;
              }
              
              if(!ditemukan){
                  System.out.println("None");
              }
			
			testCases--;
		}
	}
}

