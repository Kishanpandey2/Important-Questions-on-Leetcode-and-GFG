class Solution
{
    public int isNegativeWeightCycle(int n, int[][] edges)
    {
      
        int []distance = new int[n] ;
        Arrays.fill(distance, Integer.MAX_VALUE) ;
        distance[0] = 0 ;
        for(int count = 1;count<n;count++)
        {
            for(int i = 0 ;i<edges.length ;i++)
            {
                int source  = edges[i][0] ;
                int destination  = edges[i][1] ;
                int weight  = edges[i][2] ;
                if(distance[source]!=Integer.MAX_VALUE && distance[source]+weight < distance[destination])
                distance[destination ]= distance[source]+weight ;
            }
        }
         for(int i = 0 ;i<edges.length ;i++)
            {
                int source  = edges[i][0] ;
                int destination  = edges[i][1] ;
                int weight  = edges[i][2] ;
                if(distance[source]!=Integer.MAX_VALUE && distance[source]+weight < distance[destination])
                return 1 ;
            }
            return 0;
    }
}

Expected Time Complexity: O(n*m)
Expected Space Compelxity: O(n)
