package main;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Exemplu3 {

	private ReadWriteLock lock = new ReentrantReadWriteLock();
	private int i;
	
	public void increment() {
		try {
			lock.writeLock().lock();
			i++;
		} finally {
			lock.writeLock().unlock();
		}
	}
	
	public int get() {
		try {
			lock.readLock().lock();
			return i;
		} finally {
			lock.readLock().unlock();
		}
	}
}
