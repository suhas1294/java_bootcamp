package _01_basics;

class SuperClass{
		SuperClass(){ //s5
				System.out.println("super class constructor");
		}
}
class SubClass extends SuperClass{
		static final int STATIC_FINAL = 47; // compile time constant
		static final int STATIC_FINAL2 = (int)(Math.random() * 5);
		static { //s3
				System.out.println("subclass static initializer");
		}
		SubClass(){ //s6
				System.out.println("subclass constructor");
		}
}

// JvmInternals: class initializer
public class JvmInternals {
		static { //s1
				System.out.println("JvmInternals demo, static initializer");
		}
		{
				System.out.println("JvmInternals: instance initializer");
		}
		public static void main(String[] args) {
				System.out.println("SubClass.STATIC_FINAL\t" + SubClass.STATIC_FINAL); //s2
				System.out.println("SubClass.STATIC_FINAL2\t" + SubClass.STATIC_FINAL2); //s4
				new SubClass();
				new JvmInternals(); //s7
		}
}
