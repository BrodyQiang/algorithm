package com.cn.algorithm.string;

import java.util.Scanner;

/**
 * @author Mr.Liu
 * @email yxml2580@163.com
 * @createDate 2023/3/26 15:16
 * <p>
 * <p>
 * 字符串最后一个单词的长度
 */
public class LastWordLength {
    //描述
    //计算字符串最后一个单词的长度，单词以空格隔开，字符串长度小于5000。（注：字符串末尾不以空格为结尾）
    //输入描述：
    //输入一行，代表要计算的字符串，非空，长度小于5000。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //输入的句子
        String sentence = scanner.nextLine();
        //根据空格分隔单词
        String[] split = sentence.split(" ");
        //获取最后一个单词
        System.out.println(split[split.length - 1]);
        //获取String数组中最后的一个单词的长度
        System.out.println(split[split.length - 1].length());

    }
}
