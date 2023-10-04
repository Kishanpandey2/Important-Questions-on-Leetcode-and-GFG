// Brute Force solution Using Array
class MyHashMap {
    int []arr ;
    public MyHashMap() {
        arr = new int[1000001] ;
    }
    
    public void put(int key, int value) {
        arr[key]  = value+1 ;
    }
    
    public int get(int key) {
        return arr[key]-1 ;
    }
    
    public void remove(int key) {
        arr[key] = 0 ;
    }
}


// Efficient solution 
class MyHashMap {
    LinkedList<Point>[]map  ;
    static int SIZE = 769 ;
    public MyHashMap() {
        map = new LinkedList[SIZE] ;
    }
    
    public void put(int key, int value) {
        int length = key % SIZE ;
        if(map[length] == null){
            map[length] = new LinkedList<>() ;
            map[length].add(new Point(key,value)) ;
        }
        else
        {
            for(Point p : map[length])
            if(p.key == key)
            {
                p.value = value ; return  ;
            }

            map[length].add(new Point(key,value)) ;
        }
    }
    
    public int get(int key) {
        int length = key % SIZE ;
        LinkedList<Point> p = map[length] ;
        
        if(p == null)return -1 ;

        for(Point temp : p )
        if(temp.key == key)return temp.value ;

        return -1 ;
    }
    
    public void remove(int key) {
        int length = key%SIZE ;

        Point toRemove = null ;

        if(map[length]== null)return ;
        else
        {
            for(Point p : map[length])
            {
                if(p.key == key)
                toRemove= p ;
            }

        }

        if(toRemove == null)return ;

        map[length].remove(toRemove) ;
    }
}

class Point{
    int key , value ;
    Point(int key,int value){
        this.key = key ;
        this.value = value ;
    }
}
