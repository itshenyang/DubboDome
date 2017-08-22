package com.keruis.server.DAO.DAOImp;

import com.keruis.DAO.UserDAO;
import com.keruis.POJO.User;

/**
 * Created by Administrator on 2017/8/22.
 */
public class UserDAOImp implements UserDAO {

    public User select(User s) {
        s.setName("我是谁啊！");
        s.setAge(120L);
        s.setId(1L);
        return s;
    }
}
