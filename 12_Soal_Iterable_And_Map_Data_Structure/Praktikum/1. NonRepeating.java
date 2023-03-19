public class App{
    public static void main(String[] args){
        int[] arr={7,6,5,2,3,7,5,2};
        for (int i=0; i<arr.length; i++){
            int x=arr[i];
            int count=0;
            for (int j=0; j<arr.length; j++){
                if(arr[j] == x){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(arr[i]);
            }
        }
    }
}
