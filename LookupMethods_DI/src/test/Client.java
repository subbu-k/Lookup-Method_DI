package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bus;
import beans.Car;
import beans.Engine;
import beans.Truck;

public class Client {
	public static void main(String[] args) {
		String [] filepath= {"recources/Spring.xml"};///LookupMethods_DI/src/recources/Spring.xml
		ApplicationContext ap= new ClassPathXmlApplicationContext("recources/Spring.xml");
		Car c=(Car)ap.getBean("c1");
		System.out.println(c.getClass().getCanonicalName());
		System.out.println(c.myCarEngine().getName());
		System.out.println("================================");
		Bus b=(Bus)ap.getBean("ac");
		System.out.println(b.getClass().getCanonicalName());
		System.out.println(b.mybusEngine().getName());
		System.out.println("================================");
		Truck t=(Truck)ap.getBean("cc");
		System.out.println(t.getClass().getCanonicalName());
		System.out.println(t.myTruckEngine().getName());
	}
}
