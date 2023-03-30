package com.cn.algorithm.string;

import java.util.Scanner;

/**
 * @author Mr.Liu
 * @email yxml2580@163.com
 * @createDate 2023/3/30 15:57
 * 字符逆序
 */
public class StrReversal {
    //描述
    //将一个字符串str的内容颠倒过来，并输出。
    //数据范围：
    //1≤len(str)≤10000
    //输入描述：
    //输入一个字符串，可以有空格
    //输出描述：
    //输出逆序的字符串
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            //使用StringBuffer中的反转方法就行
            StringBuffer result = new StringBuffer(str);
            System.out.println(result.reverse().toString());
            break;
        }
    }
}
