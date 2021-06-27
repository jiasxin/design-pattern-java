package com.mvn.designpattern.chapter09.demo01;

/**
 * 2 叶子构建类   文本文件
 */
public class VideoFile extends AbstractFile {

	private String name;

	public void setName(String name) {
		this.name = name;
	}
	
	public VideoFile(String name) {
		this.name = name;
	}

	@Override
	public void add(AbstractFile file) {
	   System.out.println("暂不支持");
	}

	@Override
	public void remove(AbstractFile file) {
		System.out.println("暂不支持");
	}

	@Override
	public AbstractFile getChild(int i) {
		System.out.println("暂不支持");
		return null;
	}

	@Override
	public void killVirus() {
		System.out.println("----对视频文件----" + name + "----进行杀毒----");
	}

}