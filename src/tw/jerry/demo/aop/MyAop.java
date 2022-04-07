package tw.jerry.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAop {
//	
//	@Before(value = "execution(* tw.jerry.demo.model.EnglishTeacher.*(..))")
//	public void runBefore() {
//		System.out.println("方法前驗證");
//	}
//	@After(value="execution(* tw.jerry.demo.model.EnglishTeacher.*(..))")
//	public void runAfter() {
//		System.out.println("方法後執行");
//	}
	@Around(value="execution(* tw.jerry.demo.model.EnglishTeacher.*(..))")
	public Object around(ProceedingJoinPoint joinpoint) throws Throwable {
		System.out.println("方法前驗證!!!");
		Object obj = joinpoint.proceed();
		System.out.println("方法後執行");
		return obj;
	}
}
