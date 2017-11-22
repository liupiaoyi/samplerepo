package lambda.test;

import lambda.interf.Inter;
import java.util.Date;

public class LambdaTest {
	
	public static void main(String[] args) {

//		String[] strs = {"hello", "world", "what", "hi"};
//		Comparator<String> c3  = (s1, s2) -> s2.compareTo(s1);
//		
//		Arrays.sort(strs, c3);
		
//		int y = sun(10,x -> 2*x);
		
		//int z = sun(x -> x*x,10);
		
//		System.out.println(y+"---");
		
//		Inter<Integer> inf = (s1) -> s1+20;
//		System.out.println(inf.fun(12));	
		
		System.out.println( new Date(){
			public long getTime() {
				System.out.println("time:::");
				return super.getTime();
			}
		});
			
			
	}
	
//	public static int sun(int x,Inter func) {
//	
//		return func.fun(x);
//	}

}
