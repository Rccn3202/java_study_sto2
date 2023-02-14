package javaHeight03;

public class Home {

	private String num; //ȣ��
	private int fam; //������
	private int elec; //�����뷮
	private int fee; //�������
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public int getFam() {
		return fam;
	}
	public void setFam(int fam) {
		this.fam = fam;
	}
	public int getElec() {
		return elec;
	}
	public void setElec(int elec) {
		this.elec = elec;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public Home(String num, int fam, int elec, int fee) {
		super();
		this.num = num;
		this.fam = fam;
		this.elec = elec;
		this.fee = fee;
	}
	@Override
	public int hashCode() {
		return num.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Home) {
			Home target = (Home) obj;
			return target.num.equals(this.num);
		}
		return false;
	}
	
}
