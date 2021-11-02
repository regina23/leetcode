package icof._04;

public class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        int row = 0; 
        int column = columns - 1;
        while (row < rows && column >= 0) {
            int num = matrix[row][column];
            if (num == target) {
                return true;
            }else if (num > target) {
                column--;
            }else {
                row++;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] testMatrix = {
            {1,   4,  7, 11, 15},
            {2,   5,  8, 12, 19},
            {3,   6,  9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}};
        int[] testTable = {5, 20};
        for (int test : testTable) {
            boolean res = solution.findNumberIn2DArray(testMatrix, test);
            System.out.println(res);
        }	
    }
}
