package spring_25_problem_2B;
import java.util.ArrayList;
public class Library {
ArrayList<Member>memberList=new ArrayList<>();
ArrayList<Book>bookList=new ArrayList<>();
	
public void addBook(Book b) {
	bookList.add(b);

}

public void addmember(Member m) {
	memberList.add(m);
}

public void viewBook() {
	for(Book b:bookList) {
		System.out.println(b);

	}
}
public void viewMember() {
	for(Member m:memberList) {
		System.out.println(m);
	}
}

///--------------Main class Start(Most connective class) ----------------------

public static void main(String [] args) {
	//------------Create object for all classes -----------
	
	 //create library
	Library l=new Library();  
	
	//create author
	Author chand=new Author("Chand");
	Author sakib=new Author("sakib");
	Author tamim=new Author("tamim");
	
	//create book
	Book book1=new Book("Bela Furaber age",100000001,chand);
	Book book2=new Book("How to tradding",100000002,sakib);
	Book book3=new Book("Earth is circle",100000003,tamim);
	
	//create member
	Member member1=new Member("241-15-001");
	Member member2=new Member("241-15-002");
	Member member3=new Member("241-15-003");
	Member member4=new Member("241-15-004");
	Member member5=new Member("241-15-005");
	
	
	//add book
	l.addBook(book1);
	l.addBook(book2);
	l.addBook(book3);
    
	//add member
	l.addmember(member1);
	l.addmember(member2);
	l.addmember(member3);
	l.addmember(member4);
	l.addmember(member5);
	
	//view book from library
    l.viewBook();
    
	//view member from library
    l.viewMember();
    
    
    //one member take multible book
    member1.addBook(book3);
    member1.addBook(book2);
    member1.viewBook();
  
}

}
