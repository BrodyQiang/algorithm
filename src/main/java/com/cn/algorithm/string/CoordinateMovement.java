package com.cn.algorithm.string;

import java.util.Scanner;

/**
 * @author Mr.Liu
 * @email yxml2580@163.com
 * @createDate 2023/3/28 19:40
 * <p>
 * Coordinate movement
 * 坐标移动
 */
public class CoordinateMovement {
    //开发一个坐标计算工具， A表示向左移动，D表示向右移动，W表示向上移动，S表示向下移动。从（0,0）点开始移动，
    // 从输入字符串里面读取一些坐标，并将最终输入结果输出到输出文件里面。
    //输入：合法坐标为A(或者D或者W或者S) + 数字（两位以内）
    //坐标之间以;分隔。
    //非法坐标点需要进行丢弃。如AA10;  A1A;  $%$;  YAD; 等。
    //下面是一个简单的例子 如：
    //A10;S20;W10;D30;X;A1A;B10A11;;A10;
    //处理过程：
    //起点（0,0） A10=（-10,0） S20   =  (-10,-20)  W10  =  (-10,-10)  D30  =  (20,-10)
    //x =  无效  A1A   =  无效  B10A11   =  无效
    //一个空 不影响
    //A10  =  (10,-10)
    //结果 （10， -10）
    //数据范围：每组输入的字符串长度满足
    //输入描述：
    //一行字符串
    //输出描述：
    //最终坐标，以逗号分隔
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            //获取坐标字符串
            String str = scanner.nextLine();
            //根据;进行分隔
            String[] split = str.split(";");
            //设置初始坐标 x y
            int x = 0, y = 0;
            for (int i = 0; i < split.length; i++) {
                if (split[i].matches("[AWSD][0-9]{1,2}")) {
                    //坐标值
                    Integer num = Integer.valueOf(split[i].substring(1));
                    switch (split[i].charAt(0)) {
                        case 'W':
                            y += num;
                            break;
                        case 'S':
                            y -= num;
                            break;
                        case 'A':
                            x -= num;
                            break;
                        case 'D':
                            x += num;
                            break;
                    }

                }
            }
            //打印坐标
            System.out.println(x + "," + y);
        }
    }
}
