import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args) {
        int[] arr = {23,43,35,4,34,54,65,6,4,67,4,3,324,46};
        System.out.println(Arrays.toString(quicksort(arr, 0, arr.length-1)));
    }
    static int[] quicksort(int[] arr,int start,int end){
        if(start<end){
            int pivot_Correct_Index = findIndex(arr,start,end);
            quicksort(arr, start, pivot_Correct_Index-1);
            quicksort(arr, pivot_Correct_Index+1, end);
        }
        return arr;
    }
    static int findIndex(int[] arr,int start, int end){
        int pivot = end;
        int index= start-1;
        for(int i=start;i<end;i++){
            if(arr[i] < arr[pivot]){
                index++;
                swap(arr,index,i);
            }
        }
        index++;
        swap(arr,index,pivot);
        return index;
    }
    static void swap(int[] arr,int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp; 
    }
}
