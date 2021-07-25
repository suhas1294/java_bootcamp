package _04_exception_handling;

import java.io.FileNotFoundException;
				import java.io.IOException;
				import java.util.Random;

// here FileNotFoundException is a subclass of IO exception

class UtilityClass{
		public static void doSOmething() throws IOException {
				int i = new Random().nextInt(10);
				if (i < 10 && i > 5){
						throw new FileNotFoundException("file not found");
				}else{
						throw new IOException("io exception");
				}
		}
}

public class PolymorphicHandling {
		// note that order of catch clause is from sub class(specific class) to parent class : Filenotfound to IOexception
		public static void main(String[] args) {
				try {
						UtilityClass.doSOmething();
				} catch (FileNotFoundException e) {
						e.printStackTrace();
				} catch (IOException e) {
						e.printStackTrace();
				} catch(Exception e){
						System.out.println("sdsd");
				} catch (Throwable e){
						System.out.println("throwable");
				}
		}
}
