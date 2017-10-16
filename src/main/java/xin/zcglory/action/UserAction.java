package xin.zcglory.action;

import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;
import xin.zcglory.entity.User;
import xin.zcglory.service.UserService;


//所有的action都已经托管给Spring，所以才能在里面自动装配
@ParentPackage("app-default")
public class UserAction extends BaseAction implements ModelDriven<User>{
    @Autowired
    private UserService userService;
    private User user =new User();

    public String signUp() throws Exception {
        String remember= request.getParameter("remember");
        String cc = request.getParameter("cc"); //用户填写的验证码
        if (remember == null) return "signUp";
        if(!cc.equals(session.getAttribute("code")))return "signUp";
        userService.register(user);
        return LOGIN;
    }

    @Override
    public User getModel() {
        return user;
    }
}
