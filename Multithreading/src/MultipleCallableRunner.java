import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService; // 스레드 풀 관리를 위한 ExecutorService 
import java.util.concurrent.Executors; // ExecutorService를 생성하기 위한 Executors
import java.util.concurrent.Future; // 비동기 작업의 결과를 나타내는 Future 인터페이스

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executorService = Executors.newFixedThreadPool(1); // 1개의 스레드를 가진 스레드 풀 생성
		// ExecutorService executorService = Executors.newFixedThreadPool(3); -> 더 속도가 빨라짐 
		
		List<CallableTask> tasks = List.of(
				new CallableTask("in28Minutes"), // "in28Minutes" 작업 생성
				new CallableTask("Ranga"),       // "Ranga" 작업 생성
				new CallableTask("Adam")         // "Adam" 작업 생성
				);
		
		List<Future<String>> results = executorService.invokeAll(tasks); // 모든 작업을 실행하고 결과를 Future 리스트로 받음
		
		for (Future<String> result:results) {
			System.out.println(result.get()); // 각 작업의 결과를 출력 (결과가 준비될 때까지 대기)
		}
		
		executorService.shutdown(); // 스레드 풀 종료

	}

}
