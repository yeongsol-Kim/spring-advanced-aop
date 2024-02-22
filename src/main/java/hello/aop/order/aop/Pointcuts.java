package hello.aop.order.aop;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {

    @Pointcut("execution(* hello.aop.order..*(..))")
    public void allOrder(){}; // Pointcut signature

    //클래스 이름 패턴이 *Service
    @Pointcut("execution(* *..*Service.*(..))")
    public void allService(){}; // Pointcut signature

    @Pointcut("allOrder() && allService()")
    public void orderAndService(){}
}
