package spring_25_problem_2B;

import java.util.ArrayList;

public class Member {
private String id;
 ArrayList<Book>bookList=new ArrayList<>();
  
 
 public Member(String id) {
	this.id=id;
}
  public String toString()  {
	  return "Member id:"+this.id;
  }
  
  
  public void addBook(Book b) {
	  bookList.add(b);
  }
  public void viewBook() {
	  for(Book b:bookList) {
		  System.out.println(b);
	  }
  }
  
}
