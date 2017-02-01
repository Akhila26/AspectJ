package co.aspects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("co/aspects/context.xml");
		Camera c =context.getBean("camera",Camera.class);
		c.snap();
	}

}
