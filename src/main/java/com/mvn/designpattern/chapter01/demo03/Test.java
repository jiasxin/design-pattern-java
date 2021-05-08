package com.mvn.designpattern.chapter01.demo03;

/**
 * 测试类
 * @describe 
 * 通过变更静态工厂参数就可以得到对应得图形
 * 
 * @date 2021年5月7日22:50:50
 * @author jiasx
 *
 */
public class Test {

	public static void main(String[] args) {
		
		Theme theme = null;
		theme = ThemeFactory.getTheme(ThemeEnum.BLUE);
		theme.display();
		theme = ThemeFactory.getTheme(ThemeEnum.RED);
		theme.display();
		
	}
	
}
