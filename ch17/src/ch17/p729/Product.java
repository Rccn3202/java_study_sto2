package ch17.p729;

public class Product {
private int pno;
private String name;
private String company;
private int price;
public int getPno() {
	return pno;
}
public void setPno(int pno) {
	this.pno = pno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public Product(int pno, String name, String company, int price) {
	super();
	this.pno = pno;
	this.name = name;
	this.company = company;
	this.price = price;
}
@Override
public String toString() {
	return new StringBuilder()
			.append("{")
			.append("pno:"+"pno"+", ")
			.append("name:"+"name"+", ")
			.append("company;"+"company"+", ")
			.append("price:"+"price")
			.append("}")
			.toString();
}




}
