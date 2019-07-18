package com.klaus.base;

import java.util.Arrays;

/**
 * description:输入一个字符串和一个字符长度，对该字符串进行分隔
 *
 * @author klaus
 * @date 2019/7/17 11:22
 */
public class SplitStringTest {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(paras("心胸狭隘的老板不值得跟",2)));
    }

    public static  String[] paras(String str, int chars) {
        int n = (str.length() + chars - 1) / chars;
        String ret[] = new String[n];
        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                ret[i] = str.substring(i * chars, (i + 1) * chars);
            } else {
                ret[i] = str.substring(i * chars);
            }
        }
        return ret;
    }

}
