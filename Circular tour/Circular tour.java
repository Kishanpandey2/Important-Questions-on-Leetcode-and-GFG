
class Solution
{

    int tour(int petrol[], int distance[])
    {
	int extraFuel = 0 , required = 0, ind = 0 ;
	
	for(int i = 0 ;i<petrol.length;i++){
	    extraFuel += (petrol[i]-distance[i]) ;
	    
	    if(extraFuel <0)
	    {
	        required += extraFuel  ;
	        ind = i+1 ;
	        extraFuel = 0 ;
	    }
	}
	
	if(extraFuel + required >=0)return ind ;
	
	return -1;
    }
}
