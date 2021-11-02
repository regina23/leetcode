package source;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {50, 10, 90, 30, 70, 40, 80, 60, 20};
        System.out.println("排序之前：");
        System.out.println(Arrays.toString(arr));
        heapSort(arr);
        System.out.println("排序之后：");
        System.out.println(Arrays.toString(arr));
    }


    /**
     * 堆排序
     */
    public static void heapSort(int[] arr) {
        // 构建一个大顶堆
        for(int i = arr.length / 2; i >= 0; i--) {
            heapAdjust(arr, i, arr.length);
        }

        // 逐步将最大值与末尾元素交换，再调整大顶堆
        for(int i = arr.length - 1; i > 0; i--) {
            swap(arr, 0, i);
            heapAdjust(arr, 0, i);
        }
    }

    /**
     * 构建堆的过程
     * @param arr 需要排序的数组
     * @param i 需要构建堆的根节点的序号
     * @param n 数组的长度
     */
    public static void heapAdjust(int[] arr, int i, int n) {
        int child;
        int father;
        for(father = arr[i]; leftChild(i) < n; i = child) {
            child = leftChild(i);
            // 如果左子树小于右子树，比较右子树和父节点
            if(child != n -1 && arr[child] < arr[child + 1]) {
                child++; // 序号增加，指向右子树
            }
            // 如果父节点小于孩子节点，则交换
            if(father < arr[child]) {
                arr[i] = arr[child];
            } else {
                break; // 大顶堆结构未被破坏，不需要调整
            }
        }
        arr[i] = father;
    }

    // 获取左孩子节点
    public static int leftChild(int i) {
        return 2 * i + 1;
    }

    // 交换元素位置
    public static  void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
