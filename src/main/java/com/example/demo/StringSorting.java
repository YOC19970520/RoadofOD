package com.example.demo;

import java.util.*;

public class StringSorting {
    public static void main(String[] args) {
        input();
    }
    static void input(){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();// 行数,多少个字符串
        String[] strings= new String[row];
        for (int i = 0; i < row; i++) {
            strings[i]=sc.next();
        }
        Arrays.sort(strings);
        for (String string : strings) {
            System.out.println(string);
        }
    }
    /*
    * 看似简单的题目，但是会犯上一个小失误，即输出少一个数据，并且是最后一次输入的字符串，而排序后的第一位是空;
    * 使用next代替nextLine,后者不接受空格回车
    * */
}
