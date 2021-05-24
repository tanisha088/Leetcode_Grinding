class Solution {
    public int minMutation(String beginWord, String endWord, String[] bank) {
         LinkedList<String> list= new LinkedList<String>();
     HashSet<String> wordlists= new HashSet<String>();
        
        for(int i=0;i<bank.length;i++)
            wordlists.add(bank[i]);
        
        list.add(beginWord);
        HashSet<String> set= new HashSet<String>();
        int ans=0;
        while(!list.isEmpty())
        {
            int s = list.size();
              ans++;
            while(s!=0)
            {
            String a = list.remove();
        //  System.out.println(a);
            if(a.equals(endWord))
                return ans;
      
            char[] charray= a.toCharArray();
                char[] arr= new char[]{'A','C','G','T'};
            for(int i=0;i<a.length();i++)
            {
              char orig=  charray[i];
                for(int j=0;j<4;j++)
                {
                   
                    charray[i]=arr[j];
                    String s1 = String.valueOf(charray);
                    // String s1 = new String(charray);
                    
                   
                 //   System.out.println(s1);
                    if(!wordlists.contains(s1))
                        continue;
                        
                     if(s1.equals(endWord))
                        return ans;
                    
                    
                    if(!set.contains(s1))
                    list.add(s1);
                    set.add(s1);
                
                }
                
                charray[i]=orig;
            }
                s--;
            }
    //        System.out.println("(((((((())))))))");
                
            
        }
        
        return -1;
    }
}