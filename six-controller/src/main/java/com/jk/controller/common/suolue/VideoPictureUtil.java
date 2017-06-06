package com.jk.controller.common.suolue;

import java.io.File;
import java.util.List;

public class VideoPictureUtil {
	/**
	 * 获得视频缩略图，获取成功返回true，获取失败返回false
	 * @param ffmpegPath  是ffmpeg.exe存放的路径
	 * @param path   是视频文件的存放路径
	 * @param outImagePath 输出缩略图的保存路径
	 * @return
	 */
	public static boolean getVideoImage(String ffmpegPath,String path,String outImagePath) {
		File file = new File(path);
		if (!file.exists()) {//判断视频文件是否存在
			System.err.println("路径[" + path + "]对应的视频文件不存在!");
			return false;
		}
		//设置参数
		List<String> commands = new java.util.ArrayList<String>();
		commands.add(ffmpegPath);//这里设置ffmpeg.exe存放的路径
		commands.add("-i");//这里是设置要截取缩略图的视频的路径
		commands.add(path);
		commands.add("-y");//覆盖重名文件
		//commands.add("-f");//输出文件的格式
		//commands.add("image2");
		commands.add("-ss"); //这里设置的是要截取视频开始播放多少秒后的图，可以自己设置时间
		commands.add("50");
		//commands.add("-t");//设置从指定位置截取的秒数
		//commands.add("5");
		commands.add("-s");//这里设置输出图片的大小
		commands.add("160x160");
		//commands.add("-r");//设置每秒截取1帧
		//commands.add("1");
		//commands.add("-pix_fmt");//设置格式，目前效果不明
		//commands.add("rgb24");
		commands.add(outImagePath);//这里设置输出的截图的保存路径
		
		//ffmpeg -i test.asf -vframes 30 -y -f gif a.gif
	
		try {
		    //截取缩略图并保存	
			ProcessBuilder builder = new ProcessBuilder();
			builder.command(commands);
			builder.start();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	//测试类**************帅吧!!!
	public static void main(String[] args)throws Exception{
		//获取当前工程目录
		File directory = new File("."); 
		String root = directory.getCanonicalPath();
		//经过上面的两步root=d:/videoimage
		String ffmpegPath = root + "\\ffmpeg\\ffmpeg.exe";
		String path = root + "\\video\\gg_1.mp4";
		String outImagePath = root + "\\image\\22.jpg";
		System.out.println(getVideoImage(ffmpegPath,path,outImagePath));
		//执行了后，刷新一下工程，注意观察你的工程目录中的image文件夹里，和控制台打印内容，成功了吧，，，，，
	}
}
