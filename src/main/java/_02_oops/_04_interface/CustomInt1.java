package _02_oops._04_interface;

public interface CustomInt1 {
		default void go(){
				System.out.println("CustomInt1: go");
		}
		
		/*default boolean equals(Object object){
				return  true;
		}*/
		
		static void fish(){
				System.out.println("Fished !!");
		}
}
