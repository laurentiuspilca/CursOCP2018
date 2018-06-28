package main;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class Exemplu1 {

	public static void main(String [] args) {
		// Stream<T>
		// IntStream, LongStream, DoubleStream
		
		// map(), mapToInt(), mapToLong(), mapToDouble(), mapToObj()
		
		// IS -> map() -> IS    Function<T, R>  IntUnaryOperator
		// S, LS, DS -> mapToInt() -> IS     ToIntFunction<T>
		// S, IS, DS -> mapToLong() -> LS
		// S, IS, LS -> mapToDouble() -> DS  IntToDoubleFunction
		
		List<Integer> list = Arrays.asList(2,4,5,6,7,8);
		
		//Optional<Integer> q = list.stream().reduce((x,y) -> x + y);
		
		list.stream().mapToInt(x -> 2*x).sum(); // ToIntFunction<T>
		
		List<String> list2 = Arrays.asList("hello", "world");
		list2.stream().mapToInt(String::length).sum();
	}
}
