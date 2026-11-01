import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr = {12,3,4,32,34,5,34,4,6,34,56,56,354};
        System.out.println(Arrays.toString(mergersort(arr, 0, arr.length-1)));
    }
    static int[] mergersort(int[] arr,int start, int end){
        if(start<end){
            int mid = (start+end)/2;
            mergersort(arr, start, mid);
            mergersort(arr, mid+1, end);
            finalmerger(arr, start, mid, end);
        }
        return arr;
    }
    static void finalmerger(int[] arr,int start,int mid,int end){
        int i= start;
        int j= mid+1;
        int temparr[] = new int[arr.length];
        int indextemp = start;

        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temparr[indextemp++] = arr[i++];
            }
            else {
                temparr[indextemp++] = arr[j++];
            }
        }
        while(i<=mid){
            temparr[indextemp++] = arr[i++];
        }
        while(j<=end){
            temparr[indextemp++] = arr[j++];
        }
        // copy to original array
        for(i=start;i<=end;i++){
            arr[i] = temparr[i];
        }
    }
}
