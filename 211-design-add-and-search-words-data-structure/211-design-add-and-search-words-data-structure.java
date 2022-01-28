class WordDictionary {

    /** Initialize your data structure here. */
    
    class Node
    {
        int val;
        Node[] arr;
        
        Node(int val)
        {
            this.val = val;
            this.arr = new Node[26];
        }
    }
    
    
    Node root;
    public WordDictionary() {
        root=null;
    }
    
    public void addWord(String word) {
        if(root==null)
            root =  new Node(-1);
        Node node =  root;
    
        for(int i=0;i<word.length();i++)
        {
            Node m =  node.arr[word.charAt(i)-'a'];
            if(m==null)
                node.arr[word.charAt(i)-'a'] = new Node(0);
            node = node.arr[word.charAt(i)-'a'];
        }
        
        node.val = 1;
        
    }
    
    public boolean search(String word) {
        
        Node node = root;
        return find(word,0,node);
        
    }
    public boolean find(String word,int i,Node node)
    {
        if(node==null)
            return false;
        
        if(i==word.length())
        {
            if(node.val==1)
            return true;
            
            return false;
        }
        
      
        if(word.charAt(i)!='.')
        {
            return find(word,i+1,node.arr[word.charAt(i)-'a']);
        }
        
        for(int j=0;j<26;j++)
        {
            if(find(word,i+1,node.arr[j])==true)
                return true;
        }
        
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */