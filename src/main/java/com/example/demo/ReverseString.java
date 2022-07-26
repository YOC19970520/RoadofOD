package com.example.demo;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
    input();
    }
    static void input(){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            StringBuilder sb = new StringBuilder();
            sb.append(sc.next());
            System.out.println(sb.reverse());
        }
    }
    /*
    吃了StringBuilder之外,其他的解题思路为:
    1. 使用Stack(栈)的先进后出的特性
    2. 倒序遍历数组
    * */
}
