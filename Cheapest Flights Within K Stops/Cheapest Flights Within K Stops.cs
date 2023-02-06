public class Solution {
    public int FindCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
    int[] dist = new int[n];
    for (int i = 0; i < n; i++) {
        dist[i] = int.MaxValue;
    }
    dist[src] = 0;
    
    for (int i = 0; i <= k; i++) {
        int[] temp = new int[n];
        Array.Copy(dist, temp, n);
        
        foreach (int[] flight in flights) {
            int from = flight[0];
            int to = flight[1];
            int price = flight[2];
            
            if (dist[from] != int.MaxValue) {
                temp[to] = Math.Min(temp[to], dist[from] + price);
            }
        }
        
        dist = temp;
    }
    
    return dist[dst] == int.MaxValue ? -1 : dist[dst];
}

}