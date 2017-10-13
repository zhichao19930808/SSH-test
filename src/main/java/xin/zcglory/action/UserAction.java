package xin.zcglory.action;

import org.springframework.beans.factory.annotation.Autowired;
import xin.zcglory.entity.User;
import xin.zcglory.service.UserService;

//所有的action都已经托管给Spring，所以才能在里面自动装配
public class UserAction extends BaseAction{
    @Autowired
    private UserService userService;
    private User user;

    public String save() throws Exception {
        System.out.println(user.getName());
        userService.register(user);
        return null;
    }



    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {

        return user;
    }
}
