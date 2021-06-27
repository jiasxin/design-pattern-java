package com.mvn.designpattern.chapter11.demo01;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 1 子系统类  文件保存类
 */
public class FileWriter {

    public void write(String encryptStr, String fileNameDes) {
        System.out.println("保存密文，写入文件");
        try {
            FileOutputStream outFS = new FileOutputStream(fileNameDes);
            outFS.write(encryptStr.getBytes());
            outFS.close();
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
        } catch (IOException e) {
            System.out.println("文件操作错误");
        }
    }

}