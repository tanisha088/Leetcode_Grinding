class Trie {

    class Node
    {
        char value;
        Node[] child;
        boolean islast;
        
        Node(char v)
        {
            this.value=v;
            this.child= new Node[26]; 
            islast = false;
        }
    }
    
    Node root = null;
    
    /** Initialize your data structure here. */
    public Trie() {
        
        root = new Node('#');
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        
        Node node = root;
        int i=0;
        while(i<word.length())
        {
            int val =  word.charAt(i)-'a';
            if(node.child[val]==null)
            {
                node.child[val] =new Node(word.charAt(i));
            }
            
            i++;
            node  =  node.child[val];
            
            if(i==word.length())
                node.islast = true;
        }
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        
        int i=0;
        Node node = root;
        while(i<word.length())
        {
            int  c  = word.charAt(i)-'a';
            if(node.child[c]==null)
                return false;
            
            node = node.child[c];
            i++;
        }
        
        return (node.islast==true);
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
         int i=0;
        Node node = root;
        while(i<prefix.length())
        {
            int  c  = prefix.charAt(i)-'a';
            if(node.child[c]==null)
                return false;
            
            node = node.child[c];
            i++;
        }
        
        return true;
                
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */