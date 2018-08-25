package com.Akhilesh.Book;
import java.util.*;

public class Test {
	public static void main(String[] args) throws PriceException {
		
		Set<Book> set = new HashSet<Book>();
		Book book = new Book();
		Book book1 = new Book();
		
		book.setAuthor("Dan Brown");
		book.setBookId(1);
		book.setBookName("The Lost Symbol");
		book.setPrice(4);
		
		book1.setAuthor("Dan Brown");
		book1.setBookId(2);
		book1.setBookName("The Da Vinci Code");
		book1.setPrice(5);
		
		set.add(book1);
		set.add(book);
		
		Iterator<Book> i= set.iterator();
		while(i.hasNext()) {
		Book book2 = i.next();
		try{
		if(book2.getPrice()<5){
			throw new PriceException();
		}
		System.out.println("Book Author: " +book2.getAuthor() +  " Book ID: " + book2.getBookId() + " Book Name: " +book2.getBookName() + " Book Price: " + book2.getPrice()); 
		}
		catch(PriceException e){
			System.out.println(e);
		}
	}
}
}
