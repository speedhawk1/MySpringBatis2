package model;

/**
 * Created by Administrator on 2016/12/15.
 */
public class Book {
    private Integer id;
    private String bookname;
    private String writer;

    public Book() {
    }

    public Book(Integer id, String bookname, String writer) {
        this.id = id;
        this.bookname = bookname;
        this.writer = writer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}
