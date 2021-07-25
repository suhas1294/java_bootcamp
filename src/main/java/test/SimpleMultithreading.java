package test;

public class SimpleMultithreading {
		public static void main(String[] args) {
				WorkerClass someWork = new WorkerClass();
				Thread thread = new Thread(someWork);
				thread.start();
				System.out.println("In main thread");
		}
}

class WorkerClass implements Runnable{
		
		@Override
		public void run() {
				System.out.println("print is the work !");
		}
}