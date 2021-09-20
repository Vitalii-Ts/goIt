import java.util.Arrays;

public class HarekCity10 {
    public String[] createEmptyNameArray() {
        String[] result = new String[0];
        return result;
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[] {age1, age2, age3, age4};
    }

    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }

    public String firstAndLastTogether(String[] names) {
        return names[0] + " AND " + names[9] + " TOGETHER";
    }

    public void changeElectResult(String[] results) {
        String temp = results[0];
        results[0] = results[results.length - 1];
        results[results.length - 1] = temp;
    }
    public String[] changeElectResultAgain(String[] results){
        String[] y = new String[3];
        System.arraycopy(results,2,y,0,3);
        return y;
    }

    public static void main(String[] args) {
        String[] results = new String[]{"mix", "max", "pex", "fux", "rox"};
        String[] changedResults = new HarekCity10().changeElectResultAgain(results);
        System.out.println(Arrays.toString(changedResults));
    }
}