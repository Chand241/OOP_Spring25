package Spring_25_Problem_3;
import java.util.ArrayList;
public class Order {
	private int orderId;
	ArrayList<Product>productList=new ArrayList<>();

	public Order(int id) {
		this.orderId=id;
	}
	
	
	public String toString() {
		return " "+orderId;
	}
public void addProduct(Product p) {
	productList.add(p);
}

public void viewProduct() {
	System.out.println("\nOrder Id:"+orderId);
	for(Product p:productList) {
		System.out.println(p);
	}
}


///----------------main method --------------------

public static void main(String []args) {
	Customer c1=new Customer(101,"Chand","YKSG-2 Hall_DSC_Dhaka");
	
	
	Product product1=new Product(1,"Mobile",12000.54);
	Product product2=new Product(2,"headphone",820.3);
	Product product3=new Product(3,"Keyboard",2500.60);
	Product product4=new Product(4,"Mouse",420.0);
	
    Order order1=new Order(1);
	Order order2=new Order(2);
	Order order3=new Order(3);
	
	c1.addOrder(order1);
	c1.addOrder(order2);
	c1.addOrder(order3);

	order1.addProduct(product1);
	order1.addProduct(product2);
	order1.addProduct(product3);
	
	order2.addProduct(product1);
	order2.addProduct(product2);
	order2.addProduct(product4);
	
	order3.addProduct(product4);

	
	order1.viewProduct();
	order2.viewProduct();
	order3.viewProduct();
	
	c1.viewOrder();
}
}
