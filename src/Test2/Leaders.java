package Test2;

public class Leaders {
    public static void leaders(int[] input) {
        int i;
        int j;
        for(i=0;i<input.length-1;i++){
            for(j=i+1;j<input.length;j++){
                if(input[i]<input[j]){
                    break;
                }
            }
            if(j==input.length){
                System.out.print(input[i]+" ");
            }
        }
        System.out.print(input[input.length-1]);
    }
    public static void main(String[] args) {
        int[] arr = {4,7,8,9,1,2};
        leaders(arr);
    }
}
