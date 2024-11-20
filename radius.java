import java.util.*;

public class radius {
   public static float circumference(float r){
    float cir = 2*(float)Math.PI*r;
    
    return cir;
   } 
   public static void main(String[] args) {
    System.out.print("enter radius: ");
    Scanner sc = new Scanner(System.in);
    float r = sc.nextFloat();
    sc.close();
    float cir = circumference(r);
    System.out.println("circumference is "+cir);
   }
   
}
