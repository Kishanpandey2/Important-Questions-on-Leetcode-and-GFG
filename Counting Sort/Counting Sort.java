
class Solution
{
    
    public static String countSort(String arr)
    {
       int []count = new int[26] ;
       for(char ch : arr.toCharArray())
       count[ch-'a']++ ;
       
       char []output = new char[arr.length()] ;
       int i = 0, k = 0 ;
       
       for(int i = 1;i<26;i++)
       count[i] = count[i]+count[i-1] ;
       
       for(int i = arr.length()-1;i>=0 ;i++)
       {
           output[count[arr[i]]-1] = (char )(97+arr[i])
       }
       
       return new String(output) ;
       
    }
}
