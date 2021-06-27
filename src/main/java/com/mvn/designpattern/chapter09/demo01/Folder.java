package com.mvn.designpattern.chapter09.demo01;

import java.util.ArrayList;

/**
 * 2 叶子构建类   图片文件
 */
public class Folder extends AbstractFile {

    /**
     * 定义fileList存储AbstractFile
     */
    private ArrayList<AbstractFile> fileList = new ArrayList<AbstractFile>();

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("----对文件夹----" + name + "----进行杀毒----");
        for (Object obj : fileList) {
            ((AbstractFile) obj).killVirus();
        }
    }

}