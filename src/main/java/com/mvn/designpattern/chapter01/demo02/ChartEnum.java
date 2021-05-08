package com.mvn.designpattern.chapter01.demo02;

public enum ChartEnum {

	HISTOGRAM("柱状图", "HISTOGRAM"), 
	PIE("饼状图", "PIE"), 
	LINE("线状图", "LINE");
	
	/** 名称 **/
	private String name;  
	
	/** 唯一编码 **/
    private String code;  
  
    private ChartEnum(String name, String code) {  
        this.name = name;  
        this.code = code;  
    }
    
    public static ChartEnum getChartEnumByCode(String code) {
    	for (ChartEnum enumObj : ChartEnum.values()) {
            if (enumObj.getCode() == code) {
                return enumObj;
            }
        }
        return null;
    }
    
    public static String getChartEnumNameByCode(String code) {
    	for (ChartEnum enumObj : ChartEnum.values()) {
            if (enumObj.getCode() == code) {
                return enumObj.getName();
            }
        }
        return null;
    }
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
}
