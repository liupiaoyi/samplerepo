package StreamEg.inter;

import java.util.function.Supplier;

public class FibonacciSupplier implements Supplier<Long>{

	//每层方法=前两层之和
	private long beforeNum = 1;
	private long nowNum = 2;
	
	@Override
	public Long get() {
		//定义出当前有多少种方法
		long nowMethod = nowNum;
		long nextNum = nowNum+beforeNum;
		
		//前两层改变
		beforeNum = nowNum;
		nowNum = nextNum;
		
		//返回当前方法数
		return nowMethod;
	}

}
