import java.util.Arrays;

public class Heap_Sort {
    public static void main(String[] args) {
        int[] arr = {32,34,42,23,42,23,23,34,23,23};
        System.out.println(Arrays.toString(heapsory(arr)));
    }
    static int[] heapsory(int[] arr){
        int i,j,pc;
        for( i=arr.length-1;i>=0;i--){
            for( j= 0;j<=i;j++){
                pc = j;
                while(pc>0){
                    if(arr[pc]>arr[pc/2]){
                        int temp = arr[pc];
                        arr[pc] = arr[pc/2];
                        arr[pc/2] = temp;
                        pc = pc/2;
                    }
                    else{
                        break;
                    }
                }
            }
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
        }
        return arr;
    }
}
