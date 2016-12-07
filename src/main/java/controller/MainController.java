package controller;

import model.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/12/6.
 */
@Controller
@RequestMapping("users")
public class MainController extends BaseController{

    @Autowired
    private SqlSession sqlSession;

    @RequestMapping("create")
    private String create(User user){

        sqlSession.insert("users.create", user);
        return "redirect:/index.jsp";

    }

    @RequestMapping("login")
    private String login(User user){
        user = sqlSession.selectOne("users.login",user);
        if (user != null) {
            user.setPassword(null);
            session.setAttribute("user",user);
            return "redirect:/home.jsp";
        }else{
            request.setAttribute("message","Invalid name or password.");
            return "/index.jsp";
        }
    }
    @RequestMapping("logout")
    private String logout(){
        session.invalidate();
         return "redirect:/index.jsp";
    }

//    public static void main(String[] args) {
//
//        System.out.println("OK");
//    }
}
