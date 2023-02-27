package javaCh13;

import javaCh13.HomeAgency.CarAgency;

public class BaseEx03 {

	public static void main(String[] args) {
		HomeAgency homeAgency = new HomeAgency();
		Home home = homeAgency.rent();
		home.turnOnLight();
		
		CarAgency carAgency =new CarAgency();
		Car1 car1=carAgency.rent();
		car1.run();
	
		

	}

}

interface Rentable<P>{	//���׸�
	P rent();
}

class Home{
	public void turnOnLight() {
		System.out.println("������ �մϴ�");
	}
}

class Car1 {
	void run() {
		System.out.println("�ڵ����� �޸���");
	}
}

class HomeAgency implements Rentable<Home>{	//�������̽��� P�� Home �� �ȴ�
	@Override
	public Home rent() {
		// TODO Auto-generated method stub
		return new Home();
	}
	
class CarAgency implements Rentable<Car1>{	//P�� Car�� �ȴ�. �ڵ����� rent �ȴ�
	@Override
	public Car1 rent() {
		// TODO Auto-generated method stub
		return new Car1();
	}
}
	
}
