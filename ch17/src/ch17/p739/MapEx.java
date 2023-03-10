package ch17.p739;

import java.util.ArrayList;
import java.util.List;

public class MapEx {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("ȫ1",85,2.5));
		list.add(new Student("ȫ2",92,1.5));
		list.add(new Student("ȫ3",87,0.5));
		
		list.stream().mapToInt(s->s.getScore()).forEach(score->System.out.println(score));
		list.stream().mapToDouble(ss->ss.getEyes()).forEach(eyes->System.out.println(eyes));
		list.stream().map(s->s.getName()).forEach(name->System.out.println(name));
	}

}
