package com.jk.cxf;

import com.jk.entity.Book;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by lenovo on 2017/5/25.
 */
@WebService
public interface WSBookService {

    @WebMethod
    public List<Book> getList(String tname,Integer page,Integer pageSize);

    @WebMethod
    public Long getCount(String tname);

    @WebMethod
    public Boolean insertBook(Book book);

    @WebMethod
    public Boolean deleteById(Integer tid);

    @WebMethod
    public Boolean updateBookById(Book book);

    @WebMethod
    public Book getBookById(Integer id);


}
