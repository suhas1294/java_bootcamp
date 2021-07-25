package _01_basics;

/*
* variable declared with final keyword should be initialized in any of following 3 places:
* 1. declaration
* 2. constructor
* 3. instance intializer
*
* For final static variable, It must be initialized in:
* 1. declaration
* 2. static initializer
*
*/
class IStudent{
		int z = 5;
		final int x = 25 + z;
		
		public  static int idInitializer = 1000;
		private final int id;
		private String name;
		private String gender;
		
		public String getName() {
				return name;
		}
		
		public void setName(String name) {
				this.name = name;
		}
		
		public String getGender() {
				return gender;
		}
		
		public void setGender(String gender) {
				this.gender = gender;
		}
		
		public IStudent(){
				this.id = ++idInitializer;
				System.out.printf("final value is %d\n", x);
		}
		
		public IStudent(String name, String gender){
				this.id = ++idInitializer;
				this.name = name;
				this.gender = gender;
		}
}

public class FinalUsage{
		public static void main(String[] args) {
				IStudent iStudent = new IStudent();
		}
}