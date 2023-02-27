package javaCh13;

public class BaseEx02 {

	public static void main(String[] args) {
		Product<Tv, String> product1=new Product<Tv, String>();
		product1.setKind(new Tv());
		Tv tv1=product1.getKind();//return 타입은 tv
		System.out.println(tv1);
		
		product1.setModel("스마트TV");
		System.out.println(product1.getModel());
		
		//Tv 값이 500만원 이상이면 "차라리를 자동차를 산다"===>/Tv-K M-500
		Product<Tv,Integer> p2 = new Product<Tv,Integer>();
		p2.setKind(new Tv());
		p2.setModel(500);
		
		if(p2.getKind().toString().equals("Tv") && p2.getModel()>=500) {
			System.out.println("차라리 자동차 산다");
		}
		
		
		//k-1000이상이면 "난 조금 더 돈 모아서 M - 자동차를 살거야
		Product<Integer,Car> p3=new Product<Integer,Car>();
		p3.setKind(1000);
		p3.setModel( new Car() ) ;
		
		if(p3.getKind()>=1000) {
			System.out.println("난 좀 더 돈 모아서 "+p3.getModel()+ "살거야");
		}
		
		
	
		
		

	}

}

class Product<K, M> {
	
	private K kind;
	private M model;
	
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
}

class Tv{
@Override
	public String toString() {
		return "Tv";
	}
	
}

class Car {
	@Override
	public String toString() {
		return "Car";
	}
}