package _02_oops._01_inheritance.more_example;

public class Parent {
		private String instanceVariable;
		private static String staticVarialbe;
		private static final String finalStaticVariable = "finalStaticVariable";
		
		// no args constructor
		public Parent(){}
		
		// partial constructor
		public Parent(String instanceVariable){
				this.instanceVariable = instanceVariable;
		}
		
		// getter for private variable
		public String getInstanceVariable() {
				return instanceVariable;
		}
		
		// static methods
		// public static method
		public static void publicStaticMethod(){
				System.out.println("publicStaticMethod");
		}
		
		// public static method with primitive arguments
		public static void publicStaticMethod(int i){
				System.out.printf("publicStaticMethod with primitive parameter, %d", i);
		}
		
		// public static method with reference type arguments
		public static void publicStaticMethod(Dummy dummy){
				System.out.println(dummy.getCompileTimeConstant());
		}
		
		// private static method
		private static void privateStaticMethod(){
				System.out.println("privateStaticMethod");
		}
		
		// instance methods
		// instance method with return type and no arguments
		public String instanceMethod(){
				return "instanceMethod without parameters";
		}
		
		// instance method with return type and primitive arguments
		public String instanceMethod(String msg){
				return String.format("instanceMethod with parameters, received msg: %s", msg);
		}
		
		// instance method with reference type arguments
		public String instanceMethod(Dummy dummy){
				return String.format("instance method with reference, received msg: %s", dummy.getCompileTimeConstant());
		}
		
		//private instance method
		private void privateINstanceMethod(){
				System.out.println("privateINstanceMethod");
		}
}
