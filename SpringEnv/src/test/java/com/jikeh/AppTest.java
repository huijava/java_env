package com.jikeh;

/**
 * Unit test for simple App.
 */

import com.jikeh.Service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Hello world!
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml"})
public class AppTest {

    @Autowired
    public UserService userService;

    @Test
    public void test() {
        userService.getUserInfo();
    }
}
