package Spring_25_Problem_3;

public class Product {
private int id;
private String name;
private double price;

public Product(int id,String name,double price) {
	this.id=id;
	this.name=name;
	this.price=price;
}

public String toString() {
	return "Product id:"+id+"\tProduct name:"+name+"\tPrice:"+price;
}
}
