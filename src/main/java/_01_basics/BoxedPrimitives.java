package _01_basics;

public class BoxedPrimitives {
		public static void main(String[] args) {
				Integer integer = Integer.valueOf(8); //static factory
				
				// TODO : get to know difference between 'Integer.valueOf('8')' vs 'Integer.parseInt('8')' vs (int)('8')
				String eigth = "8";
				
				System.out.println(Integer.valueOf(eigth)); // returns boxed-primitive
				System.out.println(Integer.parseInt(eigth)); // returns primitive
				// System.out.println((int)eigth);
				
				// TODO: Auto-boxing
				// Compiler can automatically box a primitive. i.e., we can directly assigne a primitve to box-primitive
				// <, >, <=, >= always perform auto-unboxing automatically in a statement
				// whereas == and != does not perfomr auto-unboxing automatically in a statement
		}
}
