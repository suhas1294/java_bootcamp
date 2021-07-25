package test;

import java.util.ArrayList;
import java.util.List;

class Bookmark1{}
class Book1 extends Bookmark1{}
class Movie1 extends Bookmark1{}

public class GenericMethodRestriction {
		public static void agreegate(List<Bookmark1> list){
				list.add(new Bookmark1());
				list.add(new Movie1());
				list.add(new Book1());
		}
		
		public static void main(String[] args) {
				//agreegate(new ArrayList<Book1>());
				//agreegate(new ArrayList<Movie1>());
				agreegate(new ArrayList<Bookmark1>());
		}
}
