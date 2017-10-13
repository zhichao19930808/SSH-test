package xin.zcglory.dao.imp;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import xin.zcglory.dao.UserDao;
import xin.zcglory.entity.User;
@Repository
public class UserDaoImp implements UserDao {
    @Autowired
    private SessionFactory factory;
    @Override
    public void save(User user) throws Exception {
        factory.getCurrentSession().save(user);
    }

    @Override
    public void update(User user) throws Exception {
        factory.getCurrentSession().update(user);
    }

    @Override
    public void delete(User user) throws Exception {
        factory.getCurrentSession().delete(user);
    }

    @Override
    public User fingById(String id) throws Exception {
        return (User) factory.getCurrentSession().get(User.class, id);
    }


}
