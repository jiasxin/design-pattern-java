package com.mvn.designpattern.chapter01.demo03;

/**
 * 图 建造工厂
 */
public class ThemeFactory {

	/**
	 * 静态图形建造工厂
	 * @return 具体图形
	 */
	public static Theme getTheme(ThemeEnum ThemeEnum) {
		Theme Theme = null;
		if(ThemeEnum.BLUE.getCode().equals(ThemeEnum.getCode())) {
			Theme = new ThemeBlue();
		}else if(ThemeEnum.RED.getCode().equals(ThemeEnum.getCode())) {
			Theme = new ThemeRed();
		}
		return Theme;
	}
	
}
