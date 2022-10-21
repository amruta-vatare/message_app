package com.bridgelabz.message_app.repository.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "GREETING_DATA")
public class GreetingData {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    public long id;

    @Column(name = "MESSAGE")
    public String msg;

    public GreetingData(String msg ){
        this.msg = msg;
    }

    public long getId() {
        return id;
    }
    public String getMsg() {
        return msg;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

}