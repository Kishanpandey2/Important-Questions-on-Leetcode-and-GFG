
class Solution 
{ 
	static boolean search(int matrix[][], int n, int m, int x) 
	{  
	    int row = 0 , col = m - 1 ;
	    
	    while(row<n && col>=0 ){
	        if(matrix[row][col]== x)return true ;
	        else if(x>matrix[row][col] )
	        row++ ;
	        else
	        col-- ;
	    }
	    return false;
	} 
} 
