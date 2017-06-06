package com.jk.controller.common.suolue;

import java.io.File;
import java.util.List;

public class AVPictureUtil {
	/**
	 * 获得视频缩略图，获取成功返回true，获取失败返回false
	 * @param ffmpegPath  是ffmpeg.exe存放的路径
	 * @param path   是视频文件的存放路径
	 * @param outImagePath 输出缩略图的保存路径
	 * @return
	 */
	public static boolean getVideoImage(String ffmpegPath,String path,String outImagePath,String sbName) {
		File file = new File(path);
		if (!file.exists()) {//判断视频文件是否存在
			System.err.println("路径[" + path + "]对应的视频文件不存在!");
			return false;
		}
		//设置参数
		List<String> commands = new java.util.ArrayList<String>();
		commands.add(ffmpegPath);//这里设置ffmpeg.exe存放的路径
		commands.add("-i");//这里是设置要截取缩略图的视频的路径
		commands.add("video=" + sbName);
		commands.add("-f");//输出文件的格式
		commands.add("dshow");
		commands.add("-vcodec");//输出文件的格式
		commands.add("libx264");
		commands.add("wodelp1114444.mkv");
		//FaceTime HD Camera
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
		String sbName = "FaceTime HD Camera";
		String path = root + "\\video\\gg_1.mp4";
		String outImagePath = root + "\\image\\wodelp111.mkv";
		System.out.println(getVideoImage(ffmpegPath,path,outImagePath,sbName));
		//执行了后，刷新一下工程，注意观察你的工程目录中的image文件夹里，和控制台打印内容，成功了吧，，，，，
	}
}
