class CaptainDisputeAgain26{

    public int findMin(int[] triple)
    {
        int min = triple[0];
        for(int i=1; i<triple.length; i++){
            min = Integer.min(min, triple[i]);


        }

        return min;
    }


    public static void main(String[] args)
    {
        CaptainDisputeAgain26 dispute = new CaptainDisputeAgain26();
        System.out.println(dispute.findMin(new int[] {1, 10, 3}));

    }
}