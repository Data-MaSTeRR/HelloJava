/* 용어정리
 * NEW - 객체 선언 
 * RUNNABLE - 스레드 동작중 다른 스레드가 실행중 
 * RUNNING - 해당 스레드 실행
 * BLOCKED/WAITING - 스레드 외부 인터페이스 입력으로부터 대기상
 * TERMINATED/DEAD - 스레드 종료 
 */


// extends Thread
// implements Runnable

class Task1 extends Thread {
	public void run() {
		System.out.print("Task1 Started\n");
		
		for (int i=101; i<=200; i++) {
			System.out.print(i + " ");
		}
		
		System.out.print("\nTask1 Done\n");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.print("Task2 Started\n");
		
		for (int i=201; i<=300; i++) {
			System.out.print(i + " ");
		}
		
		System.out.print("\nTask2 Done\n");
	}
	
}
public class ThreadBasicRunner {

	public static void main(String[] args) throws InterruptedException {
		
		//Task1 - Thread만 (방법1)
		Task1 task1 = new Task1();
		task1.setPriority(1); 
		// task1.run(); -> 직렬 처리 
		task1.start(); // -> 병렬 처리 
		
		//Task2 - Runnable, Thread 같이 (방법2) 
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2); // Runnable 클래스의 객체를 처리하려면, Thread 클래스에 감싸야함 
		task2Thread.setPriority(10); // 1~10 사이의 숫자. 숫자가 클수록 우선순위 빠름. 
		task2Thread.start(); // -> 병렬 처리 
		
		// wait for task1 to complete. task1이 끝나야 task3 시작!
		task1.join();
		
		// task2도 추가
		task2Thread.join();
		
		//Task3 - 메인 메서드에 그냥. Thread에서 실행되는 것은 아님! 
		System.out.print("Task3 Started\n");
		for (int i=301; i<=400; i++) {
			System.out.print(i + " ");
		}
		
		System.out.print("\nTask3 Done");
		System.out.print("\nMain Done");
	}

}
