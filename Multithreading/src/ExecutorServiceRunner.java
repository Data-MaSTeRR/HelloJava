import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newSingleThreadExecutor(); // Thread 한번에 하나씩 실행! 
		executorService.execute(new Task1());
		executorService.execute(new Thread(new Task2()));
		
		//Task3 - 메인 메서드에 그냥. Thread executorService에서 실행되는 것은 아님! 
		System.out.print("Task3 Started\n");
		for (int i=301; i<=400; i++) {
			System.out.print(i + " ");
		}
		
		System.out.print("\nTask3 Done");
		System.out.print("\nMain Done");
		
		executorService.shutdown();
				
	}

}
