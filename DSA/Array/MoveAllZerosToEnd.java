import java.util.Arrays;

public class MoveAllZerosToEnd {
    /*
    *Question 1: Move All Zeros to the End*

Given an integer array, move all zeros to the end of the array while maintaining the relative order of 
all non-zero elements.

*Example 1:*
Input: [0, 1, 0, 3, 12]

Output: [1, 3, 12, 0, 0]

*Example 2:*
Input: [0, 0, 1]

Output: [1, 0, 0]

*Requirements:*
1. Do not use an additional array.
2. Maintain the relative order of non-zero elements.
3. Modify the original array (in-place).
4. Try to achieve O(n) time complexity and O(1) space complexity.
    */
   public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(moveAllZerosToEnd(arr)));
   }
   public static int[] moveAllZerosToEnd(int[] arr){
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
               int temp = arr[i];
               arr[i] = arr[index];
               arr[index] = temp;
               index++;
            }
        }
        return arr;
   }
}
