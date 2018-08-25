package Book;

public class Book {
		private int bookId;
		private String bookName;
		private int price;
		private String author;
		
		public int getBookId() {
			return bookId;
		}

		public void setBookId(int bookId) {
			this.bookId = bookId;
		}
		
		public int getprice() {
			return price;
		}
		
		public void setAge(int price) {
			this.price=price;
		}

		public String getBookName() {
			return bookName;
		}
		
		public void setEmployeeName(String bookName) {
			this.bookName= bookName;
		}
		
		public String getAuthor() {
			return author;
		}
		
		public void setAuthor(String author) {
			this.author= author;
		}
		public static void main()
		{
			Book[] book = new Book[5];			
		}
	}
