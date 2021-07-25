package test;

import java.util.ArrayList;
import java.util.List;

public class InvarianceTest {
		public static void go(List<Object> list){
				list.add("i can add anything");
				System.out.println(list);
		}
		public static void goWildCard(List<?> list){
				//list.add("i can add anything");
				System.out.println(list);
		}
		
		public static void main(String[] args) {
				// raw type example
				List list = new ArrayList();
				list.add(1);
				list.add(2);
				go(list);
				System.out.println(list);
				
				List<String> list2 = new ArrayList<>();
				list2.add("1");
				list2.add("2");
				//go(list2);
				
				List<Object> list3 = new ArrayList<>();
				list3.add("1");
				list3.add("2");
				go(list3);
		}
		
}
