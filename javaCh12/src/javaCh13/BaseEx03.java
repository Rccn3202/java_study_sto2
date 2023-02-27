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

interface Rentable<P>{	//제네릭
	P rent();
}

class Home{
	public void turnOnLight() {
		System.out.println("전등을 켭니다");
	}
}

class Car1 {
	void run() {
		System.out.println("자동차가 달린다");
	}
}

class HomeAgency implements Rentable<Home>{	//인터페이스는 P가 Home 이 된다
	@Override
	public Home rent() {
		// TODO Auto-generated method stub
		return new Home();
	}
	
class CarAgency implements Rentable<Car1>{	//P가 Car가 된다. 자동차가 rent 된다
	@Override
	public Car1 rent() {
		// TODO Auto-generated method stub
		return new Car1();
	}
}
	
}
