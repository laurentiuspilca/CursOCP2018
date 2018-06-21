package main;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {

	public static void main(String [] args) {
		//Stream.of(2,4,5).forEach(System.out::println);
		//Stream.generate(() -> 1).limit(5).forEach(System.out::println);
		
		Predicate<Integer> p1 = x -> x % 2 == 0;
		boolean b1 = p1.test(10);
		
		Consumer<Integer> c1 = x -> System.out.println(x);
		c1.accept(10);
		
		Consumer<Integer> c2 = System.out::println;
		c2.accept(10);
		
		Supplier<Integer> s1 = () -> 1;
		System.out.println(s1.get());
		
		BiConsumer<Integer, String> c3 = (x,y) -> System.out.println(y);
		c3.accept(5, "HELLO");
		
		BiPredicate<Integer, String> p2 = (x,y) -> x == y.length();
		boolean b2 = p2.test(5, "HELLO");
		
		Function<String, Integer> f1 = x -> x.length();
		Integer x1 = f1.apply("HELLO");
		
		Function<String, Integer> f2 = String::length;
		Integer x2 = f2.apply("HELLO");
		
		BiFunction<String, Integer, Integer> f3 = (x,y) -> x.length() + y;
		Integer x3 = f3.apply("Hello", 3);
		
		Function<String, String> f4 = x -> new StringBuilder(x).reverse().toString();
		String x4 = f4.apply("HELLO");
		
		UnaryOperator<String> uo1 = x -> new StringBuilder(x).reverse().toString();
		String x5 = uo1.apply("HELLO");
		
		BiFunction<Integer, Integer, Integer> f5 = (x,y) -> x + y;
		Integer x6 = f5.apply(5, 3);
		
		BinaryOperator<Integer> bo1 = (x,y) -> x + y;
		Integer x7 = bo1.apply(5, 3);
		
		Map<Integer, String> map = new HashMap<>();
		map.put(5, "Hello");
		map.put(7, "World");
		map.forEach((k,v) -> System.out.println(k + " " + v)); 
	}
}
