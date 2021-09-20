import java.util.*;

public class HarekCity13 {

    public String[] makeCopy(String[] names){
        String[] copy = Arrays.copyOf(names, names.length);
        System.out.println("Copied!");
        return copy;
    }

    public static void main(String[] args) {
        String[] source = new String[] {"Hero", "Mihu"};
        String[] copy = new HarekCity13().makeCopy(source);

        source[0] = "CHANGED!"; //Мы меняем исходный массив, но на копии это не отображается

        System.out.println(Arrays.toString(copy));
    }
}