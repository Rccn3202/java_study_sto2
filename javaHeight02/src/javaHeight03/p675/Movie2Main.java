package javaHeight03.p675;
//무비2 클래스에 바로 implemetns
import java.util.TreeSet;

public class Movie2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Movie2> movie2=new TreeSet<Movie2>();
		
		movie2.add(new Movie2("조커",12));
		movie2.add(new Movie2("알라딘",25));
		movie2.add(new Movie2("남산",11));
		movie2.add(new Movie2("극한직업",30));
		movie2.add(new Movie2("기생충",33));
		
	}

}
