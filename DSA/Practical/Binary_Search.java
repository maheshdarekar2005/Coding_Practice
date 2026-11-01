import java.util.Arrays;

public class Binary_Search {
    public static void main(String[] args) {
        Binary_Search b = new Binary_Search();
        int arr[] = {1,224,5,4,6,565,5,456,5,4};
        Arrays.sort(arr);
        System.out.println(b.binarysearch(arr, 2));
    }
    boolean binarysearch(int[] arr, int key){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(key == arr[mid]){
                return true;
            }
            else if(key < arr[mid]){
                right= mid-1;
            }
            else {
               left = mid+1;
            }
        }
        return false;
    }
}
