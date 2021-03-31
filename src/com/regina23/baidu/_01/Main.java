package com.regina23.baidu._01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String N = in.nextLine();
        int n = Integer.parseInt(N);
        String s = in.nextLine();
        String[] nums = s.split("");
        int step = 0;
        int start = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i].equals(nums[start])) {
                start = i;
                step++;
            } else {
                start += 1;
                step++;
            }
        }
        System.out.println(step);
    }

}