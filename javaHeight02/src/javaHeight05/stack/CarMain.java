package javaHeight05.stack;

import java.util.Stack;

public class CarMain {

	public static void main(String[] args) {
		Stack<Car> park=new Stack<Car>();
		
		park.push(new Car("�ҳ�Ÿ"));
		park.push(new Car("����"));
		park.push(new Car("�׷���"));
		park.push(new Car("Ƽ��"));
		park.push(new Car("k5"));
		
		while(! park.isEmpty()) { //coinbox�� ������� ������
			Car car = park.pop();
			System.out.println("�� ���� :" +car.getCar());
			}
		

	}

}
