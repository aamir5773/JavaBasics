package com.lti.arraylistdemos;

public class Book {
	
	int bookId;
	String bookName;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	

	
	public Book(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}
	public Book() {
		super();
	}
	@Override
	public String toString() {
		return "\nBook [bookId=" + bookId + ", bookName=" + bookName + "]";
	}
	
	
	
	

}
