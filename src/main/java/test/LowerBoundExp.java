package test;

import java.util.ArrayList;
import java.util.List;

class BookMark{
		public void someMethod(List<? extends BookMark> list){
				//list.add(new Movie()); // NOT PERMITTED
		}
		
		public void someMethod2(List<? super BookMark> list){
				list.add(new Movie());
		}
		
		public void someMethod3(List<? super Drama> list){
				//list.add(new Movie());
		}
		
		public void someMethod4(List<? super Movie> list){
				list.add(new Drama());
		}
}
class Book extends BookMark{}
class Movie extends BookMark{}
class Drama extends Movie{}

public class LowerBoundExp {
		public static void main(String[] args) {
				BookMark bm = new BookMark();
				
				List<Book> books = new ArrayList<>();
				List<BookMark> bookMarkList = new ArrayList<>();
				List<Drama> dramaList = new ArrayList<>();
				List<Movie> movieList = new ArrayList<>();
				
				// someMethod
				bm.someMethod(books);
				bm.someMethod(movieList);
				bm.someMethod(dramaList);
				bm.someMethod(bookMarkList);
				//bm.someMethod(new ArrayList<Object>());
				
				// someMethod-2
				//bm.someMethod2(books);
				//bm.someMethod2(movieList);
				//bm.someMethod2(dramaList);
				//bm.someMethod2(bookMarkList);
				//
				//// someMethod-3
				//bm.someMethod3(books);
				//bm.someMethod3(movieList);
				//bm.someMethod3(dramaList);
				//bm.someMethod3(bookMarkList);
				
				// someMethod4
				Drama drama = new Drama();
				Movie movie = (Movie) drama;
				
				
		}
}
/*
what java docs says ?
can invoke methods that use class level type parameter only if arguments
is of lower-bounded type or one of its subtype

*/
