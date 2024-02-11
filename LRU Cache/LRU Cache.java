
class LRUCache
{
    public static Node head = new Node(0,0) , tail = new Node(0,0) ;
    public static Map<Integer,Node>map ;
     public static int cap ;
    //Constructor for initializing the cache capacity with the given value.
    LRUCache(int cap)
    {
        this.cap = cap;
        map = new HashMap<>();
        head.next = tail;
        tail.prev = head;
        //code here
    }

    //Function to return value corresponding to the key.
    public static int get(int key)
    {
        // your code here
        if(map.containsKey(key))
        {
            Node data  = map.get(key) ;
            remove(data) ;
            
            insert(data) ;
            
            return data.value ;
        }
        
        return -1;
    }

    //Function for storing key-value pair.
    public static void set(int key, int value)
    {
        // your code here
        if(map.containsKey(key))
        {
            remove(map.get(key)) ;
        }
        if(cap== map.size())
        remove(tail.prev);
        
        insert(new Node(key,value)) ;
    }
    
    public static void remove(Node node){
        map.remove(node.key);
        
        node.prev.next =node.next ;
        node.next.prev = node.prev ;
    }
    
    public static void insert(Node node){
        map.put(node.key,node);
        
        Node newNode = head.next ;
        head.next = node ;
        node.prev = head;
        newNode.prev = node ;
        node.next = newNode ;
    }
    
    public static class Node{
        Node prev,next ;
        int key,value ;
        
        Node(int key,int value){
            this.key = key ;
            this.value = value ;
        }
    }
}
