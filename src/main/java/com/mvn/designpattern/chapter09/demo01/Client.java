package com.mvn.designpattern.chapter09.demo01;

/**
 * 测试组合模式
 */
public class Client {

	public static void main(String args[]) {

		AbstractFile file1,file2,file3,file4,file5,file6,folder1,folder2,folder3,folder4;
		
		folder1 = new Folder("我的资料");
		folder2 = new Folder("图像文件夹");
		folder3 = new Folder("文本文件夹");
		folder4 = new Folder("视频文件夹");

		file1 = new ImageFile("1.jpg");
		file2 = new ImageFile("2.gif");
		file3 = new TextFile("3.txt");
		file4 = new TextFile("4.doc");
		file5 = new VideoFile("5.rmvb");
		file6 = new VideoFile("6.mp4");

		folder2.add(file1);
		folder2.add(file2);

		folder3.add(file3);
		folder3.add(file4);

		folder4.add(file5);
		folder4.add(file6);

		folder1.add(folder2);
		folder1.add(folder3);
		folder1.add(folder4);
		
		folder1.killVirus();

	}

}