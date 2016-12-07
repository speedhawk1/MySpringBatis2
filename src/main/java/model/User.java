package model;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/12/7.
 */
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;

    User(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(Integer id, String username, String password){
        this.id=id;
        this.username=username;
        this.password=password;


    }
}
