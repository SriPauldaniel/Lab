import java.util.*;
public class Lab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i=0;i<3;i++) {
            arr[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int res = 0,dif = 999999999;
        for(int i=0;i<3;i++) {
            if(n < arr[i]) {
                if(dif > arr[i] - n) {
                    dif = arr[i]-n;
                    res = i;
                }
            }
        }
        res += 1;
        System.out.println("L"+res);
        sc.close();
    }
}
