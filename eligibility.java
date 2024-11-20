import java.util.*;

public class eligibility {

    public static String age(int n){
        if (n>18) {
            return "eligible to vote";
            
        } else {
            return "not eligible to vote";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int n = sc.nextInt();
        sc.close();
        String result = age(n);
        System.out.println(result);

    }
}