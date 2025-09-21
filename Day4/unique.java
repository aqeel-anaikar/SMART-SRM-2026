public class unique {
    public static boolean uniqueOccurrences(int[] arr) 
    {
        int max = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int arr1[] = new int[max+1];

        for(int i = 0 ;i<arr.length;i++){
         
            arr1[ arr[i] ]++;
        }
        int flag =1;
        for(int i = 0 ;i<arr1.length;i++){
            if(arr1[i]!=1 && arr1[i]!=0){
                flag = 0;
            }
        }
        if (flag==0) {
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,5};
        System.out.println(uniqueOccurrences(arr));

    } 

}
