package test;

class Electronics{
		private String name;
		public String getName() {
				return this.name;
		}
		public void setName(String name) {
				this.name = name;
		}
		public Electronics(String name){this.name = name;}
		@Override
		public String toString() {
				return "Electronics{" +
								"name='" + name + '\'' +
								'}';
		}
}

class Phone extends Electronics{
		public Phone(String name) {
				super(name);
		}
		
		@Override
		public String toString() {
				return super.toString() + "from phone class";
		}
}
public class CastingExperiment {
		public static void main(String[] args) {
				Phone nokiaPhone = new Phone("nokia");
				Electronics e = nokiaPhone; // upcasting will implicitly happen
				System.out.println(e);
				
				/*Electronics electronics = new Electronics("oneplus");
				Phone phone = (Phone) electronics;
				System.out.println(phone);*/
				
				Electronics refObj = new Phone("motorolla");
				//System.out.println(((Electronics)refObj).getName());
				System.out.println(refObj.getName());
				
				Phone p = (Phone) new Electronics("logitech");
				System.out.println(p);
				
		}
		
}
