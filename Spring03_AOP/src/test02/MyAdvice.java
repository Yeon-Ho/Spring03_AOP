package test02;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAdvice implements MethodInterceptor  {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		//target객체의 메소드가 반환하는 값을 받기 위한 변수
		Object target = null;
		
		System.out.println("출석카드를 찍는다.");
		
		try {
			target = invocation.proceed();
		}catch(Exception e) {
			System.out.println("쉬는 날이었다.");
		}finally {
			System.out.println("집에 간다.");
		}
		
		return target;
	}
	
	
}
