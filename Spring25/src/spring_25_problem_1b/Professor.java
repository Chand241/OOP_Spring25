package spring_25_problem_1b;
import java.util.ArrayList;

public class Professor {
	private int proId;
	
    ArrayList<Department>deptList=new ArrayList<>();
    ArrayList<Course>courseList=new ArrayList<>();
	
    public Professor(int proId) {
		this.proId =proId;
	}
   //---------------- Setter and Getter method -------------
    public void setPro(int proId) {
		this.proId=proId;
	}
	public int getProId() {
		return this.proId;
	}
    //------------Setter and Getter method end -----------------
	public String toString() {
		return "Professor ID:"+this.proId;
	}
	public void addDept(Department d) {
		deptList.add(d);
	}
	 public void addCourse(Course c) {
		 courseList.add(c);
	 }
	
	public void displayC() {
		for(Course c:courseList) {
			System.out.println(c);
		}
	}
	public void displayD() {
		for(Department d:deptList) {
			System.out.println(d);
		}
	}
	
}
