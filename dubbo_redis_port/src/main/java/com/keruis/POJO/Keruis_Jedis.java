package com.keruis.POJO;

import redis.clients.jedis.Jedis;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/8/23.
 */
public class Keruis_Jedis implements Serializable{
    private Jedis jedis;

    public Jedis getJedis() {
        return jedis;
    }

    public void setJedis(Jedis jedis) {
        this.jedis = jedis;
    }
}
