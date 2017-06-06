package com.jk.cxf;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.util.List;

/**
 * Created by lenovo on 2017/6/5.
 */
public class AuthInterceptor extends AbstractPhaseInterceptor<SoapMessage> {

    //由于AbstractPhaseInterceptor无无参数构造器，使用继承的方式，需要显示调用父类有参数的构造器
    public AuthInterceptor(){
        //super表示显示调用父类有参数的构造器
        //显示调用父类构造器之后，程序将不会隐式调用父类无参数的构造器
        super(Phase.PRE_INVOKE);//该拦截器将会调用之前拦截SOAP消息
    }

    //实现自己的拦截器时，需要实现handleMessage方法。
    //handleMessage方法中的形参就是被拦截到的Soap消息
    //一旦程序获取了SOAP消息，剩下的事情就可以解析SOAP消息或修改SOAP消息
    @Override
    public void handleMessage(SoapMessage message) throws Fault {

        //得到SOAP消息所有Header
        List<Header> headers=message.getHeaders();

        //如果没有Header
        if(headers==null||headers.size()<1){
            throw new Fault(new IllegalArgumentException("根本没有Header，不能调用"));
        }

        //假如要求第一个Header携带了用户名，密码信息
        Header firstHeader=headers.get(0);
        Element ele=(Element)firstHeader.getObject();

        NodeList userIds=ele.getElementsByTagName("userId");
        NodeList userPasses=ele.getElementsByTagName("userPass");

        if(userIds.getLength()!=1){
            throw new Fault(new IllegalArgumentException("用户名的格式不正确！"));
        }
        if(userPasses.getLength()!=1){
            throw new Fault(new IllegalArgumentException("密码的格式不正确！"));
        }

        //得到第一个userId元素里的文本内容，以该内容作为用户名字
        String userId=userIds.item(0).getTextContent();
        String userPass=userPasses.item(0).getTextContent();
        //实际项目中，应该去查询数据库，该用户名密码是否被授权调用web service
        if(!userId.equals("jnan") || !userPass.equals("root")){
            throw new Fault(new IllegalArgumentException("用户名密码不正确！"));
        }
    }
}
