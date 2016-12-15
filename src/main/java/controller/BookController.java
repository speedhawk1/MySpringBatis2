package controller;

import model.Book;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/15.
 */
@Controller
@RequestMapping("books")
public class BookController extends BaseController{

    @Autowired
    private SqlSession sqlSession;
    private List<Book> books = new ArrayList<>();
    Book book = new Book();

    @RequestMapping("query")
    private String query(){

        sqlSession.selectOne("books.query",books);
        session.setAttribute("book",books);
        return "redirect:/home.jsp";
    }

    @RequestMapping("add")
    private String add(){
        sqlSession.insert("book.add",book);
        return "redirect:/books/query";
    }

    @RequestMapping("remove")
    private String remove(){
        sqlSession.delete("book.remove");
        return "redirect:/books/query";
    }

    @RequestMapping("search/{id}")
    private String search(@PathVariable int id){
        sqlSession.selectOne("book.search");
        return "redirect:/edit.jsp";
    }


    @RequestMapping("update")
    private String update(){
        sqlSession.update("book.update");
        return "redirect:/books/query";
    }
}
