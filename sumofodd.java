import java.util.*;

public class sumofodd {
 public static void sumOdd(int n){
    int sum = 0;
    for (int i = 1; i <= n; i+=2) {
       sum+=i;
    }
        System.out.println("sum is: "+sum);
        return;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        sc.close();
        sumOdd(n);
    }
    
}
