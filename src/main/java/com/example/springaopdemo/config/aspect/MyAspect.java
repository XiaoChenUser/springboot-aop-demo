package com.example.springaopdemo.config.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

//    /**
//     * 匹配所有类中的以 'To' 结尾的 public 方法
//     */
//    @Before("execution(public * *To(..))")
//    public void beforeAll() {
//        System.out.println("Before execution...");
//    }
//
//    /**
//     * 匹配 Waiter 中的所有方法，包括子类中重写（实现）的 Waiter 方法
//     */
//    @Before("execution(* com.example.springaopdemo.service.Waiter.*(..))")
//    public void beforeWaiter() {
//        System.out.println("Before Waiter...");
//    }
//
//
//    /**
//     * 匹配 Waiter 及其子类中的所有方法
//     */
//    @Before("execution(* com.example.springaopdemo.service.Waiter+.*(..))")
//    public void beforeSubWaiter() {
//        System.out.println("Before sub Waiter's method...");
//    }
//
//    /**
//     * 匹配 service 包下所有类的所有方法
//     */
//    @Before("execution(* com.example.springaopdemo.service.*.*(..))")
//    public void beforePackage() {
//        System.out.println("Before all methods of the package...");
//    }
//
//    /**
//     * 匹配 springaopdemo 包下及其子包下所有类的所有方法
//     */
//    @Before("execution(* com.example.springaopdemo..*(..))")
//    public void beforeSubPackage() {
//        System.out.println("Before all methods of the package and sub package...");
//    }
//
//    /**
//     * 匹配 example 包下及其子包下以 Naught 开头的所有类的所有方法
//     */
//    @Before("execution(* com.example..*.Naught*.*(..))")
//    public void beforePrefixClass() {
//        System.out.println("Before all methods of the prefix package...");
//    }
//
//    /**
//     * 匹配指定数量、类型、顺序的参数的所有方法
//     */
//    @Before("execution(* *(String, int))")
//    public void beforeFullArgs() {
//        System.out.println("Before method of full qualified args...");
//    }
//
//    /**
//     * 匹配第一参数是 String，第二个参数不定的方法
//     * 参数的类型除了 java.lang 包下的，都要写全类名
//     */
//    @Before("execution(* com.example..*(String, *))")
//    public void beforeHalfArgs() {
//        System.out.println("Before method of half qualified args...");
//    }
//
//    /**
//     * 匹配自定义类型 Person 及其子类作为参数的方法
//     */
//    @Before("execution(* *(com.example.springaopdemo.bean.Person))")
//    public void beforeSelfDefArgs() {
//        System.out.println("Before method of self defined args...");
//    }
//
//    @After("MyPointcut.suffixTo()")
//    public void pointcutAfter(){
//        System.out.println("After method suffix with to...");
//    }
//
    /**
     * 匹配限定类的限定方法
     * within() 只能限定类；
     * args() 不能单独使用
     */
    @Before("within(com.example.springaopdemo.service.*) && args(com.example.springaopdemo.bean.Person))")
    public void beforeWithArgs() {
        System.out.println("Before method of qualified class and args...");
    }

    /**
     * ①args()找到增强方法 beforeFullArgs()中同名参数的类型，分别为：String,int；
     * ②根据切点函数 execution(* *(..)) 及 args(String,int) 找到需要增强的 target method；
     * ③将 target 方法中第一个参数赋给 'client'，第二个参数赋给 'times'.
     * e.g NaiveWaiter.smile(String clientName, int times)[√] 和 NaughtyWaiter.joke(String clientName, String times)[×]
     * @param client
     * @param times
     */
    @Before(value = "execution(* *(..)) && args(client, times)")
    public void beforeFullArgs(String client, int times) {
        System.out.println("Before method of full qualified args...");
        System.out.println("clientNames:" + client + ",times:" + times);
    }
//
//    /**
//     * returning: 增强方法签名中的参数名，去绑定返回值为指定类型的目标方法
//     * @param money
//     */
//    @AfterReturning(value = "execution(* sold(..))", returning = "money")
//    public void afterReturn(JoinPoint joinPoint, Double money) {
//        System.out.println("Today, you have made " + money + " dollars");
//        System.out.println(joinPoint.getSignature().getName());
//    }
//
//    /**
//     * ex：增强方法签名中的参数名，去绑定抛出指定类型异常的目标方法
//     * @param ex
//     */
//    @AfterThrowing(value = "execution(* throwing(..))", throwing = "ex")
//    public void afterThrow(RuntimeException ex) {
//        System.out.println(ex.getMessage());
//        System.out.println("我只能处理 RuntimeException");
//        throw new RuntimeException("可以抛出自定义异常类型，用于在外层进行统一异常处理");
//    }
//
//    /**
//     * @Around 必须使用 proceedingJoinPoint.proceed() 显示调用目标方法，并返回结果
//     * @param joinPoint
//     * @return
//     */
//    @Around(value = "execution(* sold(..))")
//    public Object around(ProceedingJoinPoint joinPoint) {
//        Object result = null;
//        try {
//            result = joinPoint.proceed();
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }
//        return result;
//    }

    @Before(value = "execution(* com.example..*(clientName,times))", argNames = "clientName,times")
    public void beforeArgNames(String clientName, int times) {
        System.out.println("args:" + clientName + "," + times);
    }

}
