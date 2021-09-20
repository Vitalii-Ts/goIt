import java.util.*;
public class HarekDataMaker14 {
    public String aggregateSingle(String name, String age, String planet){
        return "name - " +  name  + ", age - " +  age  + ", planet - " + planet;
    }
    public String[] aggregateAll(String[] names, int[] ages, String[] planets){
        String[] results = new String[3];
        results[0] = aggregateSingle(names[0], String.valueOf(ages[0]), planets[0]);
        results[1] = aggregateSingle(names[1], String.valueOf(ages[1]), planets[1]);
        results[2] = aggregateSingle(names[2], String.valueOf(ages[2]), planets[2]);
        return  results;
    }
}