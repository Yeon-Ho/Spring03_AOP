package test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("test03/applicationContext.xml");
		
		Develop woman = (Develop) factory.getBean("woman");
		Develop man = (Develop) factory.getBean("man");
		
		System.out.println("여학생 입장");
		woman.classWork();
		System.out.println(" - - - - - - - - -");
		System.out.println("남학생 입장");
		man.classWork();
		
		
	}
}
