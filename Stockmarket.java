public class Stockmarket {
    public static int Stock(int stocks[]) {
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        
        for (int i = 0; i < stocks.length; i++) {
            if(buyPrice<stocks[i]){
                int profit=stocks[i]-buyPrice;
                maxProfit=Math.max(maxProfit, profit);
                
            }
            else{
                buyPrice=stocks[i];

            }
            
        }
        return maxProfit;
        
    }
    public static void main(String[] args) {
        int stocks[]={7,1,5,3,6,4};
        System.out.println(Stock(stocks));
    }
    
}
