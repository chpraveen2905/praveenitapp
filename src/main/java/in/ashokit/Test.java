package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//1. creating the IoC Container and should give xml file as input
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("Spring-Beans.xml");
		
		//2. Get the object from IOC Container
		BillCollector bc = context.getBean("billCollector",BillCollector.class);
		bc.collectPayment(1400.00);
	}
}
