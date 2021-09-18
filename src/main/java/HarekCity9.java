import java.util.*;

public class HarekCity9 {
    public String[] createEmptyNameArray() {
        String[] result = new String[0];
        return result;
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[]{age1, age2, age3, age4};
    }

    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }

    public String firstAndLastTogether(String[] names) {
        return names[0] + " AND " + names[9] + " TOGETHER";
    }

    public static void main(String[] args) {
        String[] results = new String[]{"miho", "hut"};
        new HarekCity9().changeElectResult(results);
        System.out.println(Arrays.toString(results));
    }
    public void changeElectResult(String[] results){
        String x = results[0];
        results[0] = results[results.length - 1];
        results[results.length - 1] = x;
    }
}