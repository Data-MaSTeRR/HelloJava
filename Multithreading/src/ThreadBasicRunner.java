

class Task1 extends Thread {
	public void run() {
		System.out.print("Task1 Start\n");
		
		for (int i=101; i<=200; i++) {
			System.out.print(i + " ");
		}
		
		System.out.print("\nTask1 Done\n");
	}
}

public class ThreadBasicRunner {

	public static void main(String[] args) {
		//Task1
		Task1 task1 = new Task1();
		// task1.run(); -> 직렬 처리 
		task1.start(); // -> 병렬 처리 
		
		//Task2
		for (int i=201; i<=300; i++) {
			System.out.print(i + " ");
		}
		
		System.out.print("\nTask2 Done\n");
		
		//Task3
		for (int i=301; i<=400; i++) {
			System.out.print(i + " ");
		}
		
		System.out.print("\nTask3 Done");
		System.out.print("\nMain Done");
	}

}
