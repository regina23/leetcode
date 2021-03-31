package com.regina23.baidu._03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] nm = in.nextLine().split(" ");
        double n = Integer.parseInt(nm[0]);
        double m = Integer.parseInt(nm[1]);
        String a[] = in.nextLine().split(" ");
        double res = 0.0;
        if(n <= m & n <= Integer.parseInt(a[0])) {
            res = 1.0;
        } else {
            res = 1 * 1 / 2.0 * m + Integer.parseInt(a[0]) / n ;
        }
        System.out.println(res);
    }
}
