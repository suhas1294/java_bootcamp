package _02_oops._01_inheritance.more_example;

public class Dummy {
		private static final String compileTimeConstant = "Dummy!";
		public final String runTimeConstant;
		
		public String getRunTimeConstant() {
				return runTimeConstant;
		}
		
		public Dummy(String runTimeConstant){
				this.runTimeConstant = runTimeConstant;
		}
		
		public String getCompileTimeConstant() {
				return compileTimeConstant;
		}
}
