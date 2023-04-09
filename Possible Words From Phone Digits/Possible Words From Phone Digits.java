class Solution
{
    static void words(long num, ArrayList<String> list, String[] options,String curr)
    {
        if(num==0)
        {
            list.add(curr);
        }
        
        long n=num%10;
        int n1=(int)n;
        String s1=options[n1];
        for(int i=0;i<s1.length();i++)
        {
            words(num/10,list,options,curr+s1.charAt(i));
        }
        
    }
    static ArrayList <String> possibleWords(int a[], int N)
    {
           ArrayList<String> list=new ArrayList<>();
           String options[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
           long num=0;
           for(int i=N-1;i>=0;i--)
            num=num*10+a[i];
              String curr="";
          words(num,list,options,curr);
          return list;
            
    }
}
