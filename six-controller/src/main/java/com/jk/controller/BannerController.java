package com.jk.controller;

import com.jk.entity.Banner;
import com.jk.service.BannerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.io.File;
import java.util.List;

/**
 * Created by dell on 2017/5/24.
 */
@Controller
public class BannerController {

    @Resource
    private BannerService bannerService;

    @RequestMapping("test")
    public void test(){
        System.out.println(1);
        bannerService.test();
    }

    @RequestMapping("selectBannerMessageList")
    public ModelAndView selectBannerMessageList( ModelAndView mv){
        List<Banner> bannerList = bannerService.selectBannerMessageList();
        mv.addObject("bannerList",bannerList);
        mv.setViewName("../../index");
        return mv;
    }

    @RequestMapping("selectSuolue")
    public ModelAndView selectSuolue(ModelAndView mv){
        String slt= suolue();
        String sltpath="";
        String[] a=slt.split("\\\\");
        sltpath="../"+a[7]+"/"+a[8];
        mv.addObject("slt",sltpath);
        mv.setViewName("../../lianxi");
        return mv;
    }

    public String suolue(){
        String result="";
        String mpath = "D:\\IDEAproject\\six-gradle-test\\six-controller\\src\\main\\webapp\\movies\\Tez Cadey - Seve - Radio Edit.mp4";
        String ipath = "D:\\IDEAproject\\six-gradle-test\\six-controller\\src\\main\\webapp\\images\\suoluetu.gif";

        String ffmpegPath = "D:\\IDEAproject\\six-gradle-test\\six-controller\\src\\main\\webapp\\ffmpeg\\ffmpeg.exe";
        result=ipath;
        File file = new File(mpath);
        if (file.exists()) {//�ж���Ƶ�ļ��Ƿ����

                    //���ò���
                    List<String> commands = new java.util.ArrayList<String>();
                    //��������ffmpeg.exe��ŵ�·��
                    commands.add(ffmpegPath);
                    //����������Ҫ��ȡ����ͼ����Ƶ��·��
                    commands.add("-i");
                    commands.add(mpath);
                    //���������ļ�
                    commands.add("-y");
                    //����ļ��ĸ�ʽ
                    commands.add("-f");
                    commands.add("gif");
                    //commands.add("image2");
                    //�������õ���Ҫ��ȡ��Ƶ��ʼ���Ŷ�������ͼ�������Լ�����ʱ��
                    commands.add("-ss");
                    commands.add("200");
                    //���ô�ָ��λ�ý�ȡ������
                    commands.add("-t");
                    commands.add("5");
                    //�����������ͼƬ�Ĵ�С
                    commands.add("-s");
                    commands.add("480x270");
                    //Ϊ������gif������������
                    commands.add("-pix_fmt");
                    commands.add("rgb24");
                    //����ÿ���ȡ1֡
                    //commands.add("-r");
                    //commands.add("10");
                    //���ø�ʽ��ĿǰЧ������
                    //commands.add("-pix_fmt");
                    //commands.add("rgb24");
                    commands.add(ipath);//������������Ľ�ͼ�ı���·��

                    //ffmpeg -i test.asf -vframes 30 -y -f gif a.gif

                    try {
                        //��ȡ����ͼ������
                        ProcessBuilder builder = new ProcessBuilder();
                        builder.command(commands);
                        builder.start();
                       // return;
                    } catch (Exception e) {
                        e.printStackTrace();
                       // return;
                    }
        }else {
            result="·��[" + mpath + "]��Ӧ����Ƶ�ļ�������!";
        }
        return result;

    }
}
