import java.util.*;

public class UberShop30 {
    public void printPrices(float[] prices) {
        for(float price: prices) {
            System.out.println(price + " jup.");
        }
    }

    public void multiplyPrices(float[] prices) {
        for(int i = 0; i < prices.length; i++) {
            float price = prices[i];

            if (price < 1000) {
                price *= 2f;
            } else {
                price *= 1.5f;
            }

            prices[i] = price;
        }
    }
    public int[] findMinMaxPrices(int[] prices) {


        Arrays.sort(prices);
        if(prices.length == 0){
            return new int[]{};
        }
        int a = (int) prices[0];
        int b = (int) prices[prices.length -1];
        int[] finalPrice = new int[2];


        if(a == b){
            return finalPrice = new int[]{a};
        }
        else{
            return finalPrice = new int[]{a, b};
        }

    }

    //Test output
    public static void main(String[] args) {
        UberShop30 shop = new UberShop30();

        //Should be [50, 1500]
        int[] prices = new int[] {100, 1500, 300, 50};
        int[] minMax = shop.findMinMaxPrices(prices);
        System.out.println(Arrays.toString(minMax));
    }

}