package com.regina23.baidu._02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] np = in.nextLine().split(" ");
        int n = Integer.parseInt(np[0]);
        int p = Integer.parseInt(np[1]);
        String nums = in.nextLine();
        String[] a = nums.split(" ");
        Arrays.sort(a);
        double e = 0.0;
        for(int i = 1; i <= n; i++) {
            e += Integer.parseInt(a[i-1]) * (1 - (p/100.0));
        }
        for(int i = n+1; i <= 2 * n; i++) {
            e += Integer.parseInt(a[i-1]) * (p / 100.0);
        }
        System.out.println(Arrays.toString(a));



    }
}
