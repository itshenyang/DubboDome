package com.keruis.server.DAO.DAOImp;

import com.keruis.DAO.Redis4GDB0DAO;
import com.keruis.POJO.Keruis_Jedis;
import com.keruis.server.init.Redis4GDB0Init;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/8/23.
 */
public class Redis4GDB0DAOImp implements Redis4GDB0DAO {
    @Autowired
    Redis4GDB0Init redis4GDB0Init;
    public Keruis_Jedis getJedis() {
        Keruis_Jedis keruis_jedis = new Keruis_Jedis();
        keruis_jedis.setJedis(redis4GDB0Init.getJedis());
        return keruis_jedis;
    }
}
