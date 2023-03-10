package javaHeight03;

public class Shop {
	private String custname;
	private String custPhone;
	private int point;
	
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCustPhone() {
		return custPhone;
	}
	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	public Shop(String custname, String custPhone, int point) {
		super();
		this.custname = custname;
		this.custPhone = custPhone;
		this.point = point;
	}
	@Override
	public int hashCode() {
		return custname.hashCode()+custPhone.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Shop) {
			Shop target = (Shop) obj;
			return target.custname.equals(this.custname) && target.custPhone==this.custPhone;
		}
		return false;
	}
	
	
	
}
