package javaHeight03.p675;

import javaHeight03.p659.Tvalue;
//�μ� ���, �μ���
public class Dname {
	private String de;
	private DepartValue dv;
	public String getDe() {
		return de;
	}
	public void setDe(String de) {
		this.de = de;
	}
	public DepartValue getDv() {
		return dv;
	}
	public void setDv(DepartValue dv) {
		this.dv = dv;
	}
	public Dname(String de, DepartValue dv) {
		super();
		this.de = de;
		this.dv = dv;
	}
	
	
}
