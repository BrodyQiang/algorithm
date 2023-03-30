package com.cn.algorithm.string;

import java.util.Scanner;

/**
 * @author Mr.Liu
 * @email yxml2580@163.com
 * @createDate 2023/3/28 20:03\
 * 整数与IP地址间的转换
 */
public class DataConversion {
    //原理：ip地址的每段可以看成是一个0-255的整数，把每段拆分成一个二进制形式组合起来，然后把这个二进制数转变成 一个长整数。
    //举例：一个ip地址为10.0.3.193
    //每段数字             相对应的二进制数
    //10                   00001010
    //0                    00000000
    //3                    00000011
    //193                  11000001
    //组合起来即为：00001010 00000000 00000011 11000001,转换为10进制数就是：167773121，即该IP地址转换后的数字就是它了。
    //数据范围：保证输入的是合法的 IP 序列
    //输入描述：
    //1 输入IP地址
    //2 输入10进制型的IP地址
    //输出描述：
    //1 输出转换成10进制的IP地址
    //2 输出转换后的IP地址
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            if (str.contains(".")){
                System.out.println(ipToNum(str));
            }else {
                System.out.println(numToIp(Long.parseLong(str)));
            }
        }

    }

    /**
     * @param ip
     * @return long ip转长整数
     * @author Mr.Liu
     * @date 2023/3/30 14:25
     */
    public static long ipToNum(String ip) {
        String[] ipItem = ip.split("\\.");
        //转换成二进制并进行拼接
        StringBuffer num = new StringBuffer();
        for (int i = 0; i < ipItem.length; i++) {
            //将String元素转换成int
            int item = Integer.parseInt(ipItem[i]);
            //将整数转换为8位二进制字符串，并在高位补零，返回格式化后的字符串。
            String nums = String.format("%8s", Integer.toBinaryString(item)).replace(" ", "0");
            num.append(nums);
        }
        return Long.parseLong(num.toString(), 2);
    }

    /**
     * @param num
     * @return 长整数转ip
     * @author Mr.Liu
     * @date 2023/3/30 14:41
     */
    public static String numToIp(long num) {
        //将整数转换为32位二进制字符串，并在高位补零，返回格式化后的字符串。
        String str = String.format("%32s", Long.toBinaryString(num)).replace(" ", "0");
        //存放ip的4个数值
        String[] ipItem = new String[4];
        for (int i = 0; i < ipItem.length; i++) {
            String item = str.substring(8 * i, 8 * i + 8);//每8位进行拆分一次
            ipItem[i] = Integer.toString(Integer.parseInt(item, 2));//转化成10进制
        }
        //将4个数值装换成ip
        return String.join(".", ipItem);
    }
}
