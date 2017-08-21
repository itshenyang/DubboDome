package com.keruis.redisPool.test;

import com.keruis.redisPool.test.DAO.Redis258MDB0PoolDAO;
import com.keruis.redisPool.utils.L;
import org.apache.ibatis.annotations.Mapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import redis.clients.jedis.Jedis;

/**
 * Created by Administrator on 2017/8/21.
 */
@Controller
public class RedisTest {
    @Autowired
    Redis258MDB0PoolDAO redis258MDB0PoolDAO;

    @RequestMapping("test")
    public String test(){
        Jedis jedis =  redis258MDB0PoolDAO.getJedis();
        String string  =  jedis.hget("tokenuserid","10cd9e0d8971490392f2e141a1fd6bc6");
        L.f("============================>"+string);
        jedis.close();
        return "index";
    }

}
