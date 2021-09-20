class Solution {
    public int maxProduct(String[] words) {
        
        int[] res = new int[words.length];
        int i=0;
        for(String str:words)
        {
            char[] arr = new char[26];
            for(char c:str.toCharArray())
                arr[c-'a']=1;
            
            int ans=0;
            
            for(int j=0;j<arr.length;j++)
            {
            if(arr[j]!=0)
                 ans = ans | 1 ;
             ans= ans <<1;
            }
            
            res[i]  = ans;
            
            i++;
        }
        int ans=0;
        for(i=0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                int a =  res[i] & res[j] ;
                
                if(a==0)
                  ans =  Math.max(words[i].length() * words[j].length(),ans); 
            }
        }
        
        return ans;
        
    }
}

