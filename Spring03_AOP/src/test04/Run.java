package test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("test04/applicationContext.xml");

		Develop man = (Develop) factory.getBean("man");
		Develop woman = (Develop) factory.getBean("woman");
		
		System.out.println("여학생 입장");
		woman.classWork();
		
		System.out.println("=============== = = = = = ");
		System.out.println("남학생 입장");
		man.classWork();
		
	}
}
