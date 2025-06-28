package spring_25_problem_2B;

public class Book {
private String title;
private int isbn;
private Author a;

  public Book(String title,int isbn,Author a) {
	this.title=title;
	this.isbn=isbn;
	this.a=a;
  }

  public String toString() {
	  return "\nTitle:"+this.title+"\tISBN:"+this.isbn+"\nAuthor:"+this.a;
  }
}
