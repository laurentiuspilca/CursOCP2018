package main;

@FunctionalInterface
public interface Predicat<T> {
	public boolean test(T x);
}
