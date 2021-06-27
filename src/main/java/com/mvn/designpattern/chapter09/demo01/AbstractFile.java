package com.mvn.designpattern.chapter09.demo01;

/**
 * 1 抽象构建类  抽象文件
 */
public abstract class AbstractFile {

    public abstract void add(AbstractFile file);

    public abstract void remove(AbstractFile file);

    public abstract AbstractFile getChild(int i);

    public abstract void killVirus();

}