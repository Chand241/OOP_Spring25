package Spring_25_Problem_3;
import java.util.ArrayList;
public class Customer {
private int id;
private String name;
private String location;

 public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

 ArrayList<Order>orderList = new ArrayList<>();

public Customer(int id,String name,String location) {
	this.id=id;
	this.name=name;
	this.location=location;
}

public void addOrder(Order o) {
	orderList.add(o);
}

public void viewOrder() {
	System.out.print("\nOrder ID List:");
	for(Order o:orderList) {
		System.out.print(o);
	}
}
}
