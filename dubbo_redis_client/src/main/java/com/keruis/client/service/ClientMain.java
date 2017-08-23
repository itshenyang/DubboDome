package com.keruis.client.service;

import com.keruis.DAO.Redis4GDB0DAO;
import com.keruis.DAO.UserDAO;
import com.keruis.POJO.Keruis_Jedis;
import com.keruis.POJO.User;
import com.keruis.client.utils.L;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import redis.clients.jedis.Jedis;

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
        Redis4GDB0DAO redis4GDB0DAO = (Redis4GDB0DAO)context.getBean("Redis4GDB0DAOClient");
        Keruis_Jedis keruis_jedis = redis4GDB0DAO.getJedis();
        Jedis jedis = keruis_jedis.getJedis();
        String   string =  jedis.hget("real_time","1041");
        L.w(string);
        jedis.close();

    }

}
