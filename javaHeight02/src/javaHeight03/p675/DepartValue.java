package javaHeight03.p675;

public class DepartValue {
//매장위치,판매실적
	
	private String in;
	private int sale;
	public DepartValue(String de, String in, int sale) {
		super();
		
		this.in = in;
		this.sale = sale;
	}
	
	public String getIn() {
		return in;
	}
	public void setIn(String in) {
		this.in = in;
	}
	public int getSale() {
		return sale;
	}
	public void setSale(int sale) {
		this.sale = sale;
	}
	
	
}
