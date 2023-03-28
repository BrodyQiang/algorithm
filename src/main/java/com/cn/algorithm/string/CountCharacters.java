package com.cn.algorithm.string;

import java.util.Scanner;

/**
 * @author Mr.Liu
 * @email yxml2580@163.com
 * @createDate 2023/3/26 15:23
 *
 * 计算某字符出现次数
 */
public class CountCharacters {
    //描述
    //写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字符，然后输出输入字符串中该字符的出现次数。（不区分大小写字母）
    //数据范围：
    //1≤n≤1000
    //输入描述：
    //第一行输入一个由字母、数字和空格组成的字符串，第二行输入一个字符（保证该字符不为空格）。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //由字母、数字和空格组成的字符串(并转成大写)
        String str = scanner.nextLine().toUpperCase();
        //字符(并转成大写)
        String item = scanner.nextLine().toUpperCase();
        //将str中的str2字符串全部替换为 “” 生成新的字符串
        String s = str.replaceAll(item, "");
        //用str.length-s.length = 出现次数
        int count = str.length() - s.length();
        System.out.println(count);

        //优化后
        System.out.println((str.length() - str.replaceAll(item, "").length()));

    }
}
