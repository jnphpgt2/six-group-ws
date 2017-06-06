package com.jk.entity;

/**
 * Created by dell on 2017/5/24.
 */
public class Banner {

    private Integer t_id;
    private String t_title;
    private String t_content;
    private String t_imgpath;
    private String t_linkurl;
    private Integer t_sort;
    private String t_note;

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public String getT_title() {
        return t_title;
    }

    public void setT_title(String t_title) {
        this.t_title = t_title;
    }

    public String getT_content() {
        return t_content;
    }

    public void setT_content(String t_content) {
        this.t_content = t_content;
    }

    public String getT_imgpath() {
        return t_imgpath;
    }

    public void setT_imgpath(String t_imgpath) {
        this.t_imgpath = t_imgpath;
    }

    public String getT_linkurl() {
        return t_linkurl;
    }

    public void setT_linkurl(String t_linkurl) {
        this.t_linkurl = t_linkurl;
    }

    public Integer getT_sort() {
        return t_sort;
    }

    public void setT_sort(Integer t_sort) {
        this.t_sort = t_sort;
    }

    public String getT_note() {
        return t_note;
    }

    public void setT_note(String t_note) {
        this.t_note = t_note;
    }

    @Override
    public String toString() {
        return "Banner{" +
                "t_id=" + t_id +
                ", t_title='" + t_title + '\'' +
                ", t_content='" + t_content + '\'' +
                ", t_imgpath='" + t_imgpath + '\'' +
                ", t_linkurl='" + t_linkurl + '\'' +
                ", t_sort=" + t_sort +
                ", t_note='" + t_note + '\'' +
                '}';
    }
}
