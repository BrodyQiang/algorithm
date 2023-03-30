package com.cn.algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Mr.Liu
 * @email yxml2580@163.com
 * @createDate 2023/3/28 20:03\
 * 删除字符串中出现次数最少的字符
 */
public class DelLeastStr {
    //描述
    //实现删除字符串中出现次数最少的字符，若出现次数最少的字符有多个，则把出现次数最少的字符都删除。输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。
    //数据范围：输入的字符串长度满足
    //1≤n≤20  ，保证输入的字符串中仅出现小写字母
    //输入描述：
    //字符串只包含小写英文字母, 不考虑非法输入，输入的字符串长度小于等于20个字节。
    //输出描述：
    //删除字符串中出现次数最少的字符后的字符串。
    public static void main(String[] args) throws IOException {
        //Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = reader.readLine()) != null){
            System.out.println(del(str));
        }

    }
    /**
     * @author Mr.Liu
     * @date 2023/3/30 10:09
     * @param str 终端传的字符串
     * @return 删除最少的字符生成的新的字符串
     */
    public static String del(String str) {
        //使用map记录每个字母出现的次数
        HashMap<Character, Integer> map = new HashMap<>();
        for (char item : str.toCharArray()) {
            map.put(item, map.getOrDefault(item, 1) + 1);
        }
        //遍历找出最小的次数
        int min = Integer.MAX_VALUE;
        for (int value : map.values()) {
            min = Math.min(min,value);
        }
        //判断map中value是否是最小的 如果是最小的就不拼接
        StringBuilder result = new StringBuilder();
        for (char item : str.toCharArray()) {
            if (map.get(item) != min)
                result.append(item);
        }
        return result.toString();
    }
}
