package org.tnsif.Literals;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIUsingLiteralsExecutors {
	
	public static void main(String[] args) {
	ApplicationContext b = new ClassPathXmlApplicationContext("Beans.xml");
	Employee e = (Employee)b.getBean("e1");
	e.print();
	
}
}