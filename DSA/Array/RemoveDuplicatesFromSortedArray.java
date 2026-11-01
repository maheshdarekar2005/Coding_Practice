public class RemoveDuplicatesFromSortedArray {
    /*
    *Question 2: Remove Duplicates from Sorted Array*

Given a sorted integer array, remove duplicate elements in-place so that each element appears only once.

Return the number of unique elements.

*Example 1:*
Input: [1, 1, 2, 2, 3, 3, 4]

Output: [1, 2, 3, 4]

Return: 4

*Example 2:*
Input: [0, 0, 1, 1, 2, 2, 3]

Output: [0, 1, 2, 3]

Return: 4

*Requirements:*
1. The input array will be sorted.
2. Do not use an additional array or collection.
3. Modify the original array (in-place).
4. Try to achieve O(n) time complexity and O(1) space complexity.
    */
   public static void main(String[] args) {
        int arr[] = {0, 0, 1, 1, 2, 2, 3, 4, 4, 4, 4, 4, 4, 4, 4};
        System.out.println("Total unique elements in the array are = " + removeDuplicatesFromSortedArray(arr));
   }
   public static int removeDuplicatesFromSortedArray(int[] arr){
        int index=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[index-1]){
                arr[index]=arr[i];
                index++;
            }
        }
        return index;
   }
}
