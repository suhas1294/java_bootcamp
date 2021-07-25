package _02_oops._01_inheritance.more_example;

public class ChildOne extends Parent{
		
		private String instanceVariable = "inherited";
		
		public ChildOne(){
				super();
		}
		
		// overriding a public static method
		public static void publicStaticMethod(){
				System.out.println("INHERITED : publicStaticMethod");
		}
		
		// overriding a private static method
		private static void privateStaticMethod(){
				System.out.println("INHERITED : privateStaticMethod");
		}
		
		// overriding static method with primitive arguments
		public static void publicStaticMethod(int i){
				System.out.printf("INHERITED : publicStaticMethod with primitive parameter, %d (square)", i^2);
		}
		
		// overriding static method with reference arguments
		public static void publicStaticMethod(Dummy dummy){
				System.out.println("INHERITED " + dummy.getCompileTimeConstant());
		}
		
		// overriding instance method with reference type obj as arguments
		public String instanceMethod(Dummy dummy){
				return String.format("instance method with reference, received msg: %s", dummy.getRunTimeConstant());
		}
		
		public Dummy notThereInParentClass(){
				return new Dummy("exclusive child class");
		}
		
		public void getFinalStaticVariable(){
				//return finalStaticVariable; // ERROR !
		}
}
