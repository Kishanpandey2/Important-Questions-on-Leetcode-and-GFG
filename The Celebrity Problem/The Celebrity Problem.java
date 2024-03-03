// Naive solution


class Solution
{ 
    
    int celebrity(int M[][], int n)
    {
        int indegree[] = new int[n], outdegree[] =new int[n];
 
        // query for all edges
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x = M[i][j];
 
                // set the degrees
                outdegree[i] += x;
                indegree[j] += x;
            }
        }
 
        // find a person with indegree n-1
        // and out degree 0
        for (int i = 0; i < n; i++)
            if (indegree[i] == n - 1 && outdegree[i] == 0)
                return i;
 
        return -1;
    }
}











// Efficient solution



class Solution
{ 
    
    int celebrity(int M[][], int n)
    {
       Deque<Integer>st = new ArrayDeque<>() ;
       
       for(int i = 0 ;i<n;i++)st.push(i);
       
       while(st.size()>=2)
       {
           int i = st.pop() ;
           int j = st.pop() ;
           
           if(M[i][j] == 1)st.push(j);
           else st.push(i);
       }
       
       int ind = st.pop();
       
       for(int i = 0 ;i<n;i++){
           if(i != ind){
           if(M[i][ind] == 0 || M[ind][i] == 1)return -1;}
       }
       
       return ind;
    }
}
