import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService; // 스레드 풀 관리를 위한 ExecutorService 
import java.util.concurrent.Executors; // ExecutorService를 생성하기 위한 Executors

public class MultipleAnyCallableRunner {

public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executorService = Executors.newFixedThreadPool(1); // 1개의 스레드를 가진 스레드 풀 생성
		// ExecutorService executorService = Executors.newFixedThreadPool(3); -> 더 속도가 빨라짐 
		
		List<CallableTask> tasks = List.of(
				new CallableTask("in28Minutes"), // "in28Minutes" 작업 생성
				new CallableTask("Ranga"),       // "Ranga" 작업 생성
				new CallableTask("Adam")         // "Adam" 작업 생성
				);
		
		String result = executorService.invokeAny(tasks); // 가장 먼저 나오는 결과를 result로 반환 
		
		System.out.println(result);
		
		executorService.shutdown(); // 스레드 풀 종료

	}

}

