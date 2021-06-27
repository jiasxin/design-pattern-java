package com.mvn.designpattern.chapter13.demo02;

/**
 * 2 具体主题角色
 */
public class DocumentDAO implements AbstractDocumentDAO {

    public Boolean deleteDocumentById(String documentId) {
        if (documentId.equalsIgnoreCase("D001")) {
            System.out.println("删除ID为" + documentId + "的文档成功");
            return true;
        } else {
            System.out.println("删除ID为" + documentId + "的文档失败");
            return false;
        }
    }

}