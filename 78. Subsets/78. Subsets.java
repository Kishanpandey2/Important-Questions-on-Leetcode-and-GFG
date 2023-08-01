// Method 1 : Using Iterative approach 
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>  ans = new ArrayList<>() ;
        ans.add(new ArrayList<>()) ;

        for(int no :nums){
            int n = ans.size();
            for(int i = 0;i<n;i++){
            List<Integer>temp = new ArrayList<>(ans.get(i)) ;
            temp.add(no) ;
            ans.add(temp);
            }
        }
        return ans;
    }
}

// Method 2 : Using BackTracking 
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>>  ans = new ArrayList<>() ;
        combination(0,nums,new ArrayList<>() , ans) ;
        return ans;
    }
    private void combination(int start , int []nums , List<Integer>cur,List<List<Integer>>ans){
        
            ans.add(new ArrayList(cur)) ; 

          for(int i = start;i<nums.length;i++)
        {
            cur.add(nums[i]) ;
            combination(i+1,nums,cur,ans) ;
            cur.remove(cur.size()-1);
        }
    }
}
