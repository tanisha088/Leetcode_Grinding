class Solution {
    public String longestCommonPrefix(String[] strs) {

         if(strs.length==0)
             return "";
    int j=0;
        StringBuilder sb = new StringBuilder("");
        while(true)
        {
            if(j==strs[0].length())
                return sb.toString();
            char m =  strs[0].charAt(j);
        for(int i=1;i<strs.length;i++)
        {
          if(j==strs[i].length() || strs[i].charAt(j)!=m)
              return sb.toString();
        }
            
            j++;
            sb.append(m);
        }
        
       
    }
}