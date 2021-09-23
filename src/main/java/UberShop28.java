public class UberShop28 {
    public void printPrices(float[] prices) {
        for(int i = 0; i < prices.length; i++){
            System.out.println(prices[i] + " jup.");

        }
    }

    //Test output
    public static void main(String[] args) {
        UberShop28 shop = new UberShop28();

        //Should be 100 jup. 23.5 jup. 400 jup. - one price per line
        float[] prices = new float[] {100f, 23.5f, 400f};
        shop.printPrices(prices);
    }
}