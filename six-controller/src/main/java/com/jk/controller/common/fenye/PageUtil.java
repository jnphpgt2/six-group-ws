package com.jk.controller.common.fenye;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class PageUtil {
	
	public static void page(HttpServletRequest request,Integer cpage,Integer pageSize,Integer count,List list,String url){
		//×ÜÒ³Êý
		Integer totalPage = (count/pageSize)+(count%pageSize==0?0:1);
		
		//Ê×Ò³
		String first = "";
		//ÉÏÒ³
		String prev = "";
		//ÏÂÒ³
		String next = "";
		//Î²Ò³
		String last = "";
		
		if(cpage==1){
			first = "Ê×Ò³";
			prev = "ÉÏÒ³";
		}else{
			first = "<a href='"+request.getContextPath()+"/"+url+"cpage=1'>Ê×Ò³</a>";
			prev = "<a href='"+request.getContextPath()+"/"+url+"cpage="+(cpage-1)+"'>ÉÏÒ³</a>";
		}
		
		if(cpage.equals(totalPage)||totalPage==0){
			last = "Î²Ò³";
			next = "ÏÂÒ³";
		}else{
			next = "<a href='"+request.getContextPath()+"/"+url+"cpage="+(cpage+1)+"'>ÏÂÒ³</a>";
			last = "<a href='"+request.getContextPath()+"/"+url+"cpage="+(totalPage)+"'>Î²Ò³</a>";
		}
		
		request.setAttribute("list", list);
		request.setAttribute("cpage", cpage);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("page", first+" "+prev+" "+next+" "+last+" "+cpage+"/"+totalPage);
		
	}
	
}
