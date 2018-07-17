package main;

import java.util.concurrent.RecursiveTask;

/*
 * 0 1 1 2 3 5 8 
 * n(6) = 8
 * n(k) = n(k-1) + n(k-2)
 * 
 * k-1 = q
 * 
 * n(k-1) = n(k-2) + n(k-3)
 * n(q) = n(q-1) + n(q-2)
 */
public class FibboTask extends RecursiveTask<Integer> {

	private final Integer k;
	
	public FibboTask(Integer k) {
		this.k = k;
	}
	
	@Override
	protected Integer compute() {
		if (k <= 1) {
			return k;
		}
		
		FibboTask t1 = new FibboTask(k-1);
		FibboTask t2 = new FibboTask(k-2);
		
		t1.fork();
	
		return t2.compute() + t1.join();
	}

}
