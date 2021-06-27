package com.mvn.designpattern.chapter17.demo01;

/**
 * 抽象迭代器
 */
public interface AbstractIterator {

    /**
     * 移动到下一个元素
     */
    public void next();

    /**
     * 判断是否为最后一个元素
     * @return
     */
    public boolean isLast();

    /**
     * 移动至上一个元素
     */
    public void previous();

    /**
     * 判断是否为第一个元素
     * @return
     */
    public boolean isFirst();

    /**
     * 获取下一个元素
     * @return
     */
    public Object getNextItem();

    /**
     * 获取上一个元素
     * @return
     */
    public Object getPreviousItem();

}