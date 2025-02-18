package TaylorSeries;
import java.util.Scanner;
import java.lang.Math;
public class PiApproximation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 0;
        for(int i = 0; i < 2147483647; i++)
        {
           pi += 4 * Math.pow(-1, i) / (2*i+1);
        }
        
        System.out.println(pi);
        
    }
    
}
