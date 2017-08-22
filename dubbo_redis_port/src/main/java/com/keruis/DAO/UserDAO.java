package com.keruis.DAO;

import com.keruis.POJO.User;

/**
 * Created by Administrator on 2017/8/22.
 */
public interface UserDAO  extends BaseDAO{
    User select(User s);
}
