package javaHeight05.stack;

import java.util.Stack;

public class CarMain {

	public static void main(String[] args) {
		Stack<Car> park=new Stack<Car>();
		
		park.push(new Car("소나타"));
		park.push(new Car("벤츠"));
		park.push(new Car("그랜저"));
		park.push(new Car("티코"));
		park.push(new Car("k5"));
		
		while(! park.isEmpty()) { //coinbox가 비어있지 않으면
			Car car = park.pop();
			System.out.println("차 종류 :" +car.getCar());
			}
		

	}

}
