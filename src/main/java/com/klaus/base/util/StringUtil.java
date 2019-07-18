package com.klaus.base.util;

/**
 * description:字符串相关工具类
 *
 * @author klaus
 * @date 2019/7/17 17:34
 */
public class StringUtil {

    /**
     * 按个数拆分字符串
     * @param str
     * @param chars
     * @return
     */
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
