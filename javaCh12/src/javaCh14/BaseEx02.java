package javaCh14;

public class BaseEx02 {

	public static void main(String[] args) {
		Kimchi kim = new Kimchi();
		Thread t1 = new Thread(kim);
		t1.start();
		
		Chick chick=new Chick();
		chick.start();
		
		Pizz zz = new Pizz();
		Thread t2 = new Thread(zz);
		t1.start();
		
		Fruit f=new Fruit();
		f.start();

	}

}
