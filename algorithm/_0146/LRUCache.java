package com.regina23.algorithm._0146;

public class LRUCache {
    public LRUCache(int capacity) {
        return;
    }

    public int get(int key) {
        return 0;
    }

    public void put(int key, int value) {
        return;
    }

    public static void main(String[] args) {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(2, 2); // 缓存是 {1=1, 2=2}
        lRUCache.put(1, 1); // 缓存是 {1=1}
        System.out.println(lRUCache.get(1));    // 返回 1
        lRUCache.put(3, 3); // 该操作会使得关键字 2 作废，缓存是 {1=1, 3=3}
        System.out.println(lRUCache.get(2));    // 返回 -1 (未找到)
        lRUCache.put(4, 4); // 该操作会使得关键字 1 作废，缓存是 {4=4, 3=3}
        System.out.println(lRUCache.get(1));    // 返回 -1 (未找到)
        System.out.println(lRUCache.get(3));    // 返回 3
        System.out.println(lRUCache.get(4));    // 返回 4
    }
}
