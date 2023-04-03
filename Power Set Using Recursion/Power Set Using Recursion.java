class LexSort
{
    
    static ArrayList<String> powerSet(String s)
    {
         ArrayList<String> ans = new ArrayList<>() ;
         powerSet(s,0,"",ans);
         return ans;
        
    }
   static void powerSet(String s,int i,String cur, ArrayList<String> ans){
        if(i == s.length())
        {
           
            ans.add(cur) ;
           return ;
        }
        powerSet(s,i+1,cur+s.charAt(i),ans);
          powerSet(s,i+1,cur,ans);
    }
}
