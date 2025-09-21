import java.util.Scanner;
import java.util.Arrays;
public class hi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n]; 
        for (int index = 0; index < arr.length; index++) {
            arr[index]= sc.nextInt();
        } // [16 17 4 3 5 2]
        
        int max  = arr[0];
        int i,temp=0,tempval=0,temp2 = 0;
        for( i=1; i<n;i++){
            if (max<arr[i]) {
                temp = i;
                tempval = arr[i];
            }
            for (int j = temp2; j < temp; j++) {
                arr[j] = tempval;
            }
            temp2 = temp+1;
            max = arr[temp+1];
        }
        arr[n-1] = -1;
        System.out.println(Arrays.toString(arr));
    }
}
