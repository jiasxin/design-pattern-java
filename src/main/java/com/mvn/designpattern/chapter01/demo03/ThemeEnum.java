package com.mvn.designpattern.chapter01.demo03;

/**
 * 主题枚举
 */
public enum ThemeEnum {

	BLUE("蓝色主题", "BLUE"), 
	RED("红色主题", "RED");
	
	/** 名称 **/
	public String name;  
	
	/** 唯一编码 **/
	public String code;  
    
    private ThemeEnum(String name, String code) {
		this.name = name;
		this.code = code;
	}

	public static ThemeEnum getThemeEnumByCode(String code) {
    	for (ThemeEnum enumObj : ThemeEnum.values()) {
            if (enumObj.getCode().equals(code.toUpperCase())) {
                return enumObj;
            }
        }
        return null;
    }
    
    public static String getThemeEnumNameByCode(String code) {
    	for (ThemeEnum enumObj : ThemeEnum.values()) {
            if (enumObj.getCode().equals(code.toUpperCase())) {
                return enumObj.getName();
            }
        }
        return null;
    }
	
	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}
	
}
