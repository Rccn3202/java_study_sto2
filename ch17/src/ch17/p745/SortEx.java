package ch17.p745;

import java.util.Arrays;
import java.util.List;

public class SortEx {

	public static void main(String[] args) {
		List<Student> sList = Arrays.asList(new Student("ȫ",30),new Student("��",10),new Student("��",20));
		sList.stream().sorted().forEach(s->System.out.println(s.getName()+" "+s.getScore()));
	
		System.out.println();
	List<Person> pList = Arrays.asList(
			new Person("��",true,10.9),
			new Person("��",true,20.9),
			new Person("��",false,30.9),
			new Person("��",true,40.9),
			new Person("��",false,50.9)
			);
	//�޿������� ����(Person Ŭ���� �ǵ帱 �� ����)
	pList.stream().sorted(new PersonComP()).forEach(p->System.out.println(p.getName()+" "+p.getPay()));
	
	System.out.println();
	
	//���ڸ� ����ϴµ� �޿� �������� ����ϱ�
	pList.stream().filter(s->s.isGentder())
	.sorted(new PersonComP())
	.forEach(p->System.out.println(p.getName()+" "+p.getPay()));
	
	//������ �޿��հ� ���
	pList.stream().filter(s->!s.isGentder())
	
	}
	

}
