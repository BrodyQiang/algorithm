package com.cn.algorithm.string;

import java.util.Scanner;

/**
 * @author Mr.Liu
 * @email yxml2580@163.com
 * @createDate 2023/3/26 16:10\
 *
 * 进制转换
 */
public class HexadecimalChange {
    //写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。
    //输入描述：
    //输入一个十六进制的数值字符串。
    //输出描述：
    //输出该数值的十进制字符串。不同组的测试用例用\n隔开。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            //去掉了十六进制数的前缀 "0x"
            String s1 = str.substring(2);
            //将十六进制字符串 s1 转换为对应的十进制整数
            int a = Integer.valueOf(s1, 16);
            System.out.println(a);
        }
    }
}
