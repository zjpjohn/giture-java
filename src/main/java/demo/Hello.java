package demo;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhuang on 16/7/9.
 */
@Controller
@RequestMapping("/demo" +
        "")
public class Hello {
    private static final Logger logger = Logger.getLogger(Hello.class);
//    开始页面
    @RequestMapping("/start")
    public String start(){
        return "start";
    }
    //    个人页面
    @RequestMapping("/mine")
    public String mine(){
        return "mine";
    }
    //    注册页面
    @RequestMapping("/signup")
    public String signup(){
        return "signup";
    }
//    登录页面
    @RequestMapping("/signin")
    public String signin(){
        return "signin";
    }
//    锁屏页面
    @RequestMapping("/lockScreen")
    public String lockScreen(){
        return "lockScreen";
    }

}