public class RemoveDuplicate {
    public static void main(String[] args){
        int arr[] = {2, 3, 3, 3, 6, 9, 9};
        int len = arr.length;
        int temp[] = new int[arr.length];
        int j=0;

        for(int i = 0; i < len - 1; i++){
            if(arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[len-1];
        for(int k = 0; k < j; k++){
            System.out.println(temp[k]);
        }
    }
}
