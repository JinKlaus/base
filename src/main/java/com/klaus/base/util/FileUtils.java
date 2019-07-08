package com.klaus.base.util;

import java.io.*;

/**
 * description:
 *
 * @author klaus
 * @date 2019/7/3 11:35
 */
public class FileUtils {


    /**
     * 拷贝两个文本的内容(仅限于非中文字符因为FileWriter和FileReader不能识别中文字符。)
     *
     * @param sourceFile //原文件地址
     * @param targetFile //目标文件地址
     */
    public static void copyFile1(String sourceFile, String targetFile) {
        //创建对象
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(sourceFile);
            fw = new FileWriter(targetFile);
//		    循环读和循环写
            int len;
            while ((len = fr.read()) != -1) {
                fw.write(len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 拷贝两个文本的内容(适用于中文字符)
     *
     * @param sourceFile //原文件地址
     * @param targetFile //目标文件地址
     */
    public static void copyFile2(String sourceFile, String targetFile) {
        FileInputStream fis;
        FileOutputStream fos;
        BufferedReader br;
        BufferedWriter bw;
        try {
            fis = new FileInputStream(sourceFile);
            InputStreamReader isr = new InputStreamReader(fis, "GB2312");
            br = new BufferedReader(isr);
            fos = new FileOutputStream(targetFile);
            OutputStreamWriter osw = new OutputStreamWriter(fos, "GB2312");
            bw = new BufferedWriter(osw);
            int i;
            while ((i = br.read()) != -1) {
                bw.write(i);
            }
            bw.close();
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

