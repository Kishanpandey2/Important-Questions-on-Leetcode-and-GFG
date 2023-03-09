static final int ALPHABET_SIZE = 26;

    // trie node
    static class TrieNode {
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];

        // isEndOfWord is true if the node represents
        // end of a word
        boolean isEndOfWord;

        TrieNode() {
            isEndOfWord = false;
            for (int i = 0; i < ALPHABET_SIZE; i++) children[i] = null;
        }
    };
*/
//Function to insert string into TRIE.
static void insert(TrieNode root, String key) 
{
    TrieNode curNode = root ;
    for(int i = 0 ;i<key.length() ;i++){
        char cur = key.charAt(i) ;
        
        if(curNode.children[cur-'a'] == null){
            TrieNode newNode = new TrieNode() ;
            curNode.children[cur-'a'] = newNode ;
        }
        curNode = curNode.children[cur-'a'] ;
    }
    curNode.isEndOfWord = true ;
}

//Function to use TRIE data structure and search the given string.
static boolean search(TrieNode root, String key)
{
    TrieNode curNode = root ;
    for(int i = 0 ;i<key.length() ;i++){
        char cur = key.charAt(i) ;
        
        if(curNode.children[cur-'a'] == null){
            return false;
        }
        curNode = curNode.children[cur-'a'] ;
    }
    return curNode.isEndOfWord ;
}
