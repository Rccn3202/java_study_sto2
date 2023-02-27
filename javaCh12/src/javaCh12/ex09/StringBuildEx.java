package javaCh12.ex09;

public class StringBuildEx {

	public static void main(String[] args) {
		String str = "";
		StringBuilder str1 = new StringBuilder();
		for(int i=1;i<=100;i++) {
			//str +=i;
			str1.append(i);
		}
		System.out.println(str1);

	}

}
