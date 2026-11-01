import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {32,43,54,67,54,7,68,4,53,465,76,432,12};
        System.out.println(Arrays.toString(selectionsort(arr)));
    }
    static int[] selectionsort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min=arr[i];
            for(int j =i+1;j<arr.length;j++){
                if(arr[j]<min){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
}
