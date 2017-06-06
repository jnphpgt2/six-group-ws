package com.jk.controller.common.suolue;

import java.io.File;
import java.util.List;

/**
 * Created by lenovo on 2017/5/31.
 */
public class ThumPicUtil {

    public static void main(String[] args) {
        String mpath = "D:\\IDEAproject\\six-gradle-test\\six-controller\\src\\movies\\Tez Cadey - Seve - Radio Edit.mp4";
        String ipath = "D:\\IDEAproject\\six-gradle-test\\six-controller\\src\\images\\suoluetu.gif";

        String ffmpegPath = "D:\\IDEAproject\\six-gradle-test\\six-controller\\src\\ffmpeg\\ffmpeg.exe";

        File file = new File(mpath);
        if (!file.exists()) {//判断视频文件是否存在
            System.err.println("路径[" + mpath + "]对应的视频文件不存在!");
            return;
        }

        //设置参数
        List<String> commands = new java.util.ArrayList<String>();
        //这里设置ffmpeg.exe存放的路径
        commands.add(ffmpegPath);
        //这里是设置要截取缩略图的视频的路径
        commands.add("-i");
        commands.add(mpath);
        //覆盖重名文件
        commands.add("-y");
        //输出文件的格式
        commands.add("-f");
        commands.add("gif");
        //commands.add("image2");
        //这里设置的是要截取视频开始播放多少秒后的图，可以自己设置时间
        commands.add("-ss");
        commands.add("200");
        //设置从指定位置截取的秒数
        commands.add("-t");
        commands.add("5");
        //这里设置输出图片的大小
        commands.add("-s");
        commands.add("480x270");
        //为了生成gif，添加这个参数
        commands.add("-pix_fmt");
        commands.add("rgb24");
        //设置每秒截取1帧
        //commands.add("-r");
        //commands.add("10");
        //设置格式，目前效果不明
        //commands.add("-pix_fmt");
        //commands.add("rgb24");
        commands.add(ipath);//这里设置输出的截图的保存路径

        //ffmpeg -i test.asf -vframes 30 -y -f gif a.gif

        try {
            //截取缩略图并保存
            ProcessBuilder builder = new ProcessBuilder();
            builder.command(commands);
            builder.start();
            return;
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

    }
}
