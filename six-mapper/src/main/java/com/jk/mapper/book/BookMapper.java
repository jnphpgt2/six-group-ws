package com.jk.mapper.book;

import com.jk.entity.Banner;
import com.jk.entity.Book;
import com.sun.javafx.image.IntPixelGetter;

import java.util.List;
import java.util.Map;

/**
 * Created by dell on 2017/5/24.
 */
public interface BookMapper {

    Long getCount(String tname);

    List<Book> getList(Map<String,Object> map);
}
