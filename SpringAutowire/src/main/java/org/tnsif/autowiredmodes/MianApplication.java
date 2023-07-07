package org.tnsif.autowiredmodes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MianApplication {

	public static void main(String[] args) {
		ApplicationContext b = new ClassPathXmlApplicationContext("Beans.xml");
		TextEditor t = (TextEditor)b.getBean("text");
		t.print();
	}

}
