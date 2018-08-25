package Book;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test extends Book {
	public Test() {
	 Book[] book = new Book[2];
		}
	

	public static void main(String[] args) {
		
		Set set = new HashSet();
		Iterator i= set.iterator();
		
		while(i.hasNext()) {
		set.add(book[i].setBookName());
		}
		
	}

}
