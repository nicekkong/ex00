package com.nicekkong.domain;

import java.util.Date;

/**
 * Created by nicekkong on 2016. 1. 19..
 */
public class Member {

    private String userid;
    private String userpw;
    private String username;
    private String email;
    private Date regdate;
    private Date upddate;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public Date getUpddate() {
        return upddate;
    }

    public void setUpddate(Date upddate) {
        this.upddate = upddate;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpw() {
        return userpw;
    }

    public void setUserpw(String userpw) {
        this.userpw = userpw;
    }

    @Override
    public String toString() {

        return "Member{" +
                "userid='" + this.userid + '\'' +
                ", userpw='" + this.userpw + '\'' +
                ", username='" + this.username + '\'' +
                ", email='" + this.email + '\'' +
                ", regdate=" + this.regdate +
                ", upddate=" + this.upddate +
                '}';
    }
}
