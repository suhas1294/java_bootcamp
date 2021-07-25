package _06_collections;

import java.util.Arrays;
import java.util.List;

public class SubListDemo {
		public static void main(String[] args) {
				List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7,8,9);
				List<Integer> mySublist = myList.subList(2, 6);
				System.out.println("mylist\t" + myList);
				System.out.println("mySublist\t" + mySublist);
				mySublist.set(0, 100);
				System.out.println("mylist (after changing sublist)\t" + myList);
		}
}
