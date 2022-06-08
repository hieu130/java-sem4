package fpt.aptech.t2009m1.entity;

import fpt.aptech.t2009m1.entity.base.BaseEntity;
import fpt.aptech.t2009m1.entity.myEnum.ProductStatus;

public class Account extends BaseEntity {
    private int id;
    private String username;
    private String password;
    private int status;

    public Account() {
    }

    public Account(int id, String username, String password, int status) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

//    public ProductStatus getStatus() {
//        return status;
//    }

    public void setStatus(int status) {
        this.status = status;
    }
}
