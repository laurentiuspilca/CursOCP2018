package main;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Exemplu2 {

	public static void main(String [] args) {
		ReadWriteLock lock = new ReentrantReadWriteLock(); // fair / unfair
		
		lock.readLock().lock();
		// do smth
		lock.readLock().unlock();
		
		lock.writeLock().lock();
		// do smth
		lock.writeLock().unlock();
	}
}
