package spring_25_problem_1b;
import java.util.ArrayList;
public class Course {
	private int code;
    private double credit;
    ArrayList<Professor>proList=new ArrayList<>();
    
	public Course(int code,double credit) {
		this.code = code;
		this.credit=credit;
	}
	/// -----------Setter mand Getter Method------------
	public void setCode(int code) {
		this.code=code;
	}
	public void setCredit(double credit) {
		this.credit=credit;
	}
	
	public int getCode() {
		return this.code;
	}
	public double getCredit() {
		return this.credit;
	}
  /// ---------------- Setther and Getter Method End --------
  
	public void addProfessor(Professor p) {
		proList.add(p);
	}
	
	public void display() {
		 for(Professor p:proList) {
			 System.out.println(p);
		 }
	}
	
	public String toString() {
		return "Course code:"+this.code+"\tCredit:"+this.credit;
		}
}
