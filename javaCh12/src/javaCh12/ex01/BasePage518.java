package javaCh12.ex01;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Properties;

public class BasePage518 {

	public static void main(String[] args) {
		String osName=System.getProperty("os.name");
		String userName=System.getProperty("user.name");
		String userHome=System.getProperty("user.home");
		String javaHome=System.getProperty("java.home");
		String userDir=System.getProperty("user.dir");
		String jsversion=System.getProperty("java.specification.version");
		
		System.out.println("1"+osName+" 2"+userName+" 3"+userHome);
		System.out.println(" 4"+javaHome+" 5"+userDir+" 6"+jsversion);
		
		Properties pp =System.getProperties();
		
		boolean isOsname= pp.containsKey("os.name");
		System.out.println(isOsname);
		
		int ppsize=pp.size();
		System.out.println(ppsize);
		
		System.out.println();
		System.out.println();
		
		Collection<Object> ppV= pp.values();
		Iterator<Object> it=ppV.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
