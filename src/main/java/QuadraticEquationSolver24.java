import java.util.*;
import java.lang.*;
public class QuadraticEquationSolver24{
    public double[] solve(int a, int b, int c){
        double discr = (b * b) - (4 * a * c);
        double x1 = (Math.sqrt(discr) - b)/(2 * a);
        double x2 = (-1)*((b + Math.sqrt(discr))/(2*a));
        double[] arrayList = {x1, x2};
        double[] arrayList1 = new double[0];
        double[] arrayList2 = {x1};
        if(discr == 0){
            return arrayList2;
        }
        else if (discr >= 0) {
            return arrayList;
        }
        else{
            return arrayList1;
        }
    }
    public static void main(String[] args){
        double[] results = new QuadraticEquationSolver24().solve(2, 12, 35);
        System.out.println(Arrays.toString(results));
    }
}