package javaHeight05.stack;

import java.util.Stack;

public class StackEx09 {

	public static void main(String[] args) {
		Stack<Coin> coinbox=new Stack<Coin>();
		
		coinbox.push(new Coin(100));
		coinbox.push(new Coin(50));
		coinbox.push(new Coin(500));
		coinbox.push(new Coin(10));
		
		System.out.println(coinbox.pop().getValue()); //10
		System.out.println(coinbox.pop().getValue()); //500
		
		while(! coinbox.isEmpty()) { //coinbox�� ������� ������
		Coin coin = coinbox.pop();
		System.out.println("������ ���� :" +coin.getValue());
		}

	}

}
