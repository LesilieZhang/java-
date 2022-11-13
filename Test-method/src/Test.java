import service.HelloService;
import service.Impl.Hello;
import service.Impl.Hellow;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


/**
 * @author ZhangYiAn
 * @version 1.0.0
 * @ClassName Test.java
 * @Description TODO
 * @createTime 2022年11月12日 20:33:00
 */
public class Test
{
        public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//              HelloService service=new Hello();
//              service.sayHello("张三");

                //使用反射机制执行sayHello方法，核心Method(类中的方法)
                HelloService service1=new Hello();
                //获取sayhello名称对应的Method对象
                Method method=HelloService.class.getMethod("sayHello", String.class);//method代表的是sayhello的方法
                /*通过method执行:invoke是method里的一个方法，表示执行方法的调用
                  1、object：执行这个对象的方法
                  2、Object... args：方法执行时的参数值（可变长度的参数）
                 */
                Object ret=method.invoke(service1,"李四");//表达的意识，执行它给的对象的sayhello方法，传的参数是李四

                HelloService service2=new Hellow();
                Object ret2=method.invoke(service2,"张三");
                //method指定了执行sayHello的方法，但是可以指定执行不同对象的sayHello方法。
                //执行service1或者service2的sayHello方法
        }
}
