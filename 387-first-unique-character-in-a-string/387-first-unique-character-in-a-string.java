class Solution {
    public int firstUniqChar(String s) {
   
       char[] arr =  s.toCharArray();
      
        
       int[] occ = new int[26];
        
         Arrays.fill(occ,-1);

        for(int i=0;i<arr.length;i++)
        {
           if(occ[arr[i]-'a']==-1)
            occ[arr[i]-'a']=i;
            else
            occ[arr[i]-'a']=-2;
        }
        
        for(int i=0;i<arr.length;i++)
            if(occ[arr[i]-'a']>=0)
                return occ[arr[i]-'a'];
        
        return -1;
        
    }
}