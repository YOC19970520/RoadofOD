package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        /*
        * 分班：
        * 幼儿园两个班的小朋友在排队时混在了一起，每位小朋友都知道是否与前面的
        * 一位小朋友是否同班，请你帮忙把同班的小朋友找出来。
        *
        * 小朋友的编号为整数，与前一位小朋友同伴用Y表示，不同班用N表示
        *
        * 输入描述：
        * 输出描述：
        *
        * 示例1：
        * 输入
        * 输出
        * 比如： 6/N 2/Y 3/N 4/Y 表示4位小朋友，2和6同伴，3和2不同班，4和3同班。
        * 其中，小朋友的总数不超过999，每个小朋友的编号大于0，小于等于999
        *
        * 不考虑输入格式错误的问题。
        * 输出为两行，每一行记录一个班小朋友的编号，编号用空格分开
        * 且：
        * 1. 编号需要按照大小升序排列，分班记录中第一个编号小的排在第一行
        * 2. 若只有一个班的小朋友，第二行输出为空行
        * 3. 若输入不符合要求，则直接输出字符串ERROR
        * １/N 2/Y 3/N 4/Y
        * 1 2
        * 3 4
        * */
        Scanner scanner = new Scanner(System.in);
        List students = new ArrayList<>();
        while (scanner.hasNext()){
            String student = scanner.next();
            students.add(student);
        }

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }

    static String print(List list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        return null;
    }
}
