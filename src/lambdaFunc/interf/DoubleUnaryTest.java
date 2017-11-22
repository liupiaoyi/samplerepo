package lambdaFunc.interf;

import java.util.function.DoubleUnaryOperator;

public class DoubleUnaryTest {
	
	public static void main(String[] args) {
		
		
	double d = 	DoubleUnaryMethod(dd -> dd,3,4,5);
	System.out.println("d==="+d);
		
	}
	
	public static double DoubleUnaryMethod(DoubleUnaryOperator duo, double x1, double x2, int numSlices) {
	    if (numSlices < 1) numSlices = 1;
	    double delta = (x2 - x1) / numSlices;
	    double start = x1 + delta / 2.0;
	    double sum = 0.0;
	    for (int i = 0; i <numSlices; i++) {
	      sum += delta * duo.applyAsDouble(start + delta * i);
	    }
	    return sum;
	  }

}
