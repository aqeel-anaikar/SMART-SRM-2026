import java.util.Scanner;

public class unique{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lower = sc.nextInt();
        int upper = sc.nextInt();
        int count = 0;
        int temp [] = new int[10];
        // 12 3
        // 10, 12, 13, 14, 15
        for (int i = lower; i <= upper; i++) {
            //10
            //[0 1 2 3 4 5 6 7 8 9]
            // 1 1 
            while (i!=0) {
                temp[i%10]++;
                i/=10;
            }
            int flag = 1;
            for (int j = 0; j < temp.length; j++) {
                if (temp[j]!=0||temp[j]!=1) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                count++;       
            }
        }
        System.out.println(count);
    }
}