import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {12,43,5,4,56,4,5,453,453,42};
        System.out.println(Arrays.toString(bubblesort(arr)));

    }
    static int[] bubblesort(int[] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j= i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
