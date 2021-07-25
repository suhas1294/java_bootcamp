package _02_oops._04_interface;

public class DriverClassIntf {
		public static void main(String[] args) {
				CustomImplementer ci = new CustomImplementer();
				ci.someMethod();
				CustomInt1 c1 = new CustomImplementer();
				c1.go();
				CustomInt1.fish();
		}
}
