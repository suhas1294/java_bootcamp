package _10_functional_programming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

// this class also demos for constructor references
public class StandardFunctionalInterfaces {
		public static void main(String[] args) {
				// way-1
				Supplier<String> supplier = () -> "get method does not take anything, but returns T which is string here.";
				supplier.get();
				
				Function<String, String> function1 = inputString -> "Hello, " + inputString ;
				function1.apply("John");
				
				// way-2
				Function<String, String> function2 = String::new;
				function1.apply("John");
				
				// way-2 example 2
				BiFunction<Integer, Float, HashMap> biFunction = (number, floatingNUmber) -> new HashMap(number, floatingNUmber);
				biFunction.apply(23, 45.67f);
				
				BiFunction<Integer, Float, HashMap> biFunction2 = HashMap::new;
				biFunction2.apply(23, 45.67f);
				
				Consumer<String> consumer1 = (inputString) -> System.out.println(inputString) ;
				consumer1.accept("this gets printed, consumer only take things, wont return anything");
				
				Consumer<String> consumer2 = System.out::println;
				consumer2.accept("same here!");
				
		}
		
}
