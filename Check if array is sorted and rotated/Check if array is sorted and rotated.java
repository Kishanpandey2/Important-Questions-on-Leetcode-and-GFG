class Solution{    
     
  public static boolean checkRotatedAndSorted(int arr[], int num){
        
         if(increasing(arr,num))
            return true;
        else if(decreasing(arr,num))
            return true;
        return false;
    }
        
        
        static boolean increasing(int arr[], int num){
            int x = 0, y = 0;
        
            for (int i = 1; i < num; i++) {
                if (arr[i] > arr[i - 1])
                    x++;
                else
                    y++;
                }
            if(y == 1){
                if (arr[num - 1] < arr[0])
                    x++;
                else
                    y++;
        
        
                if(y==1)
                    return true;
        
    }
    return false;
        }
        
        
    static boolean decreasing(int arr[], int num){
        int a = 0 , b = 0;
        
        for(int i = 1; i < num; i++){
            if(arr[i] < arr[i-1])
                a++;
            else
                b++;
        }
        
        if(b == 1){
            if(arr[0] < arr[num-1])
                a++;
            else
                b++;
        
            if(b==1)
                return true;
                
        }
        return false;
    }

}
