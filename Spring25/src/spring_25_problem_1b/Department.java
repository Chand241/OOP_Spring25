package spring_25_problem_1b;
import java.util.ArrayList;
public class Department {
	private int depId;
    ArrayList<Professor>proList=new ArrayList<>();
    
	public Department(int depId) {
		this.depId = depId;
	}
	
   public void addProfessor(Professor p) {
	   proList.add(p);
   }
   //--------------- Setter Method ----------------------------
	public void setDepId(int depId) {
		this.depId=depId;
	}
	//-----------------Getter Method -------------------------
	public int getDepId() {
		return this.depId;
	}
	//---------------------------Setter & Getter end--------------------
	
	
	public void display() {
		for(Professor p:proList) {
			System.out.println(p);
		}
	}
	
	public String toString() {
		return "Dept ID:"+depId;
				
	}
}
