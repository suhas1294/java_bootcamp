package _01_basics;

import java.util.Random;

public class ClassInitDemo {
		static final int CENTURY = 100;
		static final int randomInt = new Random().nextInt();
		
		static {
				System.out.println("static initializer block");
		}
		
		{
				System.out.println("instance initializer block");
		}
		
		public ClassInitDemo(){
				System.out.println("constructor");
		}
		
		static void staticMethod(){
				System.out.println("staticMethod");
		}
		
		void instanceMethod(){
				System.out.println("instance method");
		}
		
		public static void main(String[] args) {
				System.out.println("Started printing");
				ClassInitDemo initDemo = new ClassInitDemo();
				initDemo.instanceMethod();
		}
		
}
