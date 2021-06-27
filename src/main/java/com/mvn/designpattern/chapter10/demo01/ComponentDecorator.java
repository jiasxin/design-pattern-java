package com.mvn.designpattern.chapter10.demo01;

/**
 * 3 抽象装饰类    构建装饰类
 */
public class ComponentDecorator extends Component {

    private Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    public void display() {
        component.display();
    }

}