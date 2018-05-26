import com.alibaba.fastjson.JSON;
import com.jikejishu.model.User;
import com.jikejishu.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 这是测试spring与mybatis的整合：
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class MyBatisTest {

	@Resource
	private IUserService userService;

	@Test
	public void getUserInfoById() {

		User user = userService.getUserInfoById(3);
		System.out.println(JSON.toJSONString(user));

	}
	@Test
	public void getUserInfo() {

		User user = userService.getUserInfo(1, 28);
		System.out.println(JSON.toJSONString(user));

	}

}
