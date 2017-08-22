package com.keruis.client.service;

import com.keruis.DAO.UserDAO;
import com.keruis.POJO.User;
import com.keruis.client.utils.L;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/8/22.
 */
public class ClientMain {
    public static void main(String[] strings)throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        UserDAO userDAO = (UserDAO) context.getBean("UserDAOClient");
        User user = new User();
        user.setName("啊哈");
        user.setAge(99L);
        user.setId(0L);
        User one = userDAO.select(user);
        L.w(one.toString());
    }

}
