package ch17.p723;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex3 {

	public static void main(String[] args) {
		// �÷���, �迭->�������ν�ƺ->�߰���Ʈ��(��������)->������Ʈ��
		List<Student> list=new ArrayList<>();
		list.add(new Student("ȫ",10));
		list.add(new Student("��",20));
		list.add(new Student("��",30));
		
		List list1=Arrays.asList(new Student("ȫ",10),new Student("��",20)
		,new Student("��",30));
		
		//�������� ��Ʈ��
		Stream<Student> stream=list.stream();
		IntStream is=stream.mapToInt(s->s.getScores());
		OptionalDouble od=is.average();
		double avg=od.getAsDouble();
		
		System.out.println(avg);
		
		
		//�ڵ� ���̱�
		double avg1 = list.stream()//Student Ŭ������ ��ü������������ �������
				.mapToDouble(s->s.getScores())//10,20,30
				.average() //��� ����
				.getAsDouble(); //�⺻�� ����Ÿ������ �ٲ��ش�
		
		System.out.println(avg1);
		
		OptionalDouble avg2 = list.stream()
				.mapToDouble(s->s.getScores())
				.average(); 
				 
		System.out.println(avg2);
		
		
		
		
		double add = list.stream()
				.mapToDouble(s->s.getScores())
				.sum();		 
		System.out.println(add);
		
		Stream<Student> stream1= list1.stream();
		IntStream is1=stream1.mapToInt(s->s.getScores());
		OptionalInt oi1=is1.max();
		int max=oi1.getAsInt();
		System.out.println("�ִ밪"+max);
		
	}

}
