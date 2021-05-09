package com.mvn.designpattern.chapter01.demo03;

import cn.hutool.setting.dialect.Props;

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

		Props props = new Props("config.properties");
		String themeCode = props.getStr("theme.code");
		ThemeEnum themeEnumByCode = ThemeEnum.getThemeEnumByCode(themeCode);

		Theme theme = null;
		theme = ThemeFactory.getTheme(themeEnumByCode);
		theme.display();

	}
	
}
