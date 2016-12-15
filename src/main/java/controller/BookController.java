package controller;

import model.Book;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/12/15.
 */
@Controller
@RequestMapping("books")
public class BookController extends BaseController{

    @Autowired
    private SqlSession sqlSession;
//    Book book = new Book();

    @RequestMapping("query")
    private String query(){

        // 生成Book序列类实例，存入sqlSession
//        sqlSession.selectList("books.query");
        // 表示利用setAttribute方法抓取键值对，其中键为book，值为查询到的逐行记录
        session.setAttribute("book",sqlSession.selectList("books.query"));
        return "redirect:/home.jsp";
    }

    @RequestMapping("add")
    // 这里和注册一样，为啥需要参数？
    private String add(Book book){
        sqlSession.insert("books.add",book);
        return "redirect:/books/query";
    }

    @RequestMapping("remove/{id}")
    // 总是参数。。
    private String remove(@PathVariable int id){
        sqlSession.delete("books.remove",id);
        return "redirect:/books/query";
    }

    @RequestMapping("search/{id}")
    // 貌似还是跟参数有关？
    private String search(@PathVariable int id){
//        System.out.print(id);
        sqlSession.selectOne("books.search",id);
        session.setAttribute("booker",sqlSession.selectOne("books.search",id));
        return "redirect:/edit.jsp";
    }


    @RequestMapping("update")
    // 貌似还是跟参数有关？
    private String update(Book book){
        // 报错原因是bookname是double值？
        sqlSession.update("books.update",book);
        return "redirect:/books/query";
    }
}


/*参数的实质作用是填补SQL语句中的未定量#{}，所以search、remove等方法皆须引入id参数，进一步而言
对于一个SQL语句中的多个未定量的填补，必须构建序列化参数模型实例。*/
