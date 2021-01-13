//787. Cheapest Flights Within K Stops
// Difficulty : Medium
// Comment : Almost get a goal.. (Key : int[n] tmp = dp.clone())
// url : https://leetcode.com/problems/cheapest-flights-within-k-stops/
import java.util.*;
class CheapestFlightsWithinKStops_catogory {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        for(int i=0 ; i<=K ; i++) {
            int[] tmp = dp.clone();
            for(int j=0 ; j<flights.length ; j++) {
                int fromCity = flights[j][0], toCity = flights[j][1];
                if(i==0) {
                    if(fromCity==src) dp[toCity] = Math.min(dp[toCity], flights[j][2]);        
                } else {
                    if(tmp[fromCity]!=Integer.MAX_VALUE) dp[toCity] = Math.min(dp[toCity], tmp[fromCity]+flights[j][2]);   
                }
            }            
        }
        return dp[dst]==Integer.MAX_VALUE?-1:dp[dst];
    }
}