package test;

public class GenericsStaticContextDemo<E> {
		private static int num = 10;
		
		public static <T> void printNumStaticGeneric(T t/*, E e*/){
				//System.out.println(e.getClass().getName());
				System.out.println(t.getClass().getName());
		}
		
		public <T extends String> void printNumInstanceGeneric(T t, E e){
				System.out.println(t.contains("s"));
				System.out.println(e.toString());
		}
		
		public static void printNum(){
				System.out.println(num);
		}
		
		public static void main(String[] args) {
			GenericsStaticContextDemo<String> obj = new GenericsStaticContextDemo<>();
			GenericsStaticContextDemo.printNumStaticGeneric(obj);
			GenericsStaticContextDemo.printNumStaticGeneric("obj");
			obj.printNumInstanceGeneric("suhas", "how");
		}
}

class Someskdhfb{
		public static int squareNum(Sksbfsjbfd s){
				return (int) Math.pow(s.getMyNumber(), 2);
		}
}

class Sksbfsjbfd{
		int myNumber;
		public Sksbfsjbfd(int myNumber){
				this.myNumber = myNumber;
		}
		public int getMyNumber() {
				return this.myNumber;
		}
}