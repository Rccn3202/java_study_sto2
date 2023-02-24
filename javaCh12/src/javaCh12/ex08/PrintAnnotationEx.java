package javaCh12.ex08;

import java.lang.reflect.Method;

public class PrintAnnotationEx {

	public static void main(String[] args) {
		
		Method[] declaredMethods=Service.class.getDeclaredMethods();
		for(Method method : declaredMethods) {
			System.out.println(method);
			PrintAnnotation printAnnotation=method.getAnnotation(PrintAnnotation.class);
			
			printLine(printAnnotation);
		}
	}

	private static void printLine(PrintAnnotation printAnnotation) {
		if(printAnnotation !=null) {
			int number = printAnnotation.number();
			for(int i=0;i<number; i++) {
				String value=printAnnotation.value();
			}
			System.out.println();
		}
		
	}

}
