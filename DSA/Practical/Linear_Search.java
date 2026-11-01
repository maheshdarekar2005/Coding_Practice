public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {32,43,64,65,3,2,67,43,465};
        Linear_Search l = new Linear_Search();
        System.out.println(l.linearsearch(arr, 43));
    }
    boolean linearsearch(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return true;
            }
        }
        return false;
    }
}
