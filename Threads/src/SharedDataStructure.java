import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;


public class SharedDataStructure {

	private List<Integer> numbers;
	private ReentrantReadWriteLock rwl;

	public SharedDataStructure() {
		this.numbers = new ArrayList<Integer>();
		this.rwl = new ReentrantReadWriteLock();
	}	

	//write method
	public void addNumber(int number) {
		this.rwl.writeLock().lock();
		this.numbers.add(number);
		this.rwl.writeLock().unlock();
	}	

	//read method
	public int size() {
//		this.rwl.readLock().lock();
//		int copy = this.numbers.size();
//		this.rwl.readLock().unlock();
//		return copy;
		
		try {
			this.rwl.readLock().lock();
			return this.numbers.size();
		} finally {
			this.rwl.readLock().unlock();
		}
	}
}