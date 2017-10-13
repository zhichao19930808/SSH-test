package xin.zcglory.dao;

import xin.zcglory.entity.User;

public interface UserDao {
    void save(User user)throws Exception;

    void update(User user) throws Exception;

    void delete(User user)throws Exception;

    Object fingById(String id)throws Exception;
}
