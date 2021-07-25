package _02_oops._04_interface;

public class CustomImplementer implements CustomInt1{
		@Override
		public void go() {
				CustomInt1.super.go();
		}
		
		public void someMethod(){
				go();
				CustomInt1.fish();
		}
}
