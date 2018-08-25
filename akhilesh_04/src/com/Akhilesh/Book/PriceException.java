package com.Akhilesh.Book;

public class PriceException extends Exception {

	PriceException() {
		super("The price should be more than 5 rupees.");
	}

}
