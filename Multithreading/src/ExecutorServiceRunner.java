import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {
	
	private int number;

	public Task(int number) {
		this.number = number;
	}
	
	public void run() {
		System.out.print("Task" + number + " Started\n");
		
		for (int i=number*100+1; i<=number*100+100; i++) {
			System.out.print(i + " ");
		}
		
		System.out.print("\nTask" + number + " Done\n");
	}
}

public class ExecutorServiceRunner {

	public static void main(String[] args) {
		
		//ExecutorService executorService = Executors.newSingleThreadExecutor(); // Thread 한번에 하나씩 실행! 
		ExecutorService executorService = Executors.newFixedThreadPool(3); // 한번에 Thread 3개까지 실행가능! FIFO로 
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(5));
		executorService.execute(new Task(6));
		
		executorService.shutdown();
				
	}

}
