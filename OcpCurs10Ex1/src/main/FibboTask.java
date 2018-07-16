package main;

import java.util.concurrent.RecursiveTask;

public class FibboTask extends RecursiveTask<Integer> {

	private Integer n;
	
	public FibboTask(Integer n) {
		this.n = n;
	}
	
	@Override
	protected Integer compute() {
		if (n <= 1) {
			return n;
		}
		
		FibboTask f1 = new FibboTask(n-1);
		FibboTask f2 = new FibboTask(n-2);
		
		f1.fork();
		
		return f2.compute() + f1.join();
	}

}
