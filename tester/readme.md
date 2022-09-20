# 测试

#### 测试异步
1. 需要使用Spring异步任务支持，我们需要在配置类上添加`@EnableAsync`或是在SpringBoot的启动类上添加也可以。
2. 接着我们只需要在需要异步执行的方法上，添加`@Async`注解即可将此方法标记为异步，当此方法被调用时，会异步执行，也就是新开一个线程执行，不是在当前线程执行。
3. 使用 @Async 注释的方法可以返回 'void' 或 "Future" 类型，Future是一种用于接收任务执行结果的一种类型，我们会在Java并发编程中进行讲解，这里暂时不做介绍。
```java
    @Async
    public Future<String> test() {
        Thread.sleep(5000);
        return AsyncResult.forValue("test");
    }
```
4.  @Async异步方法默认使用Spring创建ThreadPoolTaskExecutor
5. 其中默认核心线程数为8, 默认最大队列和默认最大线程数都是Integer.MAX_VALUE. 创建新线程的条件是队列填满时, 而
这样的配置队列永远不会填满, 如果有@Async注解标注的方法长期占用线程(比如HTTP长连接等待获取结果),
在核心8个线程数占用满了之后, 新的调用就会进入队列, 外部表现为没有执行.

```properties
#核心线程数
spring.task.execution.pool.core-size=200
#最大线程数
spring.task.execution.pool.max-size=1000
#空闲线程保留时间
spring.task.execution.pool.keep-alive=3s
#队列容量
spring.task.execution.pool.queue-capacity=1000
#线程名称前缀
spring.task.execution.thread-name-prefix=test-thread-
```

#### Aspectj测试

##### 使用注解方式
1. 建立注解
```java
@Target({ ElementType.PARAMETER, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {
    public String title() default "";
}

```
2. 切面
```java
@Component
@Aspect
@Slf4j
public class LogAspect {

    @Before(value = "@annotation(alog)")
    public void berfore(Log alog){
        log.info("here is beforeLog");
        log.info(alog.title());
    }
}
```