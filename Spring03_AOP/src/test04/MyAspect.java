package test04;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//해당 클래스가 Aspect 역할을 하게끔 만들어주는 어노테이션
@Aspect
public class MyAspect {

	//실행 순서
	// @Before > @After > @AfterReturning
	//	예외시 : @AfterThrowing
	
	
	//target 객체를 호출하기 전에
	// Before 어노테이션이 추가된 메서드 실행
	@Before("execution(public * *(..))")
	public void before(JoinPoint joinPoint) {
		System.out.println("출석카드를 찍는다.");
	}
	
	
	//target 객체가 예외를 반환한 뒤에 실행되는 메소드
	@AfterThrowing("execution(public * *(..))")
	public void throwing(JoinPoint joinPoint) {
		System.out.println("쉬는 날이었다.");
	}

	//Before , AfterThrowing , After와는 달리
	// 어노테이션에 pointcut과 결과를 반환받을 변수명
	// 두 가지를 지정해줘야 한다.
	//pointcut = "" , returning=""형태로
	//어노테이션을 작성해준다.
	@AfterReturning(pointcut="execution(public * *(..))", returning="returnVal")
	public void returning(JoinPoint joinPoint , Object returnVal) {
		System.out.println(returnVal + "공부 하는 날이었다.");
	
	}
	
	//타깃 객체의 메서드를 실행하고 , 결과값이 반환하기 직전에 실행됨
	// 즉 return 값을 가져오지 않는다.
	@After("execution(public * *(..))")
	public void after(JoinPoint joinPoint) {
		System.out.println("집에 간다.");
	}
	
	
	
}
