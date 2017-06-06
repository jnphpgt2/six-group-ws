package com.jk.controller.common.fenye;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class PageUtil {
	
	public static void page(HttpServletRequest request,Integer cpage,Integer pageSize,Integer count,List list,String url){
		//��ҳ��
		Integer totalPage = (count/pageSize)+(count%pageSize==0?0:1);
		
		//��ҳ
		String first = "";
		//��ҳ
		String prev = "";
		//��ҳ
		String next = "";
		//βҳ
		String last = "";
		
		if(cpage==1){
			first = "��ҳ";
			prev = "��ҳ";
		}else{
			first = "<a href='"+request.getContextPath()+"/"+url+"cpage=1'>��ҳ</a>";
			prev = "<a href='"+request.getContextPath()+"/"+url+"cpage="+(cpage-1)+"'>��ҳ</a>";
		}
		
		if(cpage.equals(totalPage)||totalPage==0){
			last = "βҳ";
			next = "��ҳ";
		}else{
			next = "<a href='"+request.getContextPath()+"/"+url+"cpage="+(cpage+1)+"'>��ҳ</a>";
			last = "<a href='"+request.getContextPath()+"/"+url+"cpage="+(totalPage)+"'>βҳ</a>";
		}
		
		request.setAttribute("list", list);
		request.setAttribute("cpage", cpage);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("page", first+" "+prev+" "+next+" "+last+" "+cpage+"/"+totalPage);
		
	}
	
}
