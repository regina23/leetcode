package p11;

public class MinArray {
    public static int minArray(int[] numbers) {
        int start = 0;
        int end = numbers.length - 1;
        while(start < end) {
            int pivot = (start + end) / 2;
            if(numbers[pivot] > numbers[end]) {
                start = pivot + 1;
            } else if(numbers[pivot] < numbers[end]) {
                end = pivot;
            } else {
                end -= 1;
            }
        }
        return numbers[start];
    }

    public static void main(String[] args) {
        int[] testList = {3, 4, 5, 1, 2};
        int res = minArray(testList);
        System.out.println(res);
    }
} 