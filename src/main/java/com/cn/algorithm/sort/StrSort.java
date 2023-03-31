package com.cn.algorithm.sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Mr.Liu
 * @email yxml2580@163.com
 * @createDate 2023/3/31 13:49
 * 
 * 字符串排序
 */
public class StrSort {
    //描述
    //给定 n 个字符串，请对 n 个字符串按照字典序排列。
    //数据范围：
    //1≤len≤100
    //输入描述：
    //输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
    //输出描述：
    //数据输出n行，输出结果为按照字典序排列的字符串。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            //判断输入几个字符
            int count = scanner.nextInt();
            //定义一个数组 存放字符串
            String[] str = new String[count];
            for (int i = 0; i < str.length; i++) {
                //将nextLine改为next，后者不接受空格回车
                str[i] = scanner.next();
            }
            //进行排序
            Arrays.sort(str);
            for (String item : str) {
                System.out.println(item);
            }
        }
    }
}
