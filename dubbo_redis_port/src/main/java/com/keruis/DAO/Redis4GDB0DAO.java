package com.keruis.DAO;


import com.keruis.POJO.Keruis_Jedis;

/**
 * Created by Administrator on 2017/8/23.
 */
public interface Redis4GDB0DAO extends BaseDAO{
    Keruis_Jedis getJedis ();
}
