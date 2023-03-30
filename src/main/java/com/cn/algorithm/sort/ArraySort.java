package com.cn.algorithm.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author Mr.Liu
 * @email yxml2580@163.com
 * @createDate 2023/3/30 15:01
 * 输入整型数组和排序标识，对其元素按照升序或降序进行排序
 */
public class ArraySort {
    //描述
    //输入整型数组和排序标识，对其元素按照升序或降序进行排序
    //数据范围：
    //0≤val≤100000
    //输入描述：
    //第一行输入数组元素个数
    //第二行输入待排序的数组，每个数用空格隔开
    //第三行输入一个整数0或1 0 代表升序排序 1 代表降序排序
    //输出描述：
    //输出排好序的数字
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            //数组元素个数
            int count = scanner.nextInt();
            //存放数字的数组
            Integer[] ints = new Integer[count];
            for (int i = 0; i < ints.length; i++) {
                ints[i] = scanner.nextInt();
            }
            //一个整数0或1 0 代表升序排序，1 代表降序排序
            int flag = scanner.nextInt();
            if (flag == 0)
                Arrays.sort(ints, new Comparator<Integer>() {
                    public int compare(Integer desc, Integer asc) {
                        return desc - asc;
                    }
                });
            else
                Arrays.sort(ints, new Comparator<Integer>() {
                    public int compare(Integer desc, Integer asc) {
                        return asc - desc;
                    }
                });
            for (Integer item : ints) {
                System.out.print(item + " ");
            }
            break;
        }
        System.out.println();
    }
}
