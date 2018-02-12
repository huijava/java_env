package com.jikeh;

import com.jikeh.Service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // create and configure beans
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // retrieve configured instance
        UserService service = context.getBean("service", UserService.class);

        // use configured instance
        service.getUserInfo();
    }
}
