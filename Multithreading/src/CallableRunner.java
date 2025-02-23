import java.util.concurrent.Callable; // Callable은 작업을 실행하고 결과를 반환할 수 있는 작업 단위를 정의
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService; // 스레드 풀(Executor)을 관리하고 작업을 실행할 때 사용하는 인터페이스
import java.util.concurrent.Executors; // ExecutorService 인스턴스를 생성할 때 사용하는 팩토리 클래스
import java.util.concurrent.Future; // 비동기 작업의 결과를 나타내며, 작업 완료 후 결과를 가져올 때 사용하는 객체

class CallableTask implements Callable<String> {
	
	private String name;

	public CallableTask(String name) {
		this.name = name;
	}
	
	@Override
	public String call() throws Exception { 
		Thread.sleep(1000);
		return "Hello" + name;
	}
	
}

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		
		
		// 스레드 풀에 작업(CallableTask)를 제출하여 비동기적으로 실행
		// 작업의 결과를 비동기적으로 받을 수 있는 Future 객체에 저장
		Future<String> welcomeFuture = 
				executorService.submit(new CallableTask("in28minutes"));
		System.out.print("new CallableTask(\"in28minutes\") executed\n");
		
		// 이 호출은 CallableTask의 call() 메소드가 완료될 때까지 블록
		String welcomeMessage = welcomeFuture.get();
		
		System.out.print(welcomeMessage);
		
		System.out.print("\nMain Completed");

	}

}
