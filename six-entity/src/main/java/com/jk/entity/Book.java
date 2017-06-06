package com.jk.entity;

import java.io.Serializable;

/**
 * Created by Janan on 2017/6/5.
 */
public class Book implements Serializable {
    private Integer tid;
    private String tname;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }
}
