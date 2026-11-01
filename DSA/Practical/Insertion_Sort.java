import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr= {21,32,43,54,65,76,45,34,2,54,543};
        System.out.println(Arrays.toString(insertionsort(arr)));
    }
    static int[] insertionsort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}