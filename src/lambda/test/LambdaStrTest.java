package lambda.test;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaStrTest {
	public static void main(String[] args) {
		
	String [] strs = {"xu","zong","yao"};
	
	//Comparator<String> str = (s1,s2) -> s1.compareToIgnoreCase(s2);
	Comparator<String> str = (s1,s2) -> Integer.compare(s1.length(), s2.length());
	
	
	//System.out.println(Arrays.toString(strs));
	 Arrays.sort(strs, str);
	 System.out.println(Arrays.toString(strs));  
//	 for (String st : strs) {
//	      System.out.println(st);
//	    }
	
	
	}
}
