class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        LinkedList<String> list= new LinkedList<String>();
     HashSet<String> wordlists= new HashSet<>(wordList);
        
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
      
//             char[] charray= a.toCharArray();
//             for(int i=0;i<a.length();i++)
//             {
//               char orig=  charray[i];
//                 for(int j=0;j<26;j++)
//                 {
                   
//                     charray[i]=(char)(j+'a');
//                     String s1 = String.valueOf(charray);
//                     // String s1 = new String(charray);
                    
//                  //   System.out.println(s1);
//                     if(!wordlists.contains(s1))
//                         continue;
                        
//                     if(!set.contains(s1))
//                     list.add(s1);
//                     set.add(s1);
                
//                 }
                
//                 charray[i]=orig;
                
                for(int i=0;i<26;i++)
                {
                    for(int j=0;j<a.length();j++)
                    {
                        StringBuilder sb = new StringBuilder(a);
                        
                        sb.replace(j,j+1,(""+(char)(i+'a')));
                        
                        String k1 = sb.toString();
                        if(wordlists.contains(k1) && !set.contains(k1))
                            list.add(k1);
                        set.add(k1);
                    }
                }
//    }
                s--;
            }
    //        System.out.println("(((((((())))))))");
                
            
        }
        
        return 0;
    }
}