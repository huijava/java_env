package com.jikeh;

import com.jikeh.Service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    /**
     * 应用程序启动类：这里写
     * @param args
     */
    public static void main(String[] args) {
        // create and configure beans
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // retrieve configured instance
        UserService service = context.getBean("userService", UserService.class);

        // use configured instance
        service.getUserInfo();
    }
}
