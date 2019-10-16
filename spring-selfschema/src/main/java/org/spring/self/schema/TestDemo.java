package org.spring.self.schema;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

public class TestDemo {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("application.xml");

        User user = (User) classPathXmlApplicationContext.getBean("user");
        System.out.println(user.getUserName());
        System.out.println(user.getEmail());
//        User user = User.class.newInstance();
//        Class clazz = TestDemo.class.getClassLoader().loadClass("User");
//        User user = (User) clazz.newInstance();

//        Class cls = Class.forName("org.spring.self.schema.User");
//        User user = (User) cls.newInstance();

//        user.setUserName("张三");
//        user.setEmail("zhangsan@163.com");
//        System.out.println(JSONObject.toJSONString(user));
    }
}
