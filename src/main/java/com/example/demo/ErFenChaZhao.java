package com.example.demo;

import java.util.Scanner;

public class ErFenChaZhao {
    /*
    *请实现无重复数字的升序数组的二分查找

     给定一个 元素升序的、无重复数字的整型数组 nums 和一个目标值 target ，
     写一个函数搜索 nums 中的 target，如果目标值存在返回下标（下标从 0 开始），否则返回 -1
    *数组初始化的两种方式:
        静态初始化：初始化时由程序员显式指定每个数组元素的初始值，有系统决定数组的长度--- int[] arr; arr= new int[] {}; 简化版：int[] arr = {};
        静态初始化需要先定义然后再初始化；
        动态初始化：初始化时由程序员指定数组的长度，由系统初始化每个数组元素的默认值--- int[] nums = new int[10];

    *
    * */
    public static void main(String[] args) {
        int[] arr = new int[]{-1,0,3,4,6,10,13,14};
        int targetindex = search(arr, 13);
        System.out.println(targetindex);
    }




    static int search(int[] nums, int target){
        int rightIndex = nums.length - 1;
        int leftIndex = 0;
        int targetIndex =0;
        boolean flag = false;
        for (int i = 0; i <nums.length ; i++) {
            // 如果中间的那个数=targert，直接返回中间这个数的下标；
            if (nums[(rightIndex-leftIndex) / 2] == target) {
                targetIndex = nums.length /2;
                flag = true;
                break;
            }
            // 如果中间这个数的值大于target的值
            if (nums[nums.length / 2] > target){
                rightIndex = nums.length /2;
            }
            // 如果中间这个数的值小于target的值
            if (nums[nums.length / 2] > target){
                leftIndex = nums.length /2;
            }

        }

        if (flag == true){
            return targetIndex;
        }else {
            return -1;
        }
    }
}
