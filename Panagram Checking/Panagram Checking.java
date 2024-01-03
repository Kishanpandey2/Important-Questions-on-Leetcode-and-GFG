class Solution
{
    public static boolean checkPangram  (String str) {
        int []freq = new int[26] ;
        
        for(char ch : str.toCharArray())
        {if(ch>='a' && ch<='z')
        freq[ch-'a']++;
        else if(ch>='A' && ch<='Z')
        freq[ch-'A']++ ;
        }
        
        for(int i: freq)
        if(i==0)return false;
        
        return true;
    }
}
