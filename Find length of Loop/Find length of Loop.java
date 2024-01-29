class Solution
{
    
    static int countNodesinLoop(Node head)
    {
     Node s = head , f = head ;
     int cnt = 0 ;
     
     while(f != null && f.next != null)
     {
         s = s.next ; f = f.next.next ;
         
         if(s == f){
             cnt = 1 ;
             s = s.next  ;
             
             while(s != f){
                 s = s.next ;
                 cnt ++;
             }
             
             return cnt; 
         }
     }
     return cnt ;
    }
}
