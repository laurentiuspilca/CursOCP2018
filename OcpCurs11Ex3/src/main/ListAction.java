package main;

import java.util.List;
import java.util.concurrent.RecursiveAction;

public class ListAction extends RecursiveAction {
	
	private List<Integer> list;
	
	public ListAction(List<Integer> list) {
		this.list = list;
	}

	@Override
	protected void compute() {
		if (list.size() <= 3) {
			list.forEach(System.out::println);
		} else {
			int mid = list.size() / 2;
			List<Integer> list1 = list.subList(0, mid);
			List<Integer> list2 = list.subList(mid, list.size());
			
			ListAction a1 = new ListAction(list1);
			ListAction a2 = new ListAction(list2);
			
			invokeAll(a1,a2);
		}
	}

}
