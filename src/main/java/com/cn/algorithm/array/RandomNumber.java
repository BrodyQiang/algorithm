package com.cn.algorithm.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * @author Mr.Liu
 * @email yxml2580@163.com
 * @createDate 2023/3/26 15:32
 *
 *  明明的随机数
 */
public class RandomNumber {
    //明明生成了N个1到500之间的随机整数。请你删去其中重复的数字，即相同的数字只保留一个，把其余相同的数去掉，然后再把这些数从小到大排序，按照排好的顺序输出。
    //数据范围： 1≤n≤1000  ，输入的数字大小满足1≤val≤500
    //输入描述：
    //第一行先输入随机整数的个数 N 。 接下来的 N 行每行输入一个整数，代表明明生成的随机数。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            //随机数总数
            int num = scanner.nextInt();
//            可以用set集合的方式实现
//            HashSet<Integer> set = new HashSet<>();
//            for (int i = 0; i < num; i++) {
//                set.add(scanner.nextInt());
//            }
//            Stream<Integer> random = set.stream().sorted();
//            random.forEach(System.out::println); 
            int[] ints = new int[num];
            for (int i = 0; i < num; i++) {
                ints[i] = scanner.nextInt();
            }
            Arrays.sort(ints);
            //第一个元素不可能重复
            System.out.println(ints[0]);
            for (int i = 1; i < ints.length; i++) {
                if (ints[i] != ints[i-1])
                    System.out.println(ints[i]);
            }
        }
    }
}
