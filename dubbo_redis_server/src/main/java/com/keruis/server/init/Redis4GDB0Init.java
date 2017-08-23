package com.keruis.server.init;

import com.keruis.server.utils.L;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.Protocol;

/**
 * Created by Administrator on 2017/8/23.
 */
@Service
public class Redis4GDB0Init {
    private JedisPool jedisPool = getJedisPool();
    private final String host = "r-bp1ccc550a077d94.redis.rds.aliyuncs.com";
    private final String pwd = "So0pLi8y7M";


    public JedisPool getJedisPool() {
        L.w("=============================================================================================");
        L.w("=============================================================================================");
        L.w("=============================================================================================");
        L.w("============================================Redis4GDB0Init初始化=============================");
        L.w("=============================================================================================");
        L.w("=============================================================================================");
        L.w("=============================================================================================");

        JedisPoolConfig config = new JedisPoolConfig();
        //最大连接数, 应用自己评估，不要超过AliCloudDB for Redis每个实例最大的连接数
        config.setMaxIdle(20);
        config.setMinIdle(10);
        config.setMaxTotal(300);
        config.setMinEvictableIdleTimeMillis(1800000);
        config.setSoftMinEvictableIdleTimeMillis(1800000);
        config.setTestOnBorrow(true);
        JedisPool pool = new JedisPool(config, host, 6379, Protocol.DEFAULT_TIMEOUT, pwd);
        return pool;
    }

    public Jedis getJedis() {
        return jedisPool.getResource();
    }
}
