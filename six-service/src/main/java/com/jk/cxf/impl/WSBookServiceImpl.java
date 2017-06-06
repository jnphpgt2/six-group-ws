package com.jk.cxf.impl;

import com.jk.cxf.WSBookService;
import com.jk.entity.Book;
import com.jk.mapper.book.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2017/5/25.
 */
@WebService
public class WSBookServiceImpl implements WSBookService {

    @Autowired
    private BookMapper bookMapper;
    @Override
    public List<Book> getList(String tname, Integer page, Integer pageSize) {
        Map<String,Object> map=new HashMap<String, Object>();
        Integer totalCount=(page-1)*pageSize;
        map.put("tname",tname);
        map.put("offset",totalCount);
        map.put("limit",pageSize);
        List list = bookMapper.getList(map);
        return list;
    }

    @Override
    public Long getCount(String tname) {
        Long count=bookMapper.getCount(tname);
        return count;
    }

    @Override
    public Boolean insertBook(Book book) {
        return null;
    }

    @Override
    public Boolean deleteById(Integer tid) {
        return null;
    }

    @Override
    public Boolean updateBookById(Book book) {
        return null;
    }

    @Override
    public Book getBookById(Integer id) {
        return null;
    }
}
