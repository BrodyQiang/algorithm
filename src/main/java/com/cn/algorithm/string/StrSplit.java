package com.cn.algorithm.string;

import java.util.Scanner;

/**
 * @author Mr.Liu
 * @email yxml2580@163.com
 * @createDate 2023/3/26 15:56
 * 字符串分隔
 */
public class StrSplit {
    //描述
    //•输入一个字符串，请按长度为8拆分每个输入字符串并进行输出；
    //•长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
    //输入描述：
    //连续输入字符串(每个字符串长度小于等于100)
    //输出描述：
    //依次输出所有分割后的长度为8的新字符串
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            //获取字符串
            String str = scanner.nextLine();
            //输入字符串大于8时，递归截取前8位输入，直至小于8位时进入循环补0
            while (str.length() > 8) {
                System.out.println(str.substring(0, 8));
                str = str.substring(8);
            }
            //字符串小于8时直接跳到循环补0操作，补满至8位时打印输出
            while (str.length() < 8 && str.length() > 0) {
                str += "0";
            }
            //正好等于8位或为空字符串时，直接打印输出
            System.out.println(str);
        }

    }
}
