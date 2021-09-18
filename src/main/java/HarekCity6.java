import java.util.*;

public class HarekCity6 {

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        int[] ageArray = {age1, age2, age3, age4};
        return ageArray;
    }
        public static void main (String[] args) {
            int[] ageArray = new HarekCity6().createAgeArray(10, 20, 30, 40);
            System.out.println(Arrays.toString(ageArray));
        }
    }