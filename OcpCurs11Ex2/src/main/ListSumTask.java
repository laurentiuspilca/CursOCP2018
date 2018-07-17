package main;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.RecursiveTask;

/*
 * [1,4,7,8,4,5,7,9,3,4,6]
 * 
 * [1,4,7,8,4,5], [7,9,3,4,6]
 * 
 * [], [] ,[] ,[]
 */
public class ListSumTask extends RecursiveTask<Integer> {

	private final List<Integer> list;
	
	public ListSumTask(List<Integer> list) {
		this.list = Collections.unmodifiableList(list);
	}
	
	@Override
	protected Integer compute() {
		if (list.size() <= 3) {
			return list.stream().mapToInt(x -> x).sum();
		}
		
		int mid = list.size() / 2;
		List<Integer> list1 = list.subList(0, mid);
		List<Integer> list2 = list.subList(mid, list.size());
		
		ListSumTask task1 = new ListSumTask(list1);
		ListSumTask task2 = new ListSumTask(list2);
		
		task1.fork();
		
		return task2.compute() + task1.join();
	}

}
