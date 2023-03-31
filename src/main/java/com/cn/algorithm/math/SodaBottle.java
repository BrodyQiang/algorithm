package com.cn.algorithm.math;

import java.util.Scanner;

/**
 * @author Mr.Liu
 * @email yxml2580@163.com
 * @createDate 2023/3/31 14:20
 *
 * 汽水瓶
 */
public class SodaBottle {
    //描述
    //某商店规定：三个空汽水瓶可以换一瓶汽水，允许向老板借空汽水瓶（但是必须要归还）。
    //小张 手上有n个空汽水瓶，她想知道自己最多可以喝到多少瓶汽水。
    //注意：本题存在多组输入。输入的 0 表示输入结束，并不用输出结果。
    //输入描述：
    //输入文件最多包含 10 组测试数据，每个数据占一行，仅包含一个正整数 n（ 1<=n<=100 ），表示小张手上的空汽水瓶数。n=0 表示输入结束，你的程序不应当处理这一行。
    //输出描述：
    //对于每组测试数据，输出一行，表示最多可以喝的汽水瓶数。如果一瓶也喝不到，输出0。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            //手中的空汽水瓶
            int count = scanner.nextInt();
            //输入的 0 表示输入结束，并不用输出结果。
            if (count == 0){
                break;
            }
            //最多可以喝到多少瓶汽水
            int maxBottle = 0;

            while (count != 0){
                //手中现在在手上的空瓶子 能换到几瓶汽水
                int sum = count / 3;
                maxBottle += sum;
                count = count % 3 + sum;
                if (count < 3 )
                    break;
            }

            if (count == 2)
                count += 1;
            System.out.println(maxBottle);
        }
    }
}
