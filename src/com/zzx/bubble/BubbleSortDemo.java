package com.zzx.bubble;

import java.util.Arrays;

/**
 * @ClassName BubbleSortDemo
 * @Description
 * @Author zhangzx
 * @Date 2019/6/27 17:07
 * Version 1.0
 **/
public class BubbleSortDemo {

    private void bubbleSort(int arr[]) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i ++) {
            for (int j = 0; j < arr.length - 1 - i; j ++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] sortNum = {12,33,28,86,15,62,9,38};
        BubbleSortDemo b = new BubbleSortDemo();
        b.bubbleSort(sortNum);
        System.out.println(Arrays.toString(sortNum));
    }
}
