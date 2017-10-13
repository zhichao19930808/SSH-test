package xin.zcglory.service.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xin.zcglory.dao.UserDao;
import xin.zcglory.entity.User;
import xin.zcglory.service.UserService;
@Service
public class UserServiceImpl implements UserService {
    //引入各种dao
    @Autowired
    private SessionFactory factory;
    @Autowired
    private UserDao dao;

    @Override
    public void register(User user) throws Exception {
        factory.getCurrentSession().getTransaction().begin();
        dao.save(user);
        factory.getCurrentSession().getTransaction().commit();
    }
}
