class Solution {
    
          

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set= new HashSet<String>();
      ArrayList<String> res = new ArrayList<String>();
        
        HashMap<String,Integer> distance= new HashMap<>();
        
        wordLadder(beginWord,endWord,wordList,distance);
        System.out.println(distance);
          List<List<String>> result = new ArrayList<List<String>>();
        dfs(beginWord,endWord,distance,set, res,result);
        
        return result;
    }
    
    public void wordLadder(String beginWord, String endWord, List<String> wordList,HashMap<String,Integer> distance)
    {
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

                if(!distance.containsKey(a))
                distance.put(a,ans);
        //  System.out.println(a);
           // if(a.equals(endWord))
             //   return ans;
      
            char[] charray= a.toCharArray();
            for(int i=0;i<a.length();i++)
            {
              char orig=  charray[i];
                for(int j=0;j<26;j++)
                {
                   
                    charray[i]=(char)(j+'a');
                    String s1 = String.valueOf(charray);
                    // String s1 = new String(charray);
                    
                 //   System.out.println(s1);
                    if(!wordlists.contains(s1))
                        continue;
                        
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
        
    }
    
    public void dfs(String begin,String end,HashMap<String,Integer> distance,HashSet<String> set,ArrayList<String> res,List<List<String>> result)
    {
 //    set.add(begin);
  res.add(begin);
//System.out.println(res+" "+begin+" "+end+" "+begin.equals(end)+" "+result);
        if(begin.equals(end))
        {
          
            result.add(new ArrayList<String>(res));
        
        }
        else
        {
         char[] charray= begin.toCharArray();
            for(int i=0;i<begin.length();i++)
            {
              char orig=  charray[i];
                for(int j=0;j<26;j++)
                {
                   
                    charray[i]=(char)(j+'a');
                    String s1 = String.valueOf(charray);
                    // String s1 = new String(charray);
                    
             //   System.out.println(s1+" "+begin+" "+dis);
                    if(!distance.containsKey(s1) || (distance.get(s1)!=distance.get(begin)+1))
                        continue;
                     
            //       System.out.println(res+" "+s1);
         //       res.add(s1);
              //      System.out.println(res);
           //  set.add(s1);
                    dfs(s1,end,distance,set,res,result);
                    
                }
                
                charray[i]=orig;
            }
        }
        res.remove(res.size()-1);
        
      //   System.out.println("RESULT-=->"+" "+result);
    }
}