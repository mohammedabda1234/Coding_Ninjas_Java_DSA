package Recurion1;

public class Find {
    public static int firstIndex(int[] arr ,int start ,int end,int num) {

        if(start > end){
            return -1;
        }
        if(arr[start]==num) {
            return start;
        }
        return firstIndex(arr, start+1, end, num);
    }
    public static int firstIndex(int[] arr,int num) {
        return firstIndex(arr, 0, arr.length-1, num);
    }
    public static int lastIndex(int[] arr,int x,int si){
        if (si == arr.length ){
            return -1;
        }
        int k = lastIndex(arr,x,si +1);
        if (k != -1){
            return k;
        }
        else {
            if (arr[si] == x){
                return si;
            }else
                return -1;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,7,8,9,3,2,1,4,5,6,7};
        System.out.println(firstIndex(arr,7));
        System.out.println(lastIndex(arr,7,0));
    }
}
