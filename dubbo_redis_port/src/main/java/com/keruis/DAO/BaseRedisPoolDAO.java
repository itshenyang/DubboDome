package com.keruis.DAO;

import redis.clients.jedis.Jedis;

/**
 * Created by Administrator on 2017/8/21.
 */
public interface BaseRedisPoolDAO {

   Jedis getJedis();

}
