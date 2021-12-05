package com.mvn.designpattern.chapter18.demo03;

/**
 * @author: jiasx
 * @date: 2021年9月12日0:00:29
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class LabelComponent extends Component {

    @Override
    public void update() {
        System.out.println("文本内容标签改变，显示+1");
    }

}
