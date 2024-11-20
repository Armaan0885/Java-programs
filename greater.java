import java.util.*;

public class greater {
    public static int findGreater(int a, int b){
        if (a>b) {
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int greater = findGreater(a, b);
            sc.close();
            System.out.println("The greater number among the two is: "+greater);
            

        }
    }

