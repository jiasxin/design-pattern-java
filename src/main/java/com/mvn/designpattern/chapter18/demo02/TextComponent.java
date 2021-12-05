package com.mvn.designpattern.chapter18.demo02;

/**
 * @author: jiasx
 * @date: 2021年9月11日17:58:16
 * @description: 7 文本框类， 充当具体同事类
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class TextComponent extends Component {

    @Override
    public void update() {
        System.out.println("客户信息增加成功后文本框清空");
    }

    public void setText(){
        System.out.println("文本框显示：小龙女");
    }

}
