// Method - 1

/*
class Node {
    int data;
    Node next, arb;

    Node(int d) 
    { 
        data = d;
        next = arb = null; 
        
    }
}*/

class Clone {
    Node copyList(Node head) {
       Map<Node ,Node>map = new HashMap<>() ;
       
       for(Node cur = head ; cur != null ;cur = cur.next){
           map.put(cur, new Node(cur.data)) ;
       }
       
        
       for(Node cur = head ; cur != null ;cur = cur.next){
           Node clone = map.get(cur) ;
           clone.next  = map.get(cur.next) ;
           clone.arb = map.get(cur.arb) ;
       }
       
       return map.get(head);
    }
}




// Method - 2 
/*
class Node {
    int data;
    Node next, arb;

    Node(int d) 
    { 
        data = d;
        next = arb = null; 
        
    }
}*/

class Clone {
    Node copyList(Node head) {
      
      Node cur =head ;
      
      while(cur != null)
      {
          Node next = cur.next;
          cur.next = new Node(cur.data) ;
          cur.next.next =next ;
          cur = next ;
          
      }
      
      for(cur = head ;cur != null ;cur = cur.next.next)
      cur.next.arb = (cur.arb== null)?null : cur.arb.next ;
      
      
      Node clone = head.next ;
      Node h2 = clone ;
      for(cur = head ;cur != null ;cur = cur.next)
      {
          cur.next =cur.next.next ;
          clone.next = (clone.next == null)?null : clone.next.next ;
          
          clone = clone.next ;
      }
      
      return  h2;
      
      
      
    }
}

