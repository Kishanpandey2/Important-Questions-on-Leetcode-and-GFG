class GfG
{
   
	int find(int A[],int x)
        {
         
           if(x == A[x])
        return x;
    return A[x] = find(A, A[x]);
	}
	void unionSet(int A[],int X,int Z)
        {
         //add code here.
        
         int xRoot = find(A,X) ;
         int yRoot = find(A,Z) ;
         if(xRoot == yRoot)
         return  ;
        else
         A[xRoot]=yRoot ;
         
	}
}
