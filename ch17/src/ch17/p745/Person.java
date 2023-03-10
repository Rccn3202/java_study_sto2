package ch17.p745;

public class Person {

	private String name;
	private boolean gender;
	private double pay;
	
	public Person(String name, boolean gentder, double pay) {
		this.name = name;
		this.gender = gender;
		this.pay = pay;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGentder() {
		return gender;
	}
	public void setGentder(boolean gentder) {
		this.gender = gentder;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	
	
	
	
	
	
}
