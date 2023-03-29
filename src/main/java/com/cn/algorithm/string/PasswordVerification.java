package com.cn.algorithm.string;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author Mr.Liu
 * @email yxml2580@163.com
 * @createDate 2023/3/28 20:03\
 * Password verification
 * 密码验证合格程序
 */
public class PasswordVerification {
    //密码要求:
    //1.长度超过8位
    //2.包括大小写字母.数字.其它符号,以上四种至少三种
    //3.不能有长度大于2的包含公共元素的子串重复 （注：其他符号不含空格或换行）
    //数据范围：输入的字符串长度满足
    //1≤n≤100
    //输入描述：
    //一组字符串。
    //输出描述：
    //如果符合要求输出：OK，否则输出NG
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            //获取密码
//            String passWord = scanner.nextLine();
//            //正则是否符合要求
//            /**
//             *  ^匹配字符串的开头
//             *  (?![\s\S]*([\w\W])\1{2}): 零宽度负向前瞻断言，匹配字符串中不包含长度大于2的重复子串。
//             *  (?=.*[A-Z])(?=.*[a-z])(?=.*\\d)|(?=.*[A-Z])(?=.*[a-z])(?=.*[^A-Za-z0-9])|(?=.*[A-Z])(?=.*\\d)(?=.*[^A-Za-z0-9])|(?=.*[a-z])(?=.*\d)(?=.*[^A-Za-z0-9]))
//             *  多个零宽度正向前瞻断言，匹配包含至少三种不同字符类型的字符串。该部分正则表达式包含四个分支，分别匹配包含大小写字母和数字、大小写字母和符号、大小写字母和数字、符号和数字的字符串。
//             *  [\w\W]{8,}匹配长度超过8位的任意字符。
//             *  $ 匹配字符串的结尾
//             */
////            String patternString =
////                    "^(?![\\s\\S]*([\\w\\W])\\1{2})" +
////                            "((?=.*[A-Z])(?=.*[a-z])(?=.*\\d)|(?=.*[A-Z])(?=.*[a-z])(?=.*[^A-Za-z0-9])|(?=.*[A-Z])" +
////                            "(?=.*\\d)(?=.*[^A-Za-z0-9])|(?=.*[a-z])(?=.*\\d)(?=.*[^A-Za-z0-9]))[\\w\\W]{8,}$";
//            String patternString = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)" +
//                    "(?=.*[~!@#$%^&*()_+`\\-={}\\[\\]\\\\|;:'\",<.>/?])" +
//                    "[a-zA-Z\\d~!@#$%^&*()_+`\\-={}\\[\\]\\\\|;:'\",<.>/?]{8,}" +
//                    "(?<!([a-zA-Z\\d~!@#$%^&*()_+`\\-={}\\[\\]\\\\|;:'\",<.>/?]{1,}).*?\\1)$";
//            if (Pattern.compile(patternString).matcher(passWord).matches()) {
//                System.out.println("OK");
//            } else System.out.println("NG");
//        }
//
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            //设置四种类型数据初始为空即false，有数据了就更改为true
            boolean[] flag = new boolean[4];
            char[] chars = input.toCharArray();
            // 第一个条件
            if (chars.length < 9) {
                System.out.println("NG");
                continue;
            }
            // 第二个条件
            for (int i = 0; i < chars.length; i++) {
                if ('A' <= chars[i] && chars[i] <= 'Z') {
                    flag[0] = true;
                } else if ('a' <= chars[i] && chars[i] <= 'z') {
                    flag[1] = true;
                } else if ('0' <= chars[i] && chars[i] <= '9') {
                    flag[2] = true;
                } else {
                    flag[3] = true;
                }
            }
            int count = 0;
            for (int i = 0; i < 4; i++) {
                if (flag[i]) {
                    count++;
                }
            }
            // 第三个条件
            boolean sign = true;        //不存在两个大于2的子串相同，即！（i=i+3,i+1=i+4,i+2=i+5） 021@1bc9@bc1 021Abc9000
            for (int i = 0; i < chars.length - 5; i++) {
                for (int j = i + 3; j < chars.length - 2; j++) {
                    if (chars[i] == chars[j] && chars[i + 1] == chars[j + 1] && chars[i + 2] == chars[j + 2]) {
                        sign = false;
                    }
                }
            }
            if (count >= 3 && sign) {
                System.out.println("OK");
            } else {
                System.out.println("NG");
            }
        }

    }
}
