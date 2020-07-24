package test03;

import org.aspectj.lang.JoinPoint;

public class MyAdvice  {

	//JoinPoint 타깃객체에 대한 정보를 담고 있다
	// Spring AOP를 사용하기 위해서는 반드시 매개변수로 넣어줘야 하는 객체
	public void beforeM(JoinPoint joinPoint) {
		//클래스 명
		System.out.println(joinPoint.getTarget().getClass());
		
		//메소드 이름
		System.out.println(joinPoint.getSignature().getName());
		
		//대상 객체 메소드의 정보
		System.out.println(joinPoint);
		//메소드 매개 변수
		System.out.println(joinPoint.getArgs());
		System.out.println("출석카드를 찍는다.");
	}
	
	public void afterM(JoinPoint joinPoint) {
		System.out.println("집에 간다.");
	}
	
	
}
