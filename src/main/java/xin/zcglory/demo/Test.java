package xin.zcglory.demo;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/*
检测hibernate环境
 */
public class Test {
    public static void main(String[] args) {
        //spring的容器对象
        ApplicationContext atx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Configuration cfg = new Configuration().configure();
        SessionFactory factory = cfg.buildSessionFactory();

        factory.close();
    }
}
