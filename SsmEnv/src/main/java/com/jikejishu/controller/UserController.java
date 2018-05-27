package com.jikejishu.controller;

import com.jikejishu.model.User;
import com.jikejishu.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
public class UserController {

	private static Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	/**
	 * 跳转到查询车票价格页面
	 */
    private static final String SHOWUSER="showUser";
    /**
     * 得到查询结果界面
     */
    private static final String GETUSER="getUser";
    /**
     * 404页面
     */
    private static final String EMPTY="empty";

    @Autowired
    private IUserService userService;

    /**
     * 跳转到查询车票价格界面
     * @return
     */
    @RequestMapping("/showUser")
	public String showPrice() {
		return SHOWUSER;

	}

    @RequestMapping("/getUser")
    public String getPrice(int id, HttpServletRequest request){
    	
    	//####效验前端传入参数是否为空开始
    	if(id <= 0){
    		LOGGER.error("getUser() id is invalid ");
    		request.setAttribute("error","id错误!");
    		return SHOWUSER;
    	}
    	User user = userService.getUserInfoById(id);
        if(user==null){
        	LOGGER.error("getUser() user is null ");
        	return EMPTY;
        }
    	
    	//传递用户信息到前端
    	request.setAttribute("id", user.getId());
    	request.setAttribute("name", user.getName());
    	request.setAttribute("gender", user.getGender());
    	request.setAttribute("age", user.getAge());
    	return GETUSER;
    }

}
