package com.cn.algorithm.sort;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author Mr.Liu
 * @email yxml2580@163.com
 * @createDate 2023/3/30 16:11
 * 合并表记录
 */
public class MergeTable {
    //描述
    //数据表记录包含表索引index和数值value（int范围的正整数），请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照index值升序进行输出。
    //提示:
    //0 <= index <= 11111111
    //1 <= value <= 100000
    //输入描述：
    //先输入键值对的个数n（1 <= n <= 500）
    //接下来n行每行输入成对的index和value值，以空格隔开
    //输出描述：
    //输出合并后的键值对（多行）
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //以map的形式进行合并 TreeMap 有序的
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while (scanner.hasNext()){
            //输入键值对的个数n（1 <= n <= 500）
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                map.put(index, map.getOrDefault(index, 0) + value);
            }
            for (Integer index : map.keySet()) {
                System.out.println(index + " " + map.get(index));
            }
        }
    }
}
