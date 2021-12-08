class StreamChecker {
    
    class Trie
    {
        char c;
        boolean islast;
        Trie[] arr;
        
        Trie(char c)
        {
            this.c=c;
            this.islast = false;
            this.arr = new Trie[26];
        }
            
    }
    
    Trie Node;
    String string;

    public StreamChecker(String[] words) {
        
        Node =  new Trie('-');
        for(String str:words)
        {
            String word =  str;
            insert(word,Node);
        }
        
    }
    
    public void insert(String word,Trie root)
    {
        
        Trie prev=root;
       
        for(int i=word.length()-1;i>=0;i--)
        {
            char c= word.charAt(i);
            if(root.arr[c-'a']==null)
            {
                Trie node =  new Trie('-');
                    root.arr[c-'a'] = node;
            }
          
             root  = root.arr[c-'a'];
            
        }
        
        root.islast =true;
    }
    
    public boolean query(char letter) {
        
        string  =  letter + string;
        
        return find(string,Node);
    }
    
    public boolean find(String str,Trie Node)
    {
       for(int i=0;i<str.length();i++)
       {
           char c  =  str.charAt(i);
           if(Node.arr[c-'a']==null)
               return false;
           
           if(Node.arr[c-'a'].islast==true)
               return true;
           
           Node =  Node.arr[c-'a'];
       }
        
        return true;
    }
}

/**
 * Your StreamChecker object will be instantiated and called as such:
 * StreamChecker obj = new StreamChecker(words);
 * boolean param_1 = obj.query(letter);
 */

