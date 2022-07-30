class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        
        int[] w2 = new int[26];
        
        for(int i=0;i<words2.length;i++)
        {
            String ww2 = words2[i];
            int[] each = new int[26];
            for(char c:ww2.toCharArray())
            {
                each[c-'a']+=1;
                w2[c-'a']=Math.max(each[c-'a'],w2[c-'a']);
            }
        }
        
        List<String> ll = new ArrayList();
        
        for(int i=0;i<words1.length;i++)
        {
            String ww1 = words1[i];
            int[] each = new int[26];
            for(char c:ww1.toCharArray())
            {
                each[c-'a']+=1;
            }
            
            boolean f1  =  false;
            for(int j=0;j<26;j++)
                if(each[j]<w2[j])
                {
                    f1 = true;
                    break;
                }
            
            if(f1)
                continue;
            
            ll.add(words1[i]);
        }
        
        return ll;
    
    }
}