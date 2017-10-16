package xin.zcglory.action;

import com.opensymphony.xwork2.ModelDriven;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import xin.zcglory.entity.User;
import xin.zcglory.service.UserService;
import xin.zcglory.utils.ApplicationContextUtil;
import xin.zcglory.utils.MailUtil;

import java.io.File;

//所有的action都已经托管给Spring，所以才能在里面自动装配
public class UserAction extends BaseAction implements ModelDriven<User>{
    @Autowired
    private UserService userService;
    private User user =new User();

    public String save() throws Exception {
        String remember= request.getParameter("remember");
        String cc = request.getParameter("cc"); //用户填写的验证码
        if (remember == null)return "register";
        if(!cc.equals(session.getAttribute("code")))return "register";
        System.out.println(user.getName());
        userService.register(user);
        return null;
    }
/*
    public String sendmail() throws Exception {

        ApplicationContextUtil.getContext().getBean(SessionFactory.class, "sessionFactory");

        String a = request.getParameter("a");
        String b = request.getParameter("b");
        String c = request.getParameter("c");
        File f = new File("C:\\Users\\Master.Xia\\Pictures\\0.gif");
        MailUtil.send(a, b, c,f, true);

        response.getWriter().print("success-send-mail");
        return null;
    }
*/
    @Override
    public User getModel() {
        return user;
    }
}
