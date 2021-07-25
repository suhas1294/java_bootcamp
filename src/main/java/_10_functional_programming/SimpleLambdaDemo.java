package _10_functional_programming;

interface SampleInterface{
		void go(String name);
}

public class SimpleLambdaDemo {
		public void methodTakingInterface(SampleInterface sampleInterface, String option){
				sampleInterface.go(option);
		}
		public static void main(String[] args) {
				// write implementation for method
				// interface reference = implentation of only available method.
				SampleInterface sampleInterface = (name) -> System.out.println("Hello, " + name);
				sampleInterface.go("John doe");
		}
}
